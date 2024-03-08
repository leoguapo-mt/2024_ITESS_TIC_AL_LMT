package potencias.i;

import java.util.Scanner;

/**
 *
 * @author leoguapo-mt
 */
public class potenciasdei {

    private int potenciaNumerador;
    private int potenciaDenominador;

    public potenciasdei(int potenciaNumerador, int potenciaDenominador) {
        this.potenciaNumerador = potenciaNumerador;
        this.potenciaDenominador = potenciaDenominador;

    }

    @Override
    public String toString() {
        int potenciaFinal = this.potenciaNumerador - this.potenciaDenominador;
        potenciaFinal %= 4;

        if (potenciaFinal == 0 || potenciaFinal == -2) {
            return "1";
        }
        if (potenciaFinal == 1 || potenciaFinal == -3) {
            return "i";
        }
        if (potenciaFinal == 2) {
            return "-i";
        }
        return "-i";
    }
}
