package OOP.HomeWork3;

import java.util.Arrays;
import java.util.Random;

//Доработать приложение, которое мы разрабатывали на уроке.
//Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.
//Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
// Формула расчета среднемесячной заработной платы может быть такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
//Переработать метод generateEmployees, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого).
// Метод должен быть один!
//Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
//Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.

public class Program {
    private static Random random = new Random();

    static Employee[] generateEmployees(int count) {
        Employee[] array = new Employee[count];

        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(0, 3);
            int age = random.nextInt(18, 80);
            String[] names = new String[]{"Анатолий", "Иван", "Константин", "Сергей", "Алексей", "Павел", "Григорий", "Никита", "Дмитрий", "Александр"};
            String[] surnames = new String[]{"Иванов", "Митрофанов", "Сергеев", "Сазонов", "Постников", "Иванов", "Никифоров", "Баженов", "Шляпников", "Цыпленов"};
            int rate = random.nextInt(50000, 120000);
            double experience = random.nextDouble(0, 60);
            int workHours = random.nextInt(0, 160);
            int ratePerHour = random.nextInt(500, 1500);
            int salaryPerProject = random.nextInt(10000, 100000);
            int amountOfProjects = random.nextInt(0, 5);


            if (index == 0) {
                array[i] = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, experience, rate);
            } else if (index == 1) {
                array[i] = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, workHours, ratePerHour);
            } else
                array[i] = new ProjectManager(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, salaryPerProject, amountOfProjects);
        }
        return array;
    }
    public static void main(String[] args) {
        Employee[] employees = generateEmployees(15);

        Arrays.sort(employees, new AgeComporator(SortType.Ascending));
        System.out.println("Сортировка по возрастранию по критерию - возраст");
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Сортировка по убыванию по критерию - зарплата");
        Arrays.sort(employees, new SalaryComporator(SortType.Descending));
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
