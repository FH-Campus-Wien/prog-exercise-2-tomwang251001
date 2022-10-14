package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){

       Scanner scan = new Scanner(System.in);

       double max = 0;
           int count = 1;

           while (count > 0) {
               System.out.print("Number " + count + ": ");
               double input = scan.nextDouble();
               if (input <= 0 & count == 1) {
                   System.out.println("No number entered.");
                   break;
               }
               count++;
               if (input > max)
               max = input;
               if (input <= 0) {
                   System.out.println("The largest number is " + String.format("%.2f", max));
                   break;
               }


           }
       }
           // input your solution here


    //todo Task 2
    public void stairs() {

        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int rows = scan.nextInt();

        int count = 1;
        int num = 1;

        if (rows <= 0)
            System.out.println("Invalid number!");
        else {
            while (count <= rows) {
                for (int spot = 0; spot < count; spot ++) {
                    System.out.print(num + " ");
                    num ++;
                }
                System.out.println();
                count ++;
            }


        }





        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){

      final int ROWS = 6;
      int rows = 6;
      int stars = 1;

      for (int count = 0; count < ROWS; count ++) {
          for (int space = 1; space < rows; space ++) {
              System.out.print(" ");// input your solution here
          }
          for (int col = 0; col < stars; col ++) {
              System.out.print("*");
          }
          stars += 2;
          System.out.println();
          rows --;
      }
    }

    //todo Task 4
    public void printRhombus(){

     Scanner scan = new Scanner(System.in);

        System.out.print("h: ");
        int h = scan.nextInt();
        System.out.print("c: ");
        char c = scan.next().charAt(0);

        int e = (h-1)/2;
        int i = 0;
        int count = 1;
        int countl = 1;
        int minLet = 0;

        if (h % 2 == 0)
            System.out.println("Invalid number!");
        else {
            for (int rows = 1; rows <= h/2+1; rows ++) {
                for (int space = 0; space < e; space ++) {
                    System.out.print(" ");
                }
                for (int let = 0; let < rows*2-1-minLet; let ++) {
                        System.out.print((char) (c - i + let));
                }
                for (int addLet = 0; addLet < minLet; addLet ++) {
                    System.out.print((char) (c - 1 - addLet));
                }
                System.out.println();
                e --;
                i ++;
                count ++;
                countl += 2;
                minLet ++;
            }
            int e2 = 1;
            i -= 2;
            countl -= 4;

            for (int rows = count; rows <= h; rows ++) {
                for (int space = 0; space < e2; space ++) {
                    System.out.print(" ");
                }
                for (int let = 0; let < countl/2+1; let ++) {
                    System.out.print((char) (c - i + let));
                }
                for (int addlet = 0; addlet < countl/2; addlet ++ ) {
                    System.out.print((char) (c - 1 -addlet));
                }
                System.out.println();
                e2 ++;
                i --;
                countl -= 2;
            }

        }
        // input your solution here
    }

    //todo Task 5
    public void marks(){

       Scanner scan = new Scanner(System.in);

       float sum =(float) 0;
       int neg = 0;

       for (int count = 1; count > 0; count ++) {

           System.out.print("Mark " + count + ": ");
           int grade = scan.nextInt();

           if (grade == 5)
               neg ++;
           if (grade > 5 | grade < 0) {
               System.out.println("Invalid mark!");
               count--;
           }
           else {
               sum += grade;
           }
           if (grade == 0) {
               if (count > 1) {
                   float avg = sum / (count - 1);
                   System.out.println("Average: " + String.format("%.2f", avg));
                   System.out.println("Negative marks: " + neg);
                   break;
               }
               else {
                   float avg = sum / count;
                   System.out.println("Average: " + String.format("%.2f", avg));
                   System.out.println("Negative marks: " + neg);
                   break;
               }
           }
               // input your solution here
       }
    }

    //todo Task 6
    public void happyNumbers(){

     Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int n = scan.nextInt();

        int sum = 0;
        int digit;

        while (n != 1 & n != 4) {
            while (n != 0) {
               digit = n % 10;
               sum += Math.pow(digit, 2);
               n = n/10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 1)
            System.out.println("Happy number!");
        else
            System.out.println("Sad number!");// input your solution here
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