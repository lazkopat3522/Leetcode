package project;

public class incrementOne {
    public static void main(String[] args) {
        int[] ar={1,0,0,9};
        int[] newChico=plusOne(ar);
        for(int i=0; i<ar.length;i++){
            System.out.print(newChico[i]+" ");
        }
    }
    public static int[] plusOne(int[] digits) {
        int[] newArr=new int[digits.length];
        int lastIndex= digits.length;
        int lastNum=digits[lastIndex-1];
        for(int i=0;i<digits.length;i++){
            newArr[i]=digits[i];
        }
        int c=1;
        if(lastNum+1>9){
            while(lastNum+1>9) {
                newArr[lastIndex-c]=(lastNum+1)%10;
                c++;
                lastNum=newArr[lastIndex-c]+1;
            }
            newArr[lastIndex-c]=newArr[lastIndex-c]+1;
        } else newArr[lastIndex-1]=lastNum+1;
          return newArr;

    }
}

