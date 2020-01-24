import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Especifico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Especifico
{
    Producto producto = new Producto();

    /**
     * Constructor for objects of class Especifico
     */
    public Especifico()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void verEspecifico(String palabra)
    {
       System.out.println(palabra + producto.getNombre());
        
    }
}
