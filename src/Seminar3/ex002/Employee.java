package Seminar3.ex002;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String surname;
    protected double salary;

    public Employee(String surname, String name, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    public abstract double calcutaleSalary();

    @Override
    public int compareTo(Employee o) {
       int surNameRes = surname .compareTo(o.surname);
       if (surNameRes == 0) {
           return name . compareTo(o.name);
       }
       return surNameRes;
    }
}
