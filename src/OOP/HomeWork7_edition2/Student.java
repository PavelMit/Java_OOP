package OOP.HomeWork7_edition2;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observer {

    private String name;
    private int salary = 2000;
    boolean free = true;

    private JobType jobType1 = JobType.Service;
    private JobType jobType2 = JobType.Intern;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    @Override
    public int getSalary() {
        return salary;
    }
    @Override
    public List<JobType> getListOfJobType() {
        List<JobType> jobTypes = new ArrayList<JobType>();
        jobTypes.add(jobType1);
        jobTypes.add(jobType2);
        return jobTypes;
    }
}
