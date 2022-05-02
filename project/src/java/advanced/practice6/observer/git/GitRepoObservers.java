package advanced.practice6.observer.git;

public class GitRepoObservers {
    public static Repository newRepository() {
        return new RepositoryImplementation();
    }

    public static WebHook mergeToBranchWebHook(String branchName) {
        return new WebHookImplementation(branchName, Event.Type.MERGE);
    }

    public static WebHook commitToBranchWebHook(String branchName) {
        return new WebHookImplementation(branchName, Event.Type.COMMIT);
    }


}
