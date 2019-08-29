package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);

        double number1 = ap.nextInt("Input First Number:");
        double number2 = ap.nextInt("Input Second Number:");

        System.out.println("Your Average is:" + (number1 +number2)/(2));
    }

}
