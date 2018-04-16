package competenciadeportiva;

import java.util.Scanner;

public class EjerVectores {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        int n;
        int j = 0;
        int vec[];
        int i = 0;
        int prod;

        System.out.println("Ingrese cantidad de numeros enteros");
        n = miScanner.nextInt();

        vec = new int[n];

        for (i = 0; i < vec.length; i++) {
            System.out.println("ingrese un valor");
            vec[i] = miScanner.nextInt();
        }
        System.out.println("Los valores ingresados son: ");

        do {
            System.out.print("\t," + vec[j]);
            j = j + 1;
        } while (j < n);

        for (i = 0; i < vec.length; i++) {
            if (vec[i] % 2 == 0) {
                System.out.print("\t," + vec[i]);
            }
        }

        for (i = 1; i < vec.length; i += 2) {
            System.out.print("\t," + vec[i]);
        }

        prod = vec[vec.length - 1] * vec[vec.length - 2];
        {
            System.out.println("\n el producto es: " + prod);
        }

        for (i = 1; i < vec.length; i++);
        {

            if (vec[i] > 10) {
                System.out.println("posiciòn " + i);
            }
        }

    }
}


/* 
codificacion del punto #2 o #b
for ( i = 0; i < vec.length ; i ++)
            { if (vec [i] % 2 == 0)
             {System.out.print("\t," + vec [i]);}
            }
codificacion del punto #3 o #c

 for ( i = 1; i < vec.length ; i += 2)
             {System.out.print("\t," + vec [i]);}

codificacion del punto #4 o #d

prod = vec[vec.length-1] * vec [vec.length-2];
         {System.out.println("\n el producto es: " + prod);}

codificacion del punto #5 o #e



 */
