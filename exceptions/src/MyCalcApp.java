import java.util.Scanner;

public class MyCalcApp {
    public static void main(String[] args) {
        System.out.println("Please enter integer type number.");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        Calculator cal = new Calculator();
        System.out.println("The user's input " + userInput + " after being modified to double is " +
                cal.calculateDouble(userInput));
    }
}