public class TodoList {

    public static String[] model = new String[10];

    public static void viewTodoList() {
        for (String todo: model) {
            System.out.println(todo);
        }
    }

    public static void main(String[] args) {
    }
}
