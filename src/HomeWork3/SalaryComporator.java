package HomeWork3;

import HomeWork3.Employee;
import HomeWork3.SortType;

import java.util.Comparator;

public class SalaryComporator implements Comparator<Employee> {
    private SortType sortType;

    public SalaryComporator(SortType sortType) {
        this.sortType = sortType;
    }

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (sortType == SortType.Ascending) {
            return Double.compare(o1.calcutaleSalary(), o2.calcutaleSalary());
        } else return Double.compare(o2.calcutaleSalary(), o1.calcutaleSalary());

    }


}