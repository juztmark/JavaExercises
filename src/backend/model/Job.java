package backend.model;

public class Job {
    public float salary;
    public int bonus;
    public JobType jobType;

    public Job(float salary, int bonus, JobType jobType) {
        this.salary = salary;
        this.bonus = bonus;
        this.jobType = jobType;
    }

    public String getInfo() {
        return String.format("%s’s salary is %s and bonus is %d", jobType.name, salary, bonus);
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }
}
