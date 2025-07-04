package project;

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calcPrime(n);
    }
    public static void calcPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    c++;
                }
                if (c == 1) {
                    System.out.print(i+" ");
                }
                c = 0;

        }
    }
}
