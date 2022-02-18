public class Main {

    public static void main(String[] args) {

        int startBalance = 500; //стартовый баланс
        int increaseSum = 3330; //сумма пополнения
        int bonus = increaseSum > 1000 ? increaseSum / 100 : 0; //расчет бонуса
        int finalBalance = startBalance + increaseSum + bonus; //расчет общей суммы на балансе

        System.out.println("Итоговый баланс: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonus);

    }

}
