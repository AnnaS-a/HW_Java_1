// Задача 2: Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;

public class task_1_2 {
    public static void main(String[] args) {
        int input = 1000; 
        List<Integer> primes = new ArrayList<>();
        
        for (int i = 2; i <= input; i++) { // Проходим по всем элементам проверяя, 
             boolean primeNumber = true; //  подходят ли они условию истинности
            
            for (int n = 2; n < i; n++) {      // Проверяем, является ли число простым
                if (i % n == 0) {
                    primeNumber = false;
                    break;                      // выход из внутреннего цикла
                }
            }
            
            if (primeNumber) {               // добавляем число, если оно простое
                primes.add(i);
            }
        }
        String s = primes.toString().replace("[", "").replace("]", "");
        System.out.println("Все простые числа от 1 до 1000: " + s);
    }
}