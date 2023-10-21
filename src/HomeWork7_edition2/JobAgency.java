package HomeWork7_edition2;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {


    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendVacancy(String companyName, int salary, JobType jobType) {
        Vacancy vacancy = new Vacancy(companyName, salary, jobType);
        for (Observer observer : observers){
            if (observer.getListOfJobType().contains(jobType)) {
                if (observer.getSalary() <= vacancy.salary) {
                    System.out.printf("Специалист %s: Мне нужна эта работа типа %s! (компания: %s; заработная плата: %d)\n",
                            observer.getName(), vacancy.jobType, vacancy.company, vacancy.salary);
                    observers.remove(observer);
                    System.out.println("Соискатель удален");
                    break;
                }
                else {
                    System.out.printf("Специалист %s: Я найду работу получше типа %s! (компания: %s; заработная плата: %d)\n",
                            observer.getName(), vacancy.jobType, vacancy.company, vacancy.salary);
                }
            }
            else  System.out.printf("Специалист %s: Мне не интересна работа типа %s! (компания: %s; заработная плата: %d)\n",
                    observer.getName(), vacancy.jobType, vacancy.company, vacancy.salary);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
