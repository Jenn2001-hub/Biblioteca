import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<MaterialBibliografico> materiales = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n=== BIBLIOTECA - MENU PRINCIPAL ===");
            System.out.println("1. Agregar material");
            System.out.println("2. Listar materiales");
            System.out.println("3. Calcular multa");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nSeleccione el tipo de material:");
                    System.out.println("1. Libro");
                    System.out.println("2. Revista");
                    System.out.println("3. Pelicula");

                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Año: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Genero: ");
                    String genero = scanner.nextLine();

                    if (tipo == 1) {

                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();

                        System.out.print("Numero de paginas: ");
                        int paginas = scanner.nextInt();
                        scanner.nextLine();

                        materiales.add(new Libro(titulo, anio, paginas, autor, genero));
                    }

                    else if (tipo == 2) {

                        System.out.print("Numero de edicion: ");
                        int edicion = scanner.nextInt();
                        scanner.nextLine();

                        materiales.add(new Revista(titulo, anio, genero, edicion));
                    }

                    else if (tipo == 3) {

                        System.out.print("Duracion en minutos: ");
                        int duracion = scanner.nextInt();
                        scanner.nextLine();

                        materiales.add(new Pelicula(titulo, anio, duracion, genero));
                    }

                    System.out.println("Material agregado correctamente.");
                    break;

                case 2:

                    if (materiales.isEmpty()) {
                        System.out.println("No hay materiales registrados.");
                    } else {

                        System.out.println("\n=== LISTA DE MATERIALES ===");

                        for (MaterialBibliografico m : materiales) {
                            System.out.println("\n----------------------");
                            m.mostrarInformacion();
                        }
                    }

                    break;

                case 3:

                    if (materiales.isEmpty()) {
                        System.out.println("No hay materiales registrados.");
                        break;
                    }

                    System.out.print("Ingrese dias de retraso: ");
                    int dias = scanner.nextInt();

                    for (MaterialBibliografico m : materiales) {

                        double multa = m.calcularMulta(dias);

                        System.out.println("\nMaterial: " + m.getTitulo());
                        System.out.println("Multa: $" + multa);
                    }

                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");

            }

        } while (opcion != 4);

        scanner.close();
    }
}