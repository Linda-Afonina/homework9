import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        int[] payments = new int[5];
        payments[0] = 125_000;
        payments[1] = 140_000;
        payments[2] = 184_000;
        payments[3] = 242_000;
        payments[4] = 151_000;

        int sumOfPayments = 0;
        for (int i = 0; i < payments.length; i++) {
            sumOfPayments = sumOfPayments + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumOfPayments + " рублей");

        System.out.println("Задача 2.");
        int[] payments2 = {156_000, 144_000, 181_500, 128_000, 148_000};
        int maxPayment = payments2[0];
        int minPayment = payments2[0];

        for (int i = 0; i < payments2.length; i++) {
            if (payments2[i] > maxPayment) {
                maxPayment = payments2[i];
            }
            if (payments2[i] < minPayment) {
                minPayment = payments2[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + minPayment +
                " рублей. Максимальная сумма трат за месяц составила " + maxPayment + " рублей");

        System.out.println("Задача 3.");
        int[] payments3 = {174_000, 191_000, 202_500, 216_700, 146_200};
        sumOfPayments = 0;
        for (int i = 0; i < payments3.length; i++) {
            sumOfPayments = sumOfPayments + payments3[i];
        }
        double middlePayment = (double) sumOfPayments / payments3.length;
        System.out.println("Средняя сумма трат за месяц составила " + middlePayment + " рублей");

        System.out.println("Задача 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}