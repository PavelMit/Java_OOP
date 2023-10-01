package Seminar2.ex003;

public class Program {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat("Барси", 1500, 300),
                new Cat("Персик", 1700, 228),
                new Robot("Rw22", 9999, 450),
                new Robot("C213", 5000, 50),
                new Human("Петя", 2500, 150),
                new Human("Вася", 3500, 328)
        };
        Obstacle[] obstacles = {
                new Track(1300),
                new Track(3000),
                new Track(9000),
                new Wall(21),
                new Wall(200),
                new Wall(400)
        };
        for (Runner runner: runners){
            for (Obstacle obstacle: obstacles){
                if (obstacle instanceof Wall){
                    if(!runner.jump(obstacle.getHeigth())) {
                        break;
                    }
                }
                else if (obstacle instanceof Track){
                    if (!runner.run(obstacle.getLength())){
                        break;
                    }
                }
            }
        }
    }
}
