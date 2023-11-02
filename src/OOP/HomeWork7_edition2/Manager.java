package OOP.HomeWork7_edition2;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Observer {
    private String name;
    private int salary = 40000;

    private JobType jobType1 = JobType.Manager;

    private JobType jobType2 = JobType.Lawyer;

    private JobType jobType3 = JobType.Finance;
    public Manager(String name) {
        this.name = name;
    }
    boolean free = true;

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
        jobTypes.add(jobType3);
        return jobTypes;
    }
}
