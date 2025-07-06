package project;

public class incrementOne {
    public static void main(String[] args) {
        int[] ar={1,2,3};
        System.out.println(plusOne(ar));
    }
    public static int[] plusOne(int[] digits) {
        int lastIndex= digits.length;
        int num=digits[lastIndex-1];
        int num2=digits[lastIndex-2];
        if(num+1>9){ return
        } else return digits[lastIndex-1]=digits[lastIndex-1]+1;

    }
}

