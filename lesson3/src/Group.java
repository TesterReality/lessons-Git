import java.sql.SQLOutput;

public class Group {

    private Student[] studentsArray = new Student[10];
    private String groupName;

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public Group() {
        super();
    }

    public void addStudent(Student elem) throws ManyStudentsException {
        boolean isAdd = false;
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null) {
                studentsArray[i] = elem;
                isAdd = true;
                break;
            }
        }
        if (isAdd) {
            System.out.println("Студент " + elem.getName() + " " + elem.getSurname() + " был добавлен в группу " + groupName);
        } else {
            System.out.println("Студента " + elem.getName() + " " + elem.getSurname() + " нельзя добавить в группу " + groupName + " поскольку она заполнена!");
            throw new ManyStudentsException();
        }
    }

    public Student searchStudent(String Surname) {
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i].getSurname().equals(Surname)) {
                System.out.println("Студент " + Surname + " есть в группе " + groupName);
                return studentsArray[i];
            }
        }
        return null;
    }

    public void delStudent(String surname) {
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i].getSurname().equals(surname)) {
                System.out.println("Студент " + studentsArray[i].getSurname() + " был удален из группы " + groupName);
                studentsArray[i] = null;
            }
        }
    }

    private void sort() {
        for (int i = 0; i < studentsArray.length - 1; i++) {
            for (int j = i + 1; j < studentsArray.length; j++) {
                if (compareStudent(studentsArray[i], studentsArray[j]) > 0) {
                    Student temp = studentsArray[i];
                    studentsArray[i] = studentsArray[j];
                    studentsArray[j] = temp;
                }
            }
        }
    }

    private int compareStudent(Student one, Student two) {
        if (one != null && two == null) {
            return 1;
        }
        if (one == null && two != null) {
            return -1;
        }
        if (one == null && two == null) {
            return 0;
        }
        return one.getSurname().compareTo(two.getSurname());

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        String allSrudents = "";
        sort();
        for (int i=0; i<studentsArray.length;i++)
        {
            if(studentsArray[i]!=null)
            allSrudents=allSrudents +"Студент: " + studentsArray[i].getName() + " " + studentsArray[i].getSurname()+ "\n";
        }
        return allSrudents;
    }
}
