// dev branch for Y.Practicum
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("На скольких человек поделить счёт?");


        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка, введён текст\nВведите числовое значение");
                scanner.nextLine();
            } else {
                int people = scanner.nextInt();

                if (people == 1) {
                    System.out.println("Зачем тебе делить свою еду?\nВведите другое количество");
                }
                if (people < 1) {
                    System.out.println("А положительных друзей у тебя нет?\nВведите положительное число");
                }
                if (people > 1) {
                    System.out.println("Давай считать");
                    GroceryList groceryList = new GroceryList();
                    groceryList.product(people);
                    break;
                }


            }

        }

    }
}
