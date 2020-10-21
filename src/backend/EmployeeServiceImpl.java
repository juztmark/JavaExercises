package backend;

import backend.model.Job;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public float getTotalSalary(List<Job> list) {
        return (float) list.stream().mapToDouble(Job::getSalary).sum();
    }

    @Override
    public int getTotalBonus(List<Job> list) {
        return list.stream().mapToInt(Job::getBonus).sum();
    }
}
