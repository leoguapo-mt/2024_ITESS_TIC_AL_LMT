package calculadoraCompleja;

import java.util.Scanner;

/**
 *
 * @author leoguapo-mt
 */
public class calculadoraCompleja {
    public numeroComplejo sumarcomplejos(numeroComplejo z1,numeroComplejo z2){
        double real = z1.getReal() + z2.getReal();
        double imaginario = z1.getImaginario() + z2.getImaginario();
        return new numeroComplejo(real, imaginario);
    }
    
    public numeroComplejo restarcomplejos(numeroComplejo z1,numeroComplejo z2){
        numeroComplejo menosZ2 = new numeroComplejo(z2.getReal()*-1, z2.getImaginario()*-1);
        double real = z1.getReal() - z2.getReal();
        return sumarcomplejos(z1, menosZ2);
    }
    
    public numeroComplejo multiplicarcomplejos(numeroComplejo z1, numeroComplejo z2){
        double real = z1.getReal() * z2.getReal() + z1.getImaginario() * z1.getImaginario();
        double imaginario = z1.getReal() * z2.getImaginario() + z1.getImaginario() * z2.getReal();
        return new numeroComplejo (real, imaginario);
    }
    
    public numeroComplejo conjugado (numeroComplejo Z){
        double real = Z.getReal();
        double imaginario = Z.getImaginario () * -1;
        return new numeroComplejo (real, imaginario);
    }
    
    public numeroComplejo dividirComplejos(numeroComplejo z1, numeroComplejo z2){
        numeroComplejo numerador = multiplicarcomplejos(z1,conjugado(z2));
        double denominador = Math.pow(z2.getReal(), 2) + Math.pow(z2.getImaginario(), 2);
        return new  numeroComplejo(numerador.getReal() / denominador, numerador.getImaginario() / 2);
        
    }
    
}
