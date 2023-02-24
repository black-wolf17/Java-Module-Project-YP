import java.util.Scanner;

public class GroceryList {
    public void product(int people) {
        double sum = 0.0;
        String products = ("Добавленные товары:");

        while (true) {
            Scanner priceProduct = new Scanner(System.in);
            System.out.println("Введите название товара");
            String name = priceProduct.nextLine();


            System.out.println("Введите стоимость товара");


            while(true) {
                if (!priceProduct.hasNextDouble()) {
                    System.out.println("Ошибка, введён текст\nВведите числовое значение");
                    priceProduct.nextLine();
                } else {
                    double price = priceProduct.nextDouble();

                    if (price < 0) {
                        System.out.println("Ошибка, отрицательное значение\nВведите положительное значение");
                    }

                    if (price >= 0) {
                        products = products + "\n" + name + " по цене " + price;
                        sum = sum + price;

                        System.out.println("Товар успешно добавлен");
                        break;
                    }
                }
            }


                    System.out.println("Хотите добавить ещё один товар?");

                    priceProduct.nextLine();
                    String reply = priceProduct.nextLine();

                    if (reply.equalsIgnoreCase("Завершить")) {
                        System.out.println(products);
                        break;
                    }

        }

        System.out.println("Общая сумма товаров = " + sum);
        sum = sum / people;
        Formater formater = new Formater();
        formater.format(sum);

        }
    }


