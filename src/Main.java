public class Main {
    public static void main(String[] args) {

        //Test cases
        System.out.println(hasSharedDigit(23,24));
        System.out.println(hasSharedDigit(13,37));
        System.out.println(hasSharedDigit(13,43-4));
        System.out.println(hasSharedDigit(05,50));
        System.out.println(hasSharedDigit(13,37));
        System.out.println(hasSharedDigit(100,57));
        System.out.println(hasSharedDigit(10,5+15));

    }

    public static boolean hasSharedDigit(int first, int second){

        if (first < 10 || first > 99 || second < 10 || second > 99) { // Sets The parameters for the method
            return false;
        }

        // Finds each digit of the number
        int firstDigitOne = first / 10;
        int firstDigitTwo = first % 10;
        int secondDigitOne = second / 10;
        int secondDigitTwo = second % 10;

        return firstDigitOne == secondDigitOne || firstDigitOne == secondDigitTwo || // compares the digits to see if any match.
                firstDigitTwo == secondDigitOne || firstDigitTwo == secondDigitTwo;
    }


}
