package it.cs.unicam.app_Comune.HandlerInformazioneTerritoriale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

@Service
public class HandlerFile {

    @Value("${fileResources.path}")
    private String filePath;

    public void saveFile(MultipartFile file) throws Exception {
        File fileToSave = new File(filePath + file.getName());
        fileToSave.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileToSave);
        fileOutputStream.write(file.getBytes());
        fileOutputStream.close();
    }

}
