public class Formater {
    public static void format(double sum){
        String rub;
        if(sum % 100 >= 10 && sum % 100 <= 19){
            rub = "рублей";
        } else if (sum % 10 >= 2 && sum % 10 < 5){
                rub = "рубля";
            } else if (sum % 10 >= 1 && sum % 10 < 2){
            rub = "рубль";
        } else {
            rub = "рублей";
        }
        Formater formater = new Formater();
        formater.result(sum, rub);

    }
    public static void result(double sum, String rub){
        String result = String.format("%.2f",sum);
        System.out.println("Сумма с каждого = " +  result + " " + rub);
    }
}
