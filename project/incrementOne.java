package project;

public class incrementOne {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {
        int lastIndex= digits.length;
        if(digits[lastIndex-1]+1>9){
            digits[lastIndex-2]=digits[lastIndex-2]+1;
            digits[lastIndex-1]=(digits[lastIndex-1]+1)%10;
        } else digits[lastIndex-1]=digits[lastIndex-1]+1;
        return digits[]
    }
}

