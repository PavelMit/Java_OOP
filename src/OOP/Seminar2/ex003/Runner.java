package OOP.Seminar2.ex003;

public interface Runner {
    String getName();
    int getMaxJump();
    int getMaxRun();
    default boolean jump(int height)
    {
        if (height < getMaxJump()){
            System.out.printf("%s перепрыгнул через стену %d см.\n", getName(), height);
            return true;
        }
        else{
            System.out.printf("%s не перепрыгнул через стену %d см.\n", getName(), height);
            return false;
        }
    }
    default boolean run(int length){
        if (length < getMaxRun()){
            System.out.printf("%s пробежал трек длиной %d см.\n", getName(), length);
            return true;
        }
        else{
            System.out.printf("%s не пробежал трек длиной %d см.\n", getName(), length);
            return false;
        }
    }


}
