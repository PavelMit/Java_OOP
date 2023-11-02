package OOP.HomeWork7;

import java.util.List;

public interface Observer {

    void receiveOffer(Vacancy vacancy);
    List<JobType> getListOfJobType();

    boolean isFree();

}
