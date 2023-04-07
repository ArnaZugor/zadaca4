import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Task 1a
    public static int addition(int numberA, int numberB) {
        return numberA + numberB;
    }
    public static int subtraction(int numberA, int numberB) {
        return numberA - numberB;
    }
    public static int multiplication(int numberA, int numberB) {
        return numberA * numberB;
    }
    public static int division(int numberA, int numberB) {
        return numberA / numberB;
    }

    public static void main(String[] args) {

        int numberA = 30;
        int numberB = 5;

        System.out.println("numberA + numberB = " + numberA + " + " + numberB + " = " + addition(numberA, numberB));
        System.out.println("numberA - numberB = " + numberA + " - " + numberB + " = " + subtraction(numberA, numberB));
        System.out.println("numberA * numberB = " + numberA + " * " + numberB + " = " + multiplication(numberA, numberB));
        System.out.println("numberA / numberB = " + numberA + " / " + numberB + " = " + division(numberA, numberB));


        //Task 1aa

        Scanner reader = new Scanner(System.in);

        int total = 10;

        while (total != 0) {
            System.out.println("Please enter a positive number: ");
            int number = reader.nextInt();

            if (number < 0) {
                System.out.println("You have entered a negative number and thus ended the loop.");
                break;
            }
        }

        //Task 1aaa

        int numberToBeEntered;

        System.out.println("Please enter the starting number: ");
        numberToBeEntered = reader.nextInt();

        while (numberToBeEntered > 0) {
            System.out.println("Please enter a positive number: ");
            numberToBeEntered = reader.nextInt();

            if (numberToBeEntered < 0) {
                System.out.println("You have entered a negative number and thus ended the loop.");
                break;
            }
        }

        //Task 1b

        int enteredInteger;
        int exitNumber = -1000;

        do {
            System.out.println("Please enter any integer: ");
            enteredInteger = reader.nextInt();
        }  while (enteredInteger != exitNumber) ;

            if (enteredInteger == exitNumber) ;
            {
                System.out.println("The exit number " + exitNumber + " has been detected.");
            }


        //Task 1c

        int previousNumber = 0;
        int newNumber;

        while (true) {
            System.out.println("Please enter integer: ");
            newNumber = reader.nextInt();

          if (newNumber==-1000){
              System.out.println("The exit number "+newNumber+" has been detected.");
              break;
            }else{
              int sum = addition(previousNumber,newNumber);
              System.out.println("The total of "+previousNumber+" and "+newNumber+ " is: "+ sum);
            }
        }

        //Task 1d & 1e

        int previousValue=0;

        while (true){
            System.out.println("Which operand would you like to use: +,-,*,/ ?");
            char operand = reader.next().charAt(0);
            System.out.println("Please enter integer: ");
            int enteredValue = reader.nextInt();

            if (enteredValue == -1000){
                System.out.println("The exit number "+enteredValue+" has been detected.");
                break;
            } else if (operand == '+') {
                int addition = addition(previousValue, enteredValue);
                System.out.println("The sum of "+previousValue+" and "+enteredValue+" is "+addition);
                previousValue+=enteredValue;

            }else if (operand == '-') {
                int subtraction = subtraction(previousValue, enteredValue);
                System.out.println("The difference between "+previousValue+" and "+enteredValue+" is "+ subtraction);
                previousValue-=enteredValue;

            }else if (operand == '*') {
                int multiplication = multiplication(previousValue, enteredValue);
                System.out.println("The product of "+previousValue+" and "+enteredValue+" is "+multiplication);
                previousValue*=enteredValue;

            }else if (operand == '/') {
                int division = division(previousValue, enteredValue);
                System.out.println("The quotient of "+previousValue+" and "+enteredValue+" is "+division);
                previousValue/=enteredValue;
            }
        }

        //Task 1f

        int startingValue=0;

        while(true){
            System.out.println("Which operand would you like to use: +,-,*,/ ?");
            char operand = reader.next().charAt(0);

            if (operand != '+' && operand != '-' && operand !='*' && operand != '/' && operand != '='){
                System.out.println("Please choose one of the following operands");
                continue;
            } else if (operand == '=') {
                if (startingValue == 0) {
                    System.out.println("You have not entered a number");
                }else{
                    System.out.println("Calculator result is: "+startingValue);
                }
                break;
            }
            System.out.println("Please enter integer: ");
            int enteredValue = reader.nextInt();

            if (enteredValue == -1000){
                System.out.println("The exit number "+enteredValue+" has been detected.");
                break;
            } else if (operand == '+') {
                startingValue = addition(startingValue, enteredValue);

            }else if (operand == '-') {
                startingValue = subtraction(startingValue, enteredValue);

            }else if (operand == '*') {
                startingValue = multiplication(startingValue, enteredValue);

            }else if (operand == '/') {
                startingValue = division(startingValue, enteredValue);
            }
        }

            //Task 2

        int[] enteredArray = new int [10];
        int numberInArray = 0;

        for (int i=0; i< enteredArray.length; i++){
            System.out.println("Enter a number in the array: ");
            numberInArray = reader.nextInt();
            enteredArray[i] = numberInArray;

            if (enteredArray[i] != -10){
                System.out.println(Arrays.toString(enteredArray));
                System.out.println("Would you like to expand the array? (y/n): ");
                String answer = reader.next();
                if (answer.equals("n")){
                    break;
                }
            }
        }

        //Task 3

        System.out.println("Please choose from the following functions: \n 1. Is the string a palindrome? \n 2. Filter an array \n 3. Number is divisible by X");
        String function = reader.next();

        if (function.contains("1")){
            palindrome();
        }
        if (function.contains("2")){
            filterArray();
        }
        if (function.contains("3")){
            divisibleByX();
        }
    }

    private static void palindrome() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter a word to check if it is a palindrome: ");
        String wordToCheck = reader.next();
        char[]wordToCheckConverted = wordToCheck.toCharArray();

        for (int i=0; i< wordToCheckConverted.length/2; i++){
            if (wordToCheckConverted[i] != wordToCheckConverted[wordToCheckConverted.length -1 -i]){
                System.out.println("The word " +wordToCheck +" is not a palindrome");
                break;
            }else{
                System.out.println("The word " +wordToCheck +" is a palindrome");
            }
        }
    }

    private static int[] filterArray() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int arraySize = reader.nextInt();
        int[] numbersInArray = new int[arraySize];

        for (int i=0; i< arraySize; i++){
            System.out.println("Enter a number for position "+ i +": ");
           int arrayNumber = reader.nextInt();
            numbersInArray[i] = arrayNumber;
        }
        System.out.println("Enter number to be excluded from the array: ");
        int numberToExclude = reader.nextInt();
        int []filteredArray = new int[numbersInArray.length];

        for (int i=0; i< arraySize; i++){
            if (numbersInArray[i] != numberToExclude) {
                filteredArray[i] = numbersInArray[i];
            }
        }
        System.out.println(Arrays.toString(filteredArray));
        return filteredArray;
    }


    private static void divisibleByX() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number to be divided by number X: ");
        int numberToDivide = reader.nextInt();

        System.out.println("Please enter number X: ");
        int numberX = reader.nextInt();

        if (numberToDivide % numberX ==0){
            int result = numberToDivide/numberX;
            System.out.println("The number "+numberToDivide+" is divisible by "+numberX+" and the result is: "+result);
        }else{
            System.out.println("The number "+numberToDivide+" is not divisible by "+numberX);
        }
    }
}


