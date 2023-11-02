package OOP.HomeWork3;

public class Freelancer extends Employee {
    private int workHours;
    private int ratePerHour;

    public Freelancer(String surname, String name, int age, int workHours, int ratePerHour) {
        super(surname, name, age);
        this.workHours = workHours;
        this.ratePerHour = ratePerHour;
    }

    public Freelancer(int workHours, int ratePerHour) {
        this.workHours = workHours;
        this.ratePerHour = ratePerHour;
    }

    public Freelancer(){};

    @Override
    public double calcutaleSalary() {
        return workHours * ratePerHour;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; %d лет; Среднемесячная з/п плавающая = %dр (в месяц %d рабочих часов с оплатой %dр/час)", surname, name, age, Math.round(calcutaleSalary()), workHours, ratePerHour);
    }

//    @Override
//    public Employee addObject() {
//        return new Freelancer();
//    }
}
