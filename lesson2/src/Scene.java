public class Scene {

    private Figure[] board = new Figure[5];

    public Scene() {
        super();
    }

    public void add(Figure a, int index) {
        if ((index < board.length) && (board[index] == null)) {
            board[index] = a;
        } else {
            System.out.println("Ошибка добавления!");
        }
    }

    public void deleteByIndex(int index) {
        if ((index >= 0) && (index < board.length) && (board[index] != null)) {
            board[index] = null;
            System.out.println("Фигура удалена");
        } else {
            System.out.println("Ошибка удаления фигуры со сцены!");
        }
    }

    public double getAllFigurePerimeter () {
        double perimeter = 0;
        for (Figure figure : board) {
            if (figure != null) {
                perimeter += figure.getPerimeter();
            }
        }
        return perimeter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                sb.append(((i) + ") " + board[i]));
            } else {
                sb.append((i) + ") " + "Пустая область");
            }
            sb.append(System.lineSeparator());
        }
        sb.append("Общий периметр = " + getAllFigurePerimeter());
        return sb.toString();
    }

}
