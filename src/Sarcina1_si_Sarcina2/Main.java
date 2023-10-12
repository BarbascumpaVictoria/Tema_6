package Sarcina1_si_Sarcina2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Am dat valori Matricei din sarcina1 ");
        int i = 0;
        int[]array = new int[10];

        for (int a = 0; a < array.length; a++) {
                array[a]  = a + i++;
                System.out.print(array[a]+" ");
            }
        System.out.println();
//_______________________________________________________________________________________________________
// _______________________________________________________________________________________________________
// _______________________________________________________________________________________________________

        int[] arr = new int [] {4, 7, 3, 8, 0, 5, 1 };
        System.out.println("Am dat valori Matricei din sarcina2 ");
        int sum = 0;
        float media = 0F;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            System.out.print(arr[j]+ " ");
            //media = sum/arr[j];
        }
        media = sum/arr.length;
        System.out.println();
        System.out.println("Suma elementelor Matricei Nr.2 este: " + sum);
        System.out.println("Media elementelor Matricei Nr.2 este: " +media);
    }
}

//Exercitiu 1.	Declarați un array de tip int. Alocați memorie pentru acest array
//        și inițializați-l cu diferite valori numerice. Afișați elementele array-ului la consolă.
//Exercitiu 2.	Realizați un program Java care ar calcula
//        suma și media elementelor unui array unidimensional și a unui
//        array bidimensional de tip int, numărul elementelor pare și impare.
