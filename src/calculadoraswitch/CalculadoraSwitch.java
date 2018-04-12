
package calculadoraswitch;

import java.util.Scanner;


public class CalculadoraSwitch
{

    public static void main(String[] args)
   {
        // TODO code application logic here
        
        Scanner miScanner = new Scanner(System.in);
        
        int op;
        float n1, n2;
        float resultado;
        
        do
        {   System.out.println("1 suma");
            System.out.println("2 resta");
            System.out.println("3 multiplicar");
            System.out.println("4 dividir");
            System.out.println("5 Salir");
            
            System.out.println("Opcion    ");
            
            op = miScanner.nextInt();
            
            switch (op)
            {case 1:
                System.out.println("Ingrese el primer nùmero");
                n1 = miScanner.nextInt();
                System.out.println("Ingrese el segundo nùmero");
                n2 = miScanner.nextInt();
                resultado = n1 + n2;
                System.out.println("la suma de los dos nùmeros es: " + resultado); 
                break;
                
             case 2:
                System.out.println("Ingrese el primer nùmero");
                n1 = miScanner.nextInt();
                System.out.println("Ingrese el segundo nùmero");
                n2 = miScanner.nextInt();
                resultado = n1 - n2;
                System.out.println("la resta de los dos nùmeros es: " + resultado); 
                break;
                
            case 3:
                System.out.println("Ingrese el primer nùmero");
                n1 = miScanner.nextInt();
                System.out.println("Ingrese el segundo nùmero");
                n2 = miScanner.nextInt();
                resultado = n1 * n2;
                System.out.println("la multiplicaciòn de los dos nùmeros es: " + resultado); 
                break;
                
             case 4:
                System.out.println("Ingrese el primer nùmero");
                n1 = miScanner.nextInt();
                System.out.println("Ingrese el segundo nùmero");
                n2 = miScanner.nextInt();
                resultado = n1 / n2;
                System.out.println("la divisiòn de los dos nùmeros es: " + resultado); 
                break;
            }
            
        }
        while (op !=5);
        
    }
    
}
