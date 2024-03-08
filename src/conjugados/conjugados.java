package conjugados;

/**
 * @author leoguapo-mt
 */
import java.util.Scanner;

public class conjugados {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int a, b;
        System.out.println("PROPORCIONE EL VALOR DE a:  ");
        a = leer.nextInt();
        System.out.println("PROPORCIONE EL VALOR DE b:  ");
        b = leer.nextInt();

        String salida = "El numero COMPLEJO es Z= ";
        //excepciones de para el complejo
//        if ((a == 0 && b == 1)) {
//            salida += "i";
//        } else if ((a == 0 && b == -1)) {
//            salida += "-i";
//        } else if (b == 1) {
//            salida += a + "+i";
//        }else if (b == -1) {
//            salida += a + "-i";
//        }
//        System.out.println(salida);
        //excepciones de a=0^b=0

        if (a != 0) {
            salida += a;
        }
        if (b < 0) {
            if (b == -1) {
                salida += "-i";
            } else {
                salida += b + "i";
            }
        }
        if (b > 0) {
            if (b == 1) {
                salida += (a != 0 ? "+" : "") + "i";
            } else {
                salida += "+" + b + "i";
            }
        }

//        if (b != 0) {
//            salida += a;  //posiblemente ya no se usara
//        }
        System.out.println(salida);

        // SE ESTABLECE LA SALIDA PARA Z'
        salida = "EL NUMERO CONJUGADO DE Z' ES = ";
        b *= -1; // Se cambia el signo de b

        //imprimir el conjugado
        if (a != 0) {
            salida += a;
        }

        if (b < 0) {
            if (b == -1) {
                salida += "-i";
            } else {
                salida += b + "i";
            }
        }

        if (b > 0) {
            if (b == 1) {
                salida += (a != 0 ? "+" : "") + "i";
            } else {
                salida += "+" + b + "i";
            }
        }
        System.out.println(salida);

    }
}
