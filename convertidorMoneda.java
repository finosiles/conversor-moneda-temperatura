


public class convertidorMoneda {

    double valor = 100;
    static double conversionaDollar;
   
    public convertidorMoneda(){

    }
    /**
     * @param valor
     */
    public static void cambioDollarPeso(double valor) {

        double cambioValor = 300;

       double conversionaDollar = cambioValor * valor;
    
    }
    public static void main(String[] args) {
        cambioDollarPeso(100);
        double cambio = conversionaDollar;
        System.out.println("Probando"  + cambio);
        
    }
}

