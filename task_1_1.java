// Задача 1:Вычислить n-ое треугольного число(сумма чисел от 1 до n),
//  n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class task_1_1 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int num = myScan.nextInt();
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= num; i ++) {
			sum = sum + i;
		}
        for (int i = 1; i <= num; i ++) {
			mult = mult * i;
		}

        System.out.printf("%d-ое треугольное число: %d ", num, sum);

        System.out.printf("\nПроизведение чисел от 1 до %d: %d", num, mult);
        myScan.close();
    }
}
