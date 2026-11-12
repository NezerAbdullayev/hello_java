package loops;

public class ForLoop {
    public static void main(String[] args) {
        // 1. Sadə for: 1-dən 5-ə qədər say
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 2. Massiv üzərində for (JS-dəki arr[i] kimi)
        String[] fruits = {"alma", "armud", "banan"};
        for (byte i = 0; i < fruits.length; i++) {
            System.out.println(i + ": " + fruits[i]);
        }

        // 3. for-each (JS-dəki for...of kimi)
        for (String fruit : fruits) {
            System.out.println("meyvə: " + fruit);
        }

        // 4. Cəm hesabla: 1 + 2 + ... + 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("cəm = " + sum);


        int requestFrontInputLValue=23;
        int values=0;//ex:23
        for (int i = 1 ; i<=requestFrontInputLValue ; i++){
            values += i;
        }
        System.out.println("values" + " "+ values);
    }
}
