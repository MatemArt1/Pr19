public class Main {
    /*
    Incrementer
    Given an input of an array of digits, return the array with each digit incremented by its position in the array: the first digit will be incremented by 1, the second digit by 2, etc. Make sure to start counting your positions from 1 ( and not 0 ).

Your result can only contain single digit numbers, so if adding a digit with its position gives you a multiple-digit number, only the last digit of the number should be returned.

Notes:
return an empty array if your array is empty
arrays will only contain numbers so don't worry about checking that
     */
    public class Kata {

        public static int[] incrementer(int[] numbers) {
            for (int i = 0; i < numbers.length; i++)
            {
                if (numbers.length == 0) return numbers;
                numbers[i] += i + 1;
                numbers[i] = numbers[i]%10;
            }
            return numbers;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}