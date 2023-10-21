package HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class Master implements Observer {

    private String name;
    private int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    private JobType jobType1 = JobType.It;
    private JobType jobType2 = JobType.Engineer;
    boolean free = true;

    @Override
    public boolean isFree() {
        return free;
    }

    @Override
    public List<JobType> getListOfJobType() {
        List<JobType> jobTypes = new ArrayList<JobType>();
        jobTypes.add(jobType1);
        jobTypes.add(jobType2);
        return jobTypes;
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
}
