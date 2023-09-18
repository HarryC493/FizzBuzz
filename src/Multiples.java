public class Multiples {
    public static void main(String[] args) {
        int intValue = 1; // change input type to integer
        int multiple_num = 0; // accumulator for multiples of 3 and 5
        while (intValue < 1000) {
            multiple_num += doMultiples(intValue);
            intValue++;
        }
        System.out.println("There are " + multiple_num + " multiples of 3 and 5 below 1000");
    }

    public static int doMultiples(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            return 1;
        } else if (divisibleBy3) {
            return 1;
        } else if (divisibleBy5) {
            return 1;
        } else {
            return 0;
        }
    }
}


