package Repository;

import Model.Contest;

import java.util.HashMap;

public class RepositoryContest extends GenericRepository<Contest> {

    private static RepositoryContest instance;

    private RepositoryContest() {
        super(new HashMap<String, Contest>());
    }

    public static RepositoryContest getInstance() {
        if (instance == null) {
            instance = new RepositoryContest();
        }
        return instance;
    }
}
