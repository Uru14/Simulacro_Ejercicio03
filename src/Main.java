import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crea un ingrediente con nombre “Galletas Oreo” y cantidad 300
        Ingrediente ingrediente = new Ingrediente("Galletas Oreo", 300);

        //Crea un ingrediente llamado “Philadelphia”
        Ingrediente ingrediente2 = new Ingrediente("Philadelphia");

        //Crea un ingrediente sin valores iniciales
        Ingrediente ingrediente3 = new Ingrediente();


        //Preguntar al usuario el numero de veces que va a repetir la receta
        //El ingrediente “Galletas Oreo” modificará la cantidad según el numero de veces
        //elegido
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas veces vas a repetir la receta?");
        try {
            ingrediente.RepetirCantidad(scanner.nextInt());
        } catch (InputMismatchException ex) {
            ingrediente.setCantidad(0);
            System.out.println("Debes introducir un número!");
        }

        //Modifica la cantidad del ingrediente “Philadelphia” de forma que su cantidad será un
        //tercio de la cantidad de “Galletas Oreo”.
        ingrediente2.setCantidad(ingrediente.getCantidad()/3);

        //El tercer ingrediente tendrá el nombre “Fideos Chocolate” y 100 gramos por cada vez
        //que se repita la receta
        ingrediente3.setNombre("Fideos Chocolate");
        ingrediente3.setCantidad(0);
        for (int i=0; i < ingrediente.getCantidad(); i++) {
            ingrediente3.setCantidad(ingrediente3.getCantidad() + 100);
        }

        //Imprime la información de todos los ingredientes
        ingrediente.imprimir();
        ingrediente2.imprimir();
        ingrediente3.imprimir();
    }
}