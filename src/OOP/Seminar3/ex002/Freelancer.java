package OOP.Seminar3.ex002;

public class Freelancer extends Employee {
    public Freelancer(String surname, String name, double salary) {
        super(surname, name, salary);
    }

    @Override
    public double calcutaleSalary() {
        return 0;
    }
}
