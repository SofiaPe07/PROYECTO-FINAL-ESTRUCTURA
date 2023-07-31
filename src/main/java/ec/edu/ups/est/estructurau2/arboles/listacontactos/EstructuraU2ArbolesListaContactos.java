/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ec.edu.ups.est.estructurau2.arboles.listacontactos;

import ec.edu.ups.est.estructurau2.arboles.listacontactos.controller.ArbolContactos;
import ec.edu.ups.est.estructurau2.arboles.listacontactos.models.Contacto;
import ec.edu.ups.est.estructurau2.arboles.listacontactos.models.Node;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class EstructuraU2ArbolesListaContactos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolContactos arbolContactos = new ArbolContactos();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Buscar Contacto");
            System.out.println("3. Eliminar Contacto");
            System.out.println("4. Agregar un correo");
            System.out.println("5. Agregar una red social");
            System.out.println("6. Imprimir el árbol");
            System.out.println("7. Obtener el número de contactos totales");
            System.out.println("8. Obtener el número de niveles del árbol");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del contacto:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el número de teléfono:");
                    String telefono = scanner.nextLine();
                    Contacto contacto = new Contacto(nombre, telefono);
                    arbolContactos.Agregar(contacto);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del contacto:");
                    nombre = scanner.nextLine();
                    contacto = arbolContactos.buscarContacto(nombre);
                    if (contacto != null) {
                        System.out.println("Nombre: " + contacto.getNombre());
                        System.out.println("Teléfono: " + contacto.getTelefono());
                        System.out.println("Correos: " + contacto.getEmails());
                        System.out.println("Redes sociales: " + contacto.getRedesSociales());
                    } else {
                        System.out.println("El contacto no existe. ¿Desea crear un nuevo contacto con ese nombre? (s/n)");
                        String respuesta = scanner.nextLine();
                        if (respuesta.equals("s")) {
                            System.out.println("Ingrese el número de teléfono:");
                            telefono = scanner.nextLine();
                            contacto = new Contacto(nombre, telefono);
                            arbolContactos.Agregar(contacto);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del contacto:");
                    nombre = scanner.nextLine();
                    if (arbolContactos.eliminar(nombre)) {
                        System.out.println("El contacto ha sido eliminado.");
                    } else {
                        System.out.println("El contacto no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el nombre del contacto:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el correo:");
                    String correo = scanner.nextLine();
                    arbolContactos.agregarCorreo(nombre, correo);
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del contacto:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese la red social:");
                    String redSocial = scanner.nextLine();
                    System.out.println("Ingrese la URL:");
                    String url = scanner.nextLine();
                    arbolContactos.agregarRedSocial(nombre, redSocial, url);
                    break;
                case 6:
                    System.out.println("Imprimir el árbol:");
                    System.out.println("1. Preorder");
                    System.out.println("2. Inorder");
                    System.out.println("3. Postorder");
                    System.out.println("4. Achura");
                    int opcionImpresion = scanner.nextInt();
                    switch (opcionImpresion) {
                        case 1:
                            arbolContactos.Preorder();
                            break;
                        case 2:

                            Node node = null;
                            arbolContactos.inorderRecursivo(node);
                            break;

                        case 3:
                            node = null;
                            arbolContactos.poserRecursivo(node);
                            break;
                         case 4:
                            arbolContactos.Achura();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    break;
                case 7:
                    System.out.println("El número de contactos totales es: " + arbolContactos.pesoArbol());
                    break;
                case 8:
                    System.out.println("El número de niveles del árbol es: " + arbolContactos.estaBalanceado());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;

            }
        }
    }
}
