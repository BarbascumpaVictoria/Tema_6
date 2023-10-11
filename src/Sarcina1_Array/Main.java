package Sarcina1_Array;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int[]array = new int[20];
        for (int a = 0; a < array.length; a++) {
                array[a]  = a + i++;
                System.out.print(array[a]+" ");
            }
    }
}

