public class Formater {
    public static void format(double sum, String rub){
        if(sum >= 1 && sum < 2){
            rub = "рубль";
        } else{
            if (sum >= 2 && sum < 5){
                rub = "рубля";
            } else {
                rub = "рублей";
            }
        }
        String result = String.format("%.2f",sum);
        System.out.println("Сумма с каждого = " +  result + " " + rub);

    }
}
