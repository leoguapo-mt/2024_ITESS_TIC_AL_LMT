package calculadoraCompleja;

/**
 *
 * @author leoguapo-mt
 */
public class numeroComplejo {

    //atributos clase
    private double real;
    private double imaginario;
    
    //getters clase (siempre que se encapsula debe haber un set y un get

    

    //constructor clase
    public numeroComplejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    @Override
    public String toString() {
        double real  = this.getReal();
        double imaginario = this.getImaginario();
        
//        if (real == 0 && imaginario == 0) {
//            return "0"; 
//        }
//        String complejo = (real != 0 ? "" : real "");
        
        
        
        
        return this.real + "+" + this.imaginario + "i";
    }
    
    public double getReal(){
        return this.real;
    }
    public double getImaginario(){
        return this.imaginario;
    }
}
