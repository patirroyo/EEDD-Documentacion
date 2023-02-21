package ejercicio0000353;

/**
 * Esta clase tiene un método main en el que se llama al método
 * sumar que también esta definido en la clase, no devuelve nada
 * pero suma los dos números.
 * @version 1.0 Origen desde ClassRoom
 * @author Alberto Saz
 */
public class DocumentarFuncion {
    /**
     * Método main, ejecutable
     * @version 1.0 Origen desde ClassRoom
     * @author Alberto Saz
     * @param args porque lo pone el IntelliJ
     */
    public static void main(String[] args) {
        sumar(0, 0);
    }

    /**
     * @version 1.0 Origen desde ClassRoom
     * @param a un entero, sumando1
     * @param b un entero, sumando2
     * @return a+b, la suma de ambos números.
     */
    public static int sumar(int a, int b) {
        return a + b;
    }
}
