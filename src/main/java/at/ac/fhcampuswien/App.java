package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){

       Scanner scan = new Scanner(System.in);

        System.out.print("Number 1: ");
       double input = scan.nextFloat();

       double max = 0;

       if (input <= 0)
           System.out.println("No number entered.");
       else {
           int count = 2;
           while (count > 1) {
               System.out.print("Number " + count + ": ");
               input = scan.nextDouble();
               count++;
               if (input > max)
               max = input;
               if (input <= 0) {
                   System.out.printf("'%.2'", "The largest number is " + max);
                   break;
               }


           }
       }
           // input your solution here
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}