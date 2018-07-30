package assessment2.question1;

import java.util.Scanner;

public class Calculation {

public static void main(String[] args) {
Arithmetic n1 = new Addition();            //calls addition class//
Arithmetic n2 = new Subtraction();         // calls subtraction class//
Arithmetic n3 = new Multiplication();      // calls multiplication class//
Arithmetic n4 = new Division();            //calls division class//

Arithmetic[] n = {n1, n2, n3, n4};   //an array of objects//
int choice;	
System.out.println("1. Addition \n2.Subtraction \n3.Multiplication \n4.Division");
System.out.println("Enter your choice: ");
Scanner scanner = new Scanner(System.in);
choice = scanner.nextInt();
System.out.println("Enter two numers: "); //scanner takes the input//
int num1=scanner.nextInt();
int num2=scanner.nextInt();
System.out.println("Result is: " + n[choice-1].calculate(num1, num2)); //performs calculation based on choice//
}

}
