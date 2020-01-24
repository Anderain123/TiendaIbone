import java.util.HashMap;

/**
 * Tenemos que importar la libreria para utilizar dicha clase  .
 * En la clase crearemos 2 variables que van a ser unas cadenas.
 * hay que crear la clase HashMap.
 * El HashMap utilizara enteros y objeto tipo linea
 * @author (Ibone) 
 * @version (a version number or a date)
 */
public class Pedido
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, Linea> map;
    String direccion;
    String nombreCliente;
    /**
     * Inicializaremos nuestro objeto creado y lo crearemos
     */
    public Pedido()
    {
        map=new HashMap<>();
       
    }
    /**
     * Este metodo consiste en crear objetos del tipo map.
     * @param utiliza un tipo entero y un parametro linea
     */
    public void añadir(int codigo, Linea linea )
    {
        map.put(codigo, linea);
    }
    /**
     * Este metodo consiste en eliminar el objeto que hemos creado
     * @param utiliza un entero 
     */
    public void eliminar(int codigo)
    {
        map.remove(codigo);
    }
}
