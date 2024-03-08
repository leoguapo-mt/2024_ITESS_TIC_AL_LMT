
package potencias.i;

import java.util.Scanner;

/**
 *
 * @author leoguapo-mt
 */
public class principal {

           public  static void main (String[]args){
               Scanner lector = new Scanner (System.in);
        System.out.print(("PROPORCIONE EL VALOR DEL EXPONENTE EN EL NUMERADOR: "));
        int potenciaNumerador = lector.nextInt();
        System.out.print(("PROPORCIONE EL VALOR DEL EXPONENTE EN EL DENOMINADOR: "));
        int potenciaDenominador = lector.nextInt();
        
        potenciasdei expresion = new potenciasdei (potenciaNumerador, potenciaDenominador);
        
        System.out.println("EL VALOR REDUCIDO DE LA EXPRESIÓN ES: " + expresion);

        
    }

}
