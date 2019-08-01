package com.barton;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int intEAFP;

    public static int main(String[] args) {

        //x equals an int named this and there is a method to print
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    //returning next int continuous printing of inputted data
    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    /**
     * see if there can be an input, expecting string in
     * for loop to check the length for ever i =0 0 less than in
     * length method and incremented
     */
    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
            /**
             * Exception is thrown when isvalid is false
             * meaning wrong characters inputted
             */
            if (isValid) {
                return Integer.parseInt(input);
            }
            return 0;
        }
        /**
         * Method that is an instance of an object
         * user enter number if its a  number throws exception
         */
        private static int getIntEAFP () {
            Scanner sr = new Scanner(System.in);
            System.out.println("Please enter an integer ");
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                return 0;
            }
        }
        private static int divideLBYL() {

        }
    }

}


