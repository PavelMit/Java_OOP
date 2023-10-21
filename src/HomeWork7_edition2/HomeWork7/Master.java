package HomeWork7_edition2.HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class Master implements Observer {

    private String name;
    private int salary = 80000;
    private JobType jobType1 = JobType.It;
    private JobType jobType2 = JobType.Engineer;
    boolean free = true;
    public Master(String name) {
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
