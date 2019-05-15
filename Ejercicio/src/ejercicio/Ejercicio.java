/*
 * Ejercicio.java
 */
package ejercicio;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejemplo de la colección list. Clase con implementación de interface.
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0.
 */
public class Ejercicio implements Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> x= new ArrayList<String>();
        x.add("3"); x.add("7"); x.add("5");
        List<String> y = new Ejercicio().doSttuf(x);
        y.add("1");
        System.out.println(x);
    }

    @Override
    public List<String> doSttuf(List<String> z) {
        z.add("9");
        return z;
    }
    
}
interface Interface{
    List<String> doSttuf(List<String> s);
}
