package Repository;

import Model.Contest;

import java.util.HashMap;

public class RepositoryContest extends GenericRepository<Contest> {

    private static RepositoryContest repositoryContest;

    private RepositoryContest() {
        super(new HashMap<String, Contest>());
    }

    public static RepositoryContest getInstance() {
        if (repositoryContest == null) {
            repositoryContest = new RepositoryContest();
        }
        return repositoryContest;
    }
}
