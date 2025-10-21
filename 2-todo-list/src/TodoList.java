import java.util.Objects;
import java.util.Scanner;

public class TodoList {
    public static Scanner scanner = new Scanner(System.in);

    public static String[] model = new String[10];

    public static void main(String[] args) {
        init();
    }

    public static boolean validate(String condition) {
        return switch (condition.toLowerCase()) {
            case "empty" -> {
                for (String s : model) {
                    if (s != null) {
                        yield false;
                    }
                }
                yield true;
            }
            case "full" -> {
                for (String s : model) {
                    if (s == null) {
                        yield false;
                    }
                }
                yield true;
            }
            default -> {
                System.out.println("unknown condition, available: empty, full");
                yield false;
            }
        };
    }


    public static void init() {
        while (true) {
            System.out.println("=== todo list ===");
            view();
            System.out.println("A: add, X: delete");
            System.out.print("Select menu: ");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "a":
                    viewAdd();
                    break;
                case "x":
                    viewDelete();
                    break;
                default:
                    System.out.println("Unknown Command: " + choice);
                    break;
            }
        }
    }

    public static void viewDelete() {
        boolean isEmpty = validate("empty");
        if (isEmpty) {
            System.out.println("you don't have any todos. please add some first.");
            return;
        }

        while (true) {
            try {
                view();
                System.out.print("Insert todo number to be deleted: ");
                int todoNum = Integer.parseInt(scanner.nextLine());

                delete(todoNum);

                break;
            } catch (Exception e) {
                System.out.println("looks like you inputted wrong number, try again.");
            }
        }
    }

    public static void viewAdd() {
        boolean isFull = validate("full");

        if (isFull) {
            System.out.println("Sorry, your todo list is full. please delete some data");
            return;
        }


        while (true) {
            System.out.print("Insert your todos: ");
            String todo = scanner.nextLine();

            if (!Objects.equals(todo, "")) {
                boolean success = add(todo);
                if (success) {
                    System.out.println("✅ todo added successfully.");
                    init();
                    break;
                }
            }

            System.out.println("todo cannot be empty");
        }
    }

    // start CRUD to-do list
    public static boolean add(String todo) {
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                return true;
            }
        }

        return false;
    }

    public static void delete(int id) {
        if (id <= 0 || id > model.length) {
            System.out.println("Invalid ID");
            return;
        }

        int i = id - 1;

        if (model[i] == null) {
            System.out.println("ID is invalid");
            return;
        }

        model[i] = null;
        System.out.printf("✅ todo with id %d is deleted.\n", id);
    }

    public static void view() {
        boolean isEmpty = validate("empty");

        if (isEmpty) {
            System.out.println("You don't have any todos. let's add some");
            return;
        }

        for (int i = 0; i < model.length; i++) {
            if (model[i] != null) {
                System.out.printf("%d. %s\n", i + 1, model[i]);
            }
        }
    }
    // end CRUD to-do list
}
