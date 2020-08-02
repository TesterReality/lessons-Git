public class Student extends Human {
    private int course;
    private String speciality;

    public Student(String name, String surname, int age, boolean sex, int course, String speciality) {
        super(name, surname, age, sex);
        this.course = course;
        this.speciality = speciality;
    }

    public Student() {
        super();
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Имя " + getName() + "\nФамилия: " + getSurname() + "\nВозраст: " + getAge() + "\nПол:" + isSex() + "\nКурс: " + course + "\nСпециальность: " + speciality;

    }
}
