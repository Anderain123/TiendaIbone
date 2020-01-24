import java.util.ArrayList;
/**
 * Write a description of class ListarProducto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListarProducto
{

    public void listar(ArrayList<String> listaPro)
    {
        System.out.print("Lista de productos ");

        {

            for ( int productito: listaPro){

                System.out.print( productito); 

                System.out.print(" ");
            }
            System.out.println("");

        }
    }
}