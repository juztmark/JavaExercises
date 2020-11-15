package backend.model;

public class Driver extends Job {
    public Driver(float salary, int bonus) {
        super(salary, bonus, JobType.DRIVER);
    }
}
