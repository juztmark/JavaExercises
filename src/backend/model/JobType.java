package backend.model;

public enum JobType {
    DRIVER,
    TEACHER,
    PROGRAMMER;

    public String toString() {
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
    }
}
