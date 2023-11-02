package OOP.HomeWork3;

public class Worker extends Employee {
    public double experience;
    public int rate;

    public Worker(String surname, String name, int age, double experience, int rate) {
        super(surname, name, age);
        this.experience = experience;
        this.rate = rate;
    }

    public Worker(double experience, int rate) {
        this.experience = experience;
        this.rate = rate;
    }

    public Worker() {
    }

    ;

    @Override
    public double calcutaleSalary() {
        return (rate + (experience * 1000));
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; %d лет; Среднемесячный з/п фиксированноая = %dр (ставка: %dр, выслуга лет: %dр)", surname, name, age, Math.round(calcutaleSalary()), rate, Math.round(experience * 1000));
    }
}
