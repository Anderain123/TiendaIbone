import java.util.Scanner;
/**
 * Write a description of class añadirProducto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AñadirProducto
{
    private Scanner sc;
    
    /**
     * Constructor for objects of class añadirProducto
     */
    public AñadirProducto()
    {
        sc = new Scanner(System.in);
    }
    
/**
     * Pide el nombre, el precio y la cantidad del producto a enviar, luego crea 
     * el preoducto, la linea y la mete en orden en el pedido.
     * 
     * @see Producto
     * @see Linea
     */
    public void añadirProducto()
    {
        System.out.println("Dime el nombre del producto");
        String prod = sc.next();
        System.out.println("Dime el precio del producto");
        double prec = sc.nextDouble();
        
        Producto produ = new Producto();
        produ.setNombre(prod);
        produ.setPrecio(prec);
        
    }
}
