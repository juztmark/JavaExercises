package backend.model;

public enum JobType {
    DRIVER ("Driver"),
    TEACHER ("Teacher"),
    PROGRAMMER ("Programmer")
    ;

    public final String name;

    JobType(String name) {
        this.name = name;
    }
}
