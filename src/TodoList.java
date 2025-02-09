import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TodoList {

    public static void main(String[] args) {
        List<String> tasks = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (choice) {
                case 0:
                    System.out.println("Пока!");
                    return;
                case 1:
                    System.out.print("Введите название задачи: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Добавлено!");
                    break;
                case 2:
                    printTasks(tasks);
                    break;
                case 3:
                    System.out.print("Введите номер для удаления: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("Удалено!");
                    } else {
                        System.out.println("Нет дела с таким номером!");
                    }
                    break;
                case 4:
                    System.out.print("Введите задачу для удаления: ");
                    String taskToDelete = scanner.nextLine();
                    if (tasks.remove(taskToDelete)) {
                        System.out.println("Удалено!");
                    } else {
                        System.out.println("Нет дела с таким названием!");
                    }
                    break;
                default:
                    System.out.println("Такой операции нет!");
            }

            // Вывод текущего списка дел после каждой операции
            printTasks(tasks);
        }
    }

    public static void printTasks (List < String > tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Список дел пуст.");
        } else {
            System.out.println("Ваш список дел:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void printMenu () {
        System.out.println("Выберите операцию:");
        System.out.println("0. Выход из программы");
        System.out.println("1. Добавить дело");
        System.out.println("2. Показать дела");
        System.out.println("3. Удалить дело по номеру");
        System.out.println("4. Удалить дело по названию");
        System.out.print("Ваш выбор: ");
    }
}



