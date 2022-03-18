public class Main {
    public static void main(String[] args) {
        short balanceAmount = 200; // сумма остатка
        short replenishmentOfTheBalance = 1200; // сумма пополнения
        short finalBalance; // конечный баланс
        if (replenishmentOfTheBalance >= 1000) {
            byte bonusRubles = (byte) (replenishmentOfTheBalance / 100);// начислено бонусных рублей
            finalBalance = (short) (balanceAmount + replenishmentOfTheBalance + bonusRubles); // Конечный баланс
            System.out.println("Баланс равен " + finalBalance);
        } else {
            finalBalance = (short) (balanceAmount + replenishmentOfTheBalance); // Конечный баланс
            System.out.println("Баланс равен " + finalBalance);
        }
    }
}
