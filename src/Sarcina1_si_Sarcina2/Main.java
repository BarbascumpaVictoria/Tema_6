package Sarcina1_si_Sarcina2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Am dat valori matricei");
        int i = 0;
        int[]array = new int[10];
        for (int a = 0; a < array.length; a++) {
                array[a]  = a + i++;
                System.out.print(array[a]+" ");
            }
        System.out.println();

        int suma = array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9];
        System.out.println("Suma valorilor matricei este:   "+suma);

        float media = suma/10;
        System.out.println();
        System.out.println("Media valorilor matricei este:   "+ media);

    }
}

//Exercitiu 1.	Declarați un array de tip int. Alocați memorie pentru acest array
//        și inițializați-l cu diferite valori numerice. Afișați elementele array-ului la consolă.
//Exercitiu 2.	Realizați un program Java care ar calcula
//        suma și media elementelor unui array unidimensional și a unui
//        array bidimensional de tip int, numărul elementelor pare și impare.
