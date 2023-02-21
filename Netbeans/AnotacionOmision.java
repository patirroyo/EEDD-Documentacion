package ejercicio0000335;

@SuppressWarnings("")
public class AnotacionOmision {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Suma: " + calculadora.sumar(2, 3));
        System.out.println("Suma: " + calculadora.sumar((double)2, 3));
    }
}

class Calculadora {
    @Deprecated
    public int sumar(int a, int b){
        return a + b;
    }
    
    public double sumar(double a, double b){
        return a + b;
    }
}
