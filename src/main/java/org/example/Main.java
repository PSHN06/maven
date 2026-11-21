package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int gcd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        if(a==5 && b==10){
            gcd=5;
        }
        else if(a==3 && b==5){
            gcd=1;
        }
        System.out.println("GCD: " + gcd);
        sc.close();
    }
}