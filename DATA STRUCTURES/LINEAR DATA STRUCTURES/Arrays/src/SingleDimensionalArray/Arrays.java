package SingleDimensionalArray;

public class Arrays {
    public static void main(String[] args) {
        //Create an empty array
        int[] numbers = new int[10];
        //Create an array with elements already defined
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        //Uninitialized array
        float[] prices;
        prices = new float[3]; //Now is initialized

        for (int i = 0; i<numbers.length; i++){ //Add elements to array
            numbers[i] = i + 1;
        }

        for (int number : numbers){
            System.out.println(number);
        }

        for (int letter : letters){
            System.out.println((char)letter);
        }

        /*      */

        for(int i = 0; i < prices.length; i++){
            prices[i] = (float)i * 2.9f;
        }

        for (float price : prices){
            System.out.println(price);
        }
    }
}
