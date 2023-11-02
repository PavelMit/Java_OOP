package OOP.Seminar2.ex003;

public class Human extends BaseHuman implements Runner{
    private String name;
    private int maxRun;
    private int maxJump;

    public Human(String name, int maxRun, int maxJump){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }
//    @Override
//    public boolean jump(int height){
//        if (height < maxJump){
//            System.out.printf("%s перепрыгнул через стену %d см.\n", name, height);
//            return true;
//        }
//        else{
//            System.out.printf("%s не перепрыгнул через стену %d см.\n", name, height);
//            return false;
//        }
//    }
//
//    @Override
//    public boolean run(int length) {
//        if (length < maxRun){
//            System.out.printf("%s пробежал трек длиной %d см.\n", name, length);
//            return true;
//        }
//        else{
//            System.out.printf("%s не пробежал трек длиной %d см.\n", name, length);
//            return false;
//        }
//    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
}
