package project;

public class incrementOne {
    public static void main(String[] args) {
        int[] ar={1,2,3};
        System.out.println(plusOne(ar));
    }
    public static int[] plusOne(int[] digits) {
        int[] newArr=new int[digits.length];
        int lastIndex= digits.length;
        int lastNum1=digits[lastIndex-1];
        int lastNum2=digits[lastIndex-2];
        for(int i=0;i<digits.length;i++){
            newArr[i]=digits[i];
        }
        if(lastNum1+1>9){
            newArr[lastIndex-1]=(lastNum1+1)%10;
            newArr[lastIndex-2]=lastNum2+((lastNum1+1)/10);
            return newArr;
        } else {
            newArr[lastIndex-1]=lastNum1+1;
            return newArr;
        }
    }
}

