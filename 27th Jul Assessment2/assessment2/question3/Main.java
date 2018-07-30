package assessment2.question3;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	System.out.println("Enter the array");
    Scanner sc = new Scanner(System.in);

    String s="null";
    int n=sc.nextInt();
    int[] a = new int[n];
         for(int i=0;i<n;i++) {
        	 a[i]=sc.nextInt();    // array is taken from user//
         }


    if(UserMainCode.checkTripplets(a))
     s="TRUE";
    
     else
     s="FALSE";
    
     System.out.println(s);



  }

}