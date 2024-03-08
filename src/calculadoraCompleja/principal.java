package calculadoraCompleja;

import java.util.Scanner;

/**
 *
 * @author leoguapo-mt
 */
public class principal {    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Proporciona los vaores de Z1");
        System.out.print("a: ");
        double real = leer.nextDouble();
        System.out.print("b: ");
        double imaginario = leer.nextDouble();
        
        numeroComplejo z1 = new numeroComplejo(real,imaginario);
        System.out.println("Z1= " + z1);
        
        
        System.out.println("Proporciona los vaores de Z2");
        System.out.print("a: ");
        real = leer.nextDouble();
        System.out.print("b: ");
        
        
        imaginario = leer.nextDouble();
        numeroComplejo z2 = new numeroComplejo(real,imaginario);
        System.out.println("Z1= " + z2);
        System.out.println("__________________________");
        
        
        calculadoraCompleja calculos = new calculadoraCompleja();
        System.out.println("Z1+Z2= " + calculos.sumarcomplejos(z1, z2));
        System.out.println("Z1-Z2= " + calculos.restarcomplejos(z1, z2));
        System.out.println("Z1*Z2= " + calculos.multiplicarcomplejos(z1, z2));
        System.out.println("Z1/Z2= " + calculos.dividirComplejos(z1, z2));
    }
}
