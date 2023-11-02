package OOP.HomeWork3;

public abstract class Employee implements Comparable<Employee> {
    protected String surname;

    protected String name;

    protected int age;

    public Employee(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    protected Employee() {
    }
    public abstract double calcutaleSalary();
    @Override
    public int compareTo(Employee o) {
       int surNameRes = surname .compareTo(o.surname);
       if (surNameRes == 0) {
           return name .compareTo(o.name);
       }
       return surNameRes;
    }
}
