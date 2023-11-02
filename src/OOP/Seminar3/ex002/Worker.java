package OOP.Seminar3.ex002;

public class Worker extends Employee {
    public Worker(String surname, String name, double salary) {
        super(surname, name, salary);
    }

    @Override
    public double calcutaleSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячный з/п фиксированноая = %f", surname, name, calcutaleSalary());
    }
}
