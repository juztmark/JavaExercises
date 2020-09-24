import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Snail Goes up the Stairs:");
        System.out.println(totalDistance(0.2, 0.4, 100.0));
        System.out.println(totalDistance(0.3, 0.2, 25.0));
        System.out.println(totalDistance(0.1, 0.1, 6.0));

        System.out.println("Equality of 3 values:");
        System.out.println(equal(3, 4, 3));
        System.out.println(equal(1, 1, 1));
        System.out.println(equal(3, 4, 1));

        System.out.println("Is It a Triangle?:");
        System.out.println(isTriangle(2, 3, 4));
        System.out.println(isTriangle(3, 4, 5));
        System.out.println(isTriangle(4, 3, 8));

        System.out.println("Multiply by Length:");
        System.out.println(Arrays.toString(multiplyByLength(new int[] {2, 3, 1, 0})));
        System.out.println(Arrays.toString(multiplyByLength(new int[]{4, 1, 1})));
        System.out.println(Arrays.toString(multiplyByLength(new int[] {1, 0, 3, 3, 7, 2, 1})));
        System.out.println(Arrays.toString(multiplyByLength(new int[] {0})));

        System.out.println("Slice of Pie:");
        System.out.println(equalSlices(11, 5, 2));
        System.out.println(equalSlices(11, 5, 3));
        System.out.println(equalSlices(8, 3, 2));
        System.out.println(equalSlices(8, 3, 3));
        System.out.println(equalSlices(24, 12, 2));

        System.out.println("Is the String a Palindrome?:");
        System.out.println(checkPalindrome("mom"));
        System.out.println(checkPalindrome("scary"));
        System.out.println(checkPalindrome("reviver"));
        System.out.println(checkPalindrome("stressed"));
    }
    private static double totalDistance(double stepHeight, double stepLength, double towerHeight) {
        var numOfSteps = towerHeight / stepHeight;
        return numOfSteps * (stepHeight + stepLength);
    }
    private static int equal(int firstNum, int secondNum, int thirdNum) {
        if(firstNum == secondNum || firstNum == thirdNum){
            if(secondNum == thirdNum) return 3;
            return 2;
        }
        if(secondNum == thirdNum) return 2;
        return 0;
    }
    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a
                && c + a > b;
    }
    private static int[] multiplyByLength(int[] arr) {
        int length = arr.length;
        for (var i = 0; i < length; i++)
        {
            arr[i] *= length;
        }
        return arr;
    }
    private static boolean equalSlices(int totalSlices, int numOfRecipents, int slicesEach) {
        return numOfRecipents * slicesEach <= totalSlices;
    }
    private static boolean checkPalindrome(String input) {
        char[] word = input.toCharArray();
        for (var i = 0; i < word.length; i++)
        {
            char a = word[i];
            char b = word[word.length - 1 - i];

            if(a != b) return false;
        }
        return true;
    }
}
