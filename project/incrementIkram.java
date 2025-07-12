package project;

public class incrementIkram {
    public static void main(String[] args) {
        int[] ar={9,9};
        double num=0;
        for(int i=0;i< ar.length;i++){
        num=num+ar[i]*Math.pow(10,ar.length-i-1);
        }
        System.out.println(num);
    }
}
