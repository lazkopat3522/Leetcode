package project;

import java.util.Scanner;

public class hackerRank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println("================================");
        for(int i=0;i<15;i++){
            if(st[i]==" "){
                st[12]=st[i+1];
                st[13]=st[i+2];
                st[14]=st[i+3];
            }
            System.out.print(st[i]);
        }
        System.out.println("================================");

    }
}
