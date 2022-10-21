package Fibonacci_series;

import java.util.*;

public class Fibonacci_series {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of Series");

//            K is no. of how many digit of series required

            int k = sc.nextInt();

//            m,n,o is a integer of sries starts

            int m = 0 ; int n = 0; int o =1;
            System.out.println("Fibonacci Series");
            for(int i = 1;i <= k; i++) {
                m = n;
                n = o;
                o= m + n;
                System.out.print(m + " ");
            }
        }
    }
