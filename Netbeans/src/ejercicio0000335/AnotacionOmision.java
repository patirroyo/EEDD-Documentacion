package ejercicio0000335;


/**
 * Esta clase tiene un método main en el que se llama a la clase Calculadora
 * que también esta definido en la clase, nos mostrará por pantalla
 * dos lineas, correspondientes al método sumar que es polimorfo y admite
 * int y double
 * @version 1.0 Origen desde ClassRoom
 * @author Alberto Saz
 */
@SuppressWarnings("")
public class AnotacionOmision {
    /**
     * Método main, principal, crea un objeto de la clase Calculadora y a
     * través de él, llama a un método suma que es polimorfo de las
     * dos maneras posibles.
     * @version 1.0 Origen desde ClassRoom
     * @param args metodo main
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Suma: " + calculadora.sumar(2, 3));
        System.out.println("Suma: " + calculadora.sumar((double)2, 3));
    }
}
/**
 * Clase calculadora, consta de un método "sumar" que es polimorfo.
 * @version 1.0 Origen de ClassRoom
 * @author Alberto Saz
 */
class Calculadora {
    @Deprecated
    /**
     * Método sumar, hace una suma de enteros
     * @version 1.0 Origen desde ClassRoom
     * @autor Alberto Saz
     * @param a int sumando1
     * @param b int sumando2
     * @return a+b int
     */
    public int sumar(int a, int b){
        return a + b;
    }
      /**
     * Método sumar, hace una suma de numeros decimales
     * @version 1.0 Origen desde ClassRoom
     * @param a double sumando1
     * @param b double sumando2
     * @return a+b double
     */
    public double sumar(double a, double b){
        return a + b;
    }
}
