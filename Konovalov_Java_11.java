import java.util.Scanner;

public class Konovalov_Java_11 {

    public static void math_operations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача №_1:");
        System.out.print("Введите число 'a': ");
        int a = scanner.nextInt();
        System.out.print("Введите число 'b': ");
        int b = scanner.nextInt();

        // Comparison
        if (a > b) {
            System.out.println("a > b");
        }
        else if (a < b) {
            System.out.println("a < b");
        }
        else {
            System.out.println("a <= b");
        }

        // Operations
        System.out.println("Результат работы программы");
        System.out.println("Сложение (a + b) = " + (a + b));
        System.out.println("Вычитание (a - b) = " + (a - b));
        if (b != 0) {
            System.out.println("Деление (a / b) = " + (a / b));
        }
        else {
            System.out.println("Делить на 0 нельзя!");
        }
        System.out.println("Умножение (a * b) = " + (a * b));


    }

    public static void str_comparison() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача №_2:");
        System.out.print("Введите строку 'a': ");

        String a = scanner.nextLine();
        System.out.print("Введите строку 'b': ");
        String b = scanner.nextLine();

        // String comparison
        System.out.println("Результат работы программы");

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        }
        else {
            System.out.println("Строки различаются");
        }
    }

    public static void even_numbers() {
        System.out.println("Задача №_3:");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Чётные числа: ");
        boolean found = false;
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Чётных чисел нет");
        }
    }

    public static void main(String[] args) {
        math_operations();
        str_comparison();
        even_numbers();
    }
}