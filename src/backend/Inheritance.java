package backend;

import backend.model.*;

import java.util.ArrayList;
import java.util.List;

public class Inheritance {
    public static List<Job> list = new ArrayList<>();

    public static void printInfo() {
        list.add(new Driver(1000, 300, JobType.DRIVER));
        list.add(new Teacher(900, 100, JobType.TEACHER));
        list.add(new Programmer(1700, 200, JobType.PROGRAMMER));

        list.forEach(e -> System.out.println(e.getInfo()));
    }

    public static void printEmployeeService() {
        EmployeeService service = new EmployeeServiceImpl();
        System.out.println(service.getTotalSalary(list));
        System.out.println(service.getTotalBonus(list));
    }
}
