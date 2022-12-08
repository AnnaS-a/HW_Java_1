// Задача 3: Реализовать простой калькулятор

import java.util.Scanner;

public class task_1_3 {
    public static void main(String[] args) {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = iScan.nextInt();
        System.out.println("Введите число b: "); 
        double b = iScan.nextInt();
        System.out.print("Ввидите действие(+, -, *, /): ");
        char op = iScan.next().charAt(0);       
        double result;
        
        switch(op) {
         case '+': result = a + b;
            break;
         case '-': result = a - b;
            break;
         case '*': result = a * b;
            break;
         case '/': result = a / b;
            break;
         default:  System.out.printf("Error!");
            return;
        }
        System.out.print("\nВаш пример:\n");
        System.out.printf(a + " " + op + " " + b + " = " + result);
    }
}
  