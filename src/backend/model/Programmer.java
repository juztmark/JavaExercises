package backend.model;

public class Programmer extends Job {
    public Programmer(float salary, int bonus, JobType jobType) {
        super(salary, bonus, jobType);
    }

    public String getInfo() {
        return String.format("%s’s salary is %s ", jobType.toString(), salary + bonus);
    }
}
