package main;

import warrior.Item;
import warrior.Warrior;

import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Exercises {

    public static double totalDistance(double stepHeight, double stepLength, double towerHeight) {
        var numOfSteps = towerHeight / stepHeight;
        return numOfSteps * (stepHeight + stepLength);
    }

    public static int equal(int firstNum, int secondNum, int thirdNum) {
        if(firstNum == secondNum || firstNum == thirdNum){
            if(secondNum == thirdNum) return 3;
            return 2;
        }
        if(secondNum == thirdNum) return 2;
        return 0;
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a
                && c + a > b;
    }

    public static int[] multiplyByLength(int[] arr) {
        int length = arr.length;
        for (var i = 0; i < length; i++)
        {
            arr[i] *= length;
        }
        return arr;
    }

    public static boolean equalSlices(int totalSlices, int numOfRecipients, int slicesEach) {
        return numOfRecipients * slicesEach <= totalSlices;
    }

    public static boolean checkPalindrome(String input) {
        char[] word = input.toCharArray();
        for (var i = 0; i < word.length; i++)
        {
            char a = word[i];
            char b = word[word.length - 1 - i];

            if(a != b) return false;
        }
        return true;
    }

    public static String rps(String player1, String player2) {
        if(player1.equals(player2)) return "TIE";
        switch (player1) {
            case "rock":
                if (player2.equals("paper"))
                    return "Player 2 Won"; break;
            case "paper":
                if (player2.equals("scissors"))
                    return "Player 2 wins"; break;
            case "scissors":
                if (player2.equals("rock"))
                    return "Player 2 wins"; break;
        }
        return "Player 1 wins";
    }

    public static boolean canCapture(String[] input) {
        char[] rook1 = input[0].toCharArray();
        char[] rook2 = input[1].toCharArray();
        return rook1[0] == rook2[0] || rook1[1] == rook2[1];
    }

    public static int differenceMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (var index = 1; index < arr.length; index++) {
            if (max < arr[index]) max = arr[index];
            if (min > arr[index]) min = arr[index];
        }
        return max - min;
    }

    public static int warOfNumbers(int[] arr) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i : arr) {
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }
        return Math.abs(evenSum - oddSum);
    }
    public static boolean checkEnding(String first, String second) {
        return first.endsWith(second);
    }

    //OOP Exercises:
    public static int sumOfBudget(Person[] people) {
        int budget = 0;
        for (Person person : people) {
            budget += person.getBudget();
        }
        return budget;
    }
    public static void employee() {
        Employee employee = new Employee(
                "Jozko",
                "Mrkvicka",
                new GregorianCalendar(1990, Calendar.JULY, 4),
                new JobPosition("IT programmer", 2100));

        System.out.println(employee.getName() +
                ", " + employee.getSurname() +
                ", " + employee.getJobPosition().getName() +
                ", " + employee.getJobPosition().getSalary());
    }

    public static int battle(Warrior warrior1, Warrior warrior2) {
        if (warrior1.getForce() == warrior2.getForce()) {
            warrior1.setLife(warrior1.getLife() - 1);
            warrior2.setLife(warrior2.getLife() - 1);
            return 0;
        }
        if (warrior1.getForce() > warrior2.getForce()) {
            finalizeBattle(warrior1, warrior2);
            return 1;
        }
        else {
            finalizeBattle(warrior2, warrior1);
            return 2;
        }
    }
    public static void finalizeBattle(Warrior winner, Warrior loser) {
        if (loser.getItems().isEmpty()) return;
        var item = Collections.max(loser.getItems(),
                Comparator.comparing(Item::getValue));
        loser.setLife(loser.getLife() - 1);
        winner.getItems().add(item);
        loser.getItems().remove(item);
    }
}
