import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TodoList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            break;
        }
    }

    public static void printMenu() {
        System.out.println("Выберите операцию:");
        System.out.println("0. Выход из программы");
        System.out.println("1. Добавить дело");
        System.out.println("2. Показать дела");
        System.out.println("3. Удалить дело по номеру");
        System.out.println("4. Удалить дело по названию");
        System.out.print("Ваш выбор: ");
    }
}
