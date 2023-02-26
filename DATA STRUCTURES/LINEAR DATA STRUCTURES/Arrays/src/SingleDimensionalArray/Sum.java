package SingleDimensionalArray;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int [] numbers = new int [5]; // Initialized array
        int sum = 0;
        numbers =  getNumbers();
        sum = sumArray(numbers);
        System.out.println(sum);
    }

     static int [] getNumbers(){
        int [] numbers = new int [5];
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i<numbers.length; i++){
            System.out.println("Enter number >");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    static int sumArray(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
