import java.util.InputMismatchException;

public class Ingrediente {
    private String nombre;
    private int cantidad;

    //Constructor vacío
    public Ingrediente() {
    }
    // Constructor con todos los atributos

    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        setCantidad(this.cantidad);
    }
    // Constructor que solo reciba el nombre del ingrediente y ponga la cantidad por defecto a 0

    public Ingrediente(String nombre) {
        this.nombre = nombre;
        this.cantidad = 0;
    }
    // Métodos Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Método RepetirCantidad que recibirá un numero que indicará las veces que se va a
    //realizar la receta y tendrá que modificar la cantidad para que pueda hacerla
    public void RepetirCantidad(int numRep) {
            setCantidad(numRep);
        }

    //Método Imprimir que muestre la información completa de cada ingrediente
    public void imprimir() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Cantidad: "+getCantidad());
    }
}
