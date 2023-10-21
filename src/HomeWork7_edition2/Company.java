package HomeWork7_edition2;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private int maxSalary;

    private Publisher jobAgency;


    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee (JobType jobType){
        int salary = random.nextInt(this.maxSalary);
        jobAgency.sendVacancy(this.name, salary, jobType);
    }
}
