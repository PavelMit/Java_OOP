package HomeWork3;

public class ProjectManager extends Employee {

    private int salaryPerProject;
    private int amountOfProjects;

    public ProjectManager(String surname, String name, int age, int salaryPerProject, int amountOfProjects) {
        super(surname, name, age);
        this.salaryPerProject = salaryPerProject;
        this.amountOfProjects = amountOfProjects;
    }

    public ProjectManager(int salaryPerProject, int amountOfProjects) {
        this.salaryPerProject = salaryPerProject;
        this.amountOfProjects = amountOfProjects;
    }

    public ProjectManager() {
    }

    @Override
    public double calcutaleSalary() {
        return salaryPerProject * amountOfProjects;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Проект-менеджер; %d лет; Среднемесячная з/п плавающая = %dр (количество проектов: %d, стоимость проекта:%dр)", surname, name, age, Math.round(calcutaleSalary()), amountOfProjects, salaryPerProject);
    }
}
