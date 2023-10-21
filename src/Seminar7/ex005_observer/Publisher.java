package Seminar7.ex005_observer;

public interface Publisher {

    void sendOffer(String companyName, int salary);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
