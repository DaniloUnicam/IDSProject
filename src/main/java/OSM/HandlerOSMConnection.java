package OSM;

import Model.PosizioneSatellitare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class HandlerOSMConnection {

    public static final String OSM_API_URL = "https://api.openstreetmap.org/api/0.6/map";
    public static final String OSM_NOMINATIM_API_URL = "https://nominatim.openstreetmap.org/reverse";
    private final URL urlOsmApi;
    private final Map<String, String> parameters;

    public HandlerOSMConnection() throws MalformedURLException {
        this.urlOsmApi = new URL(OSM_API_URL);
        this.parameters = new HashMap<>();
    }

    public String retrieveOSMData(PosizioneSatellitare angoloBassoSinistra, PosizioneSatellitare angoloAltoDestro) throws IOException {
        return retrieveOSMData(angoloBassoSinistra.getLatitudine(), angoloBassoSinistra.getLongitudine(),
                angoloAltoDestro.getLatitudine(), angoloAltoDestro.getLongitudine());
    }

    public String retrieveOSMData(double left, double bottom, double right, double top) throws IOException {
        parameters.clear();
        parameters.put("bbox", left + "," + bottom + "," + right + "," + top);

        HttpURLConnection connection = (HttpURLConnection) getGETRequestURLFromParameters(urlOsmApi).openConnection();
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);

        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) return getResponse(connection);
        else throw new IOException("HTTP error code: " + connection.getResponseCode());
    }

    private URL getGETRequestURLFromParameters(URL baseUrl) throws UnsupportedEncodingException, MalformedURLException {
        StringBuilder requestURL = new StringBuilder();
        requestURL.append(baseUrl +(parameters.isEmpty() ? "" : "?"));
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            requestURL.append(entry.getKey());
            requestURL.append("=");
            requestURL.append(entry.getValue());
            requestURL.append("&");
        }

        return new URL(requestURL.toString());
    }


    private String getResponse(HttpURLConnection connection) throws IOException {
        StringBuilder response = new StringBuilder();
        try (BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = input.readLine()) != null) {
                response.append(line);
                response.append(System.lineSeparator());
            }
        } finally {
            connection.disconnect();
        }
        return response.toString();
    }
}