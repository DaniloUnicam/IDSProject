package Repository;

import Model.Contest;

public class RepositoryContest extends GenericRepository<Contest> {

    private static RepositoryContest instance;

    private RepositoryContest() {
    }

    public static RepositoryContest getInstance() {
        if (instance == null) {
            instance = new RepositoryContest();
        }
        return instance;
    }
}
