package OOP.HomeWork7_edition2;

public interface Publisher {

    void sendVacancy(String name, int salary, JobType jobType);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);


}
