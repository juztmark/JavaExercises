package backend.model;

public class Teacher extends Job {
    public Teacher(float salary, int bonus) {
        super(salary, bonus, JobType.TEACHER);
    }
}
