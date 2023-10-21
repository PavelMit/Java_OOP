package HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observer {

    private String name;
    private int salary = 2000;
    boolean free = true;

    @Override
    public boolean isFree() {
        return free;
    }

    private JobType jobType1 = JobType.Service;
    private JobType jobType2 = JobType.Intern;


    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {

        if (getListOfJobType().contains(vacancy.jobType)) {
            if (this.salary <= vacancy.salary) {
                System.out.printf("Специалист %s: Мне нужна эта работа типа %s! (компания: %s; заработная плата: %d)\n",
                        name, vacancy.jobType, vacancy.company, vacancy.salary);
                this.salary = vacancy.salary;
                this.free = false;
            } else {
                System.out.printf("Специалист %s: Я найду работу получше типа %s! (компания: %s; заработная плата: %d)\n",
                        name, vacancy.jobType, vacancy.company, vacancy.salary);
            }
        }
        else  System.out.printf("Специалист %s: Мне не интересна работа типа %s! (компания: %s; заработная плата: %d)\n",
                name, vacancy.jobType, vacancy.company, vacancy.salary);
    }

    @Override
    public List<JobType> getListOfJobType() {
        List<JobType> jobTypes = new ArrayList<JobType>();
        jobTypes.add(jobType1);
        jobTypes.add(jobType2);
        return jobTypes;
    }
}
