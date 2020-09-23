public class Main {

    public static void main(String[] args) {
        System.out.println(totalDistance(0.2, 0.4, 100.0));
        System.out.println(totalDistance(0.3, 0.2, 25.0));
        System.out.println(totalDistance(0.1, 0.1, 6.0));

        System.out.println(equal(3, 4, 3));
        System.out.println(equal(1, 1, 1));
        System.out.println(equal(3, 4, 1));

        System.out.println(isTriangle(2, 3, 4));
        System.out.println(isTriangle(3, 4, 5));
        System.out.println(isTriangle(4, 3, 8));
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
}
