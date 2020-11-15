package backend.model;

public class Programmer extends Job {
    public Programmer(float salary, int bonus) {
        super(salary, bonus, JobType.PROGRAMMER);
    }

    public String getInfo() {
        return String.format("%s’s salary is %s ", jobType.name, salary + bonus);
    }
}
