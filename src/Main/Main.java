/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Main {

    
    public static void main(String[] args) {
        
        //Creacion de la lista Productos
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean Seguir = true;

        //Ciclo repetivo para ingresar productos
        while (Seguir) {
            System.out.println("Ingrese el ID del producto:");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la marca del producto:");
            String marca = scanner.nextLine();

            System.out.println("Ingrese el precio del producto:");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 

            Producto producto = new Producto(id, nombre, marca, precio);
            productos.add(producto);
            scanner.nextLine();

            //Se crea esta condicion con el objetivo de preguntarnos si queremos seguir registrando productos o no
            System.out.println("¿Desea registrar otro producto? (Simon/Nelson)");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("Nelson")) {
                Seguir = false;
            }
        }
        scanner.nextLine();

        //Muestra de los productos registrados
        System.out.println("Productos registrados:");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            System.out.println("ID: " + producto.getId());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Marca: " + producto.getMarca());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println();
        }
    }
}
