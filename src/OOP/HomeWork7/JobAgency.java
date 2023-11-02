package OOP.HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {


    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendVacancy(String companyName, int salary, JobType jobType) {
        Vacancy vacancy = new Vacancy(companyName, salary, jobType);
        for (Observer observer : observers){
            observer.receiveOffer(vacancy);
            if (!observer.isFree()){
                observers.remove(observer);
                System.out.println("Соискатель удален");
                break;
            }
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
