package project;

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calcPrime(n));
    }
    public static String calcPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            return "YES";
        } else
            return "NO";
    }
}
