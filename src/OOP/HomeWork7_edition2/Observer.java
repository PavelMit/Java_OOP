package OOP.HomeWork7_edition2;

import java.util.List;

public interface Observer {

    List<JobType> getListOfJobType();

    boolean isFree();

    int getSalary();
    String getName();
}
