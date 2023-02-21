import java.util.Scanner;

public class GroceryList {
    public static void product(int people) {
        double sum = 0.0;
        String Products = ("Добавленные товары:");
        String rub = null;

        while (true) {
            Scanner NameProduct = new Scanner(System.in);
            System.out.println("Введите название товара");
            String name = NameProduct.nextLine();

            Scanner PriceProduct = new Scanner(System.in);
            System.out.println("Введите стоимость товара");


            while(true) {
                double price = PriceProduct.nextDouble();

                if (price < 0){
                    System.out.println("Ошибка, отрицательное значение\nВведите положительное значение");
                }

                if (price > 0) {
                    Products = Products + "\n" + name + " по цене " + price;
                    sum = sum + price;

                    System.out.println("Товар успешно добавлен");
                    break;
                }
            }
            Scanner Answer = new Scanner(System.in);
            System.out.println("Хотите добавить ещё один товар?");
            String answer = Answer.nextLine();


            if (answer.equalsIgnoreCase("Завершить")) {
                System.out.println(Products);
                break;
            }
        }

        System.out.println("Общая сумма товаров = " + sum);
        sum = sum / people;
        Formater formater = new Formater();
        formater.format(sum, rub);


    }


}


