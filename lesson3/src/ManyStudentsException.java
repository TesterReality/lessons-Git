public class ManyStudentsException extends Exception {
    @Override
    public String getMessage() {
        return "Группа заполнена!! Не лезь сюда - оно тебя сожрет!";
    }
}
