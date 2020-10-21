package backend;

import backend.model.Job;

import java.util.List;

public interface EmployeeService {
    float getTotalSalary(List<Job> list);
    int getTotalBonus(List<Job> list);
}
