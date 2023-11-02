package Exceptions.HomeWork3;

public class Sex {
    private SexType sexType;

    public SexType getSex() {
        return sexType;
    }

    public Sex addSex(String word) {
        if (word.equals("f")) {
            this.sexType = SexType.Female;
        }
        else this.sexType = SexType.Male;
        System.out.println(this.sexType);
        return this;
    }

    @Override
    public String toString() {
        String rus = "мужской";
        if (this.sexType == SexType.Female){
            rus = "женский";
        }
        return rus;
    }
}

