public class Main {
    public static void main(String[] args) {

        Group bestGroup = new Group("Фиксики");

        try {
            bestGroup.addStudent(new Student("Петя","Васечкин",20,true,5,"Специальная"));
            bestGroup.addStudent(new Student("Жора","Пупкин",21,true,5,"Очень Специальная"));
            bestGroup.addStudent(new Student("Енакенткий","Васильков",20,true,5,"Лентяй"));
            bestGroup.addStudent( new Student("Анастасия","Пронякина",21,false,5,"Анимешница"));
            bestGroup.addStudent( new Student("Лариса","Викторовна",88,false,5,"Студент"));
            bestGroup.addStudent( new Student("Люда","Людоедова",22,false,5,"Студент"));
            bestGroup.addStudent( new Student("Илон","Максимович",42,true,5,"Марсианин"));
            bestGroup.addStudent( new Student("Джеф","Безонс",44,true,5,"Амазонка"));
            bestGroup.addStudent(new Student("Джеф","Безонас",44,true,5,"Амазонка"));
            bestGroup.addStudent(new Student("Джеф","Безонус",44,true,5,"Амазонка"));
            bestGroup.addStudent(new Student("Джеф","Безонис",44,true,5,"Амазонка"));
        } catch (ManyStudentsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(bestGroup);

        bestGroup.delStudent("Пронякина");
        try {
            bestGroup.addStudent(new Student("Петя","Темных",20,true,5,"Специальная"));
        } catch (ManyStudentsException e) {
            e.printStackTrace();
        }
        System.out.println(bestGroup);

    }
}
