package HomeWork7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface Observer {

    void receiveOffer(Vacancy vacancy);
    List<JobType> getListOfJobType();

    boolean isFree();

}
