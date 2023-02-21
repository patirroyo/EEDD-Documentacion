package ejercicio0000301;
/** Todos los comentarios deben estar escritos antes del método o de lo que quieras comentar
 * Este comentario corresponde a la clase Calculadora, que es una calculadora, evidentemente.
 * @version 1.0 origen de ClassRoom
 * @author Alberto Saz
 */
public class Calculadora {
	/**
	 * Este comentario corresponde a la constante PI, que es el numero pi.
	 * @version 1.0 origen de ClassRoom
	 * @author Alberto Saz
	 * @param PI double constante
	 */
    private static final double PI = 3.14159265358979;
    /**
	 * Corresponde a la constante E, que es el numero e.
	 * @version 1.0 origen de ClassRoom
	 * @author Alberto Saz
	 * @param E double constante
	 */
    private static final double E = 2.718281828459;
    /**
	 * Método constructor, vacío ni pide ni devuelve
	 * @version 1.0 origen de ClassRoom
	 * @author Alberto Saz
	 */
    public Calculadora() {
    }
    /**
	 * Metodo sumar, suma dos numeros.
	 * @version 1.0 origen de ClassRoom
	 * @author Alberto Saz
	 * @param a double sumando1
	 * @param b double sumando2
	 * @return a + b
	 */
    public double sumar(double a, double b){
        return a + b;
    }
    /**
   	 * Metodo restar, resta dos numeros.
   	 * @version 1.0 origen de ClassRoom
   	 * @author Alberto Saz
   	 * @param a double minuendo
   	 * @param b double sustraendo
   	 * @return a - b
   	 */
    public double restar(double a, double b){
        return a - b;
    }
    /**
   	 * Metodo multiplicar, multiplica dos numeros.
   	 * @version 1.0 origen de ClassRoom
   	 * @author Alberto Saz
   	 * @param a double factor1
   	 * @param b double factor2
   	 * @return a * b
   	 */
    public double multiplicar(double a, double b){
        return a * b;
    }
    /**
   	 * Metodo dividir, divide un numero entre otro.
   	 * @version 1.0 origen de ClassRoom
   	 * @author Alberto Saz
   	 * @param a double dividendo
   	 * @param b double divisor
   	 * @return cociente a/b o AricmeticException si se intenta dividir entre cero
   	 */
    public double dividir(double a, double b){
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("Intento de división entre cero.");
        }
    }
    /**
   	 * Metodo potencia, eleva un numero a la potencia del exponente.
   	 * @version 1.0 origen de ClassRoom
   	 * @author Alberto Saz
   	 * @param base double base
   	 * @param exponente double exponente
   	 * @return base^exponente
   	 */
    public double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }
    /**
   	 * Metodo valorAbsoluto, devuelve el valor absoluto de un numero.
   	 * @version 1.0 origen de ClassRoom
   	 * @author Alberto Saz
   	 * @param valor double, el numero
   	 * @return valor absoluto del numero
   	 */
    public double valorAbsoluto(double valor){
        return Math.abs(valor);
    }
}
