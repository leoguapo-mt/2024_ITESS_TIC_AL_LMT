
package modulo.argumento;

/**
 * Programa que calcula el modulo y argumento de un numero complejo, dados los 
 * valores A y B
 * @author leoguapo-mt
 */
import java.util.Scanner;
public class ModuloYargumento {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        
        int a,b;
        double magnitud, angulo;
        System.out.println("Proporcione el valor de a: ");
        a = in.nextInt();
        System.out.println("Proporcione el valor de b: ");
        b = in.nextInt();
        
        //Revision de casos especiales
        if(a==0){
            magnitud = b;
            angulo = (b < 0 ? 180 : 90);
        } else if(b==0){
            magnitud = a;
            angulo = (a < 0 ? 180 : 0);
        }else {
            if (a > 0 && b > 0){ // cuadrante 1
                angulo = Math.atan(Math.abs(b/a));
            } else if (a < 0 && b > 0){ // cuadrante 2
                angulo = 180 - Math.atan(Math.abs(b/a));
            } else if (a < 0 && b < 0){ // cuadrante 3
                angulo = 180 + Math.atan(Math.abs(b/a));
            } else {     // cuadrante 4
                angulo = 360 - Math.atan(Math.abs(b/a));
            }
            magnitud = Math.sqrt(Math.pow(a,2) + Math.pow(b,2)); 
            /**
             * Math.pow funciona para realizar potencias 
             * Sintaxis Math.pow(base, exponente)
             * funciona para hacer mas corta la sintaxis en exponentes
             * mas grandes que en este caso al cuadrado
            */
            
            
            //Radianes a grados
//            angulo *= 180/Math.PI;
           //Math.toDegrees(angulo);
            System.out.println("Modulo y Argumento para Z");
            System.out.println("r= " + magnitud);
            System.out.println("argumento= " + angulo);
            
        }
    }
}
