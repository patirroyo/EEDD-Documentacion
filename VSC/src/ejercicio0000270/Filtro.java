package ejercicio0000270;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/**
 * Esta clase llamada Filtro realiza un filtro a una lista de numeros enteros
 * para mostrar por pantalla los que son pares
 * @author Alberto Saz
 * @version 1.0 Origen de ClassRoom
 */
public class Filtro {
    /**
     * Método main, principal se inicializa e instancia un ArrayList de int
     * Usa la function Predicate que no se lo que hace y luego
     * llama a otra funcion stream(), filter() para cada uno de los elementos 
     * de la lista, al final intuyo que muestra por pantalla cada número par
     * en cada línea.
     * @author Alberto Saz
     * @version 1.0 Origen de ClassRoom
     * @param args para el metodo main
     * @param numeros un ArrayList con los números a estudiar
     * @param esNumeroPar no se si es un metodo, una funcion o una variable
     */
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(2, 3, 4, 5, 7, 13, 10, 6, 8);
        
        Predicate<Integer> esNumeroPar = x -> x % 2 == 0;
        
        numeros.stream().filter(esNumeroPar)
                .forEach(System.out::println);
    }
}