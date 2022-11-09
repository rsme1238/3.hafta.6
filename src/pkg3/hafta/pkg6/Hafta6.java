
package pkg3.hafta.pkg6;

import java.util.Scanner;

public class Hafta6 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int n= input.nextInt();
        
        int sum=0;
        int count =1; 
         
        while(count <= n){
        sum = sum + (count * count);
        count++;
        }
          System.out.println("Sum= "+sum);
         
    }
    
}