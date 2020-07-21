public class Cat {

    private int age;
    private double weigt;
    private boolean sex;
    private String ration;
    private String name;
    private String type;

    public Cat(int age, double weigt, boolean sex, String ration, String name, String type) {
        this.age = age;
        this.weigt = weigt;
        this.sex = sex;
        this.ration = ration;
        this.name = name;
        this.type = type;
    }

    public void getVoice() {
        System.out.println("МЯУ");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigt() {
        return weigt;
    }

    public void setWeigt(double weigt) {
        this.weigt = weigt;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", weigt=" + weigt +
                ", sex=" + sex +
                ", ration='" + ration + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
