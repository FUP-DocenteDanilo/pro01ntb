
package parcial_estruc;

import java.util.Scanner;


public class Parcial_Estruc {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notasEstudiantes = {
            {90.5, 85.0, 92.0, 88.5},   // Notas del Estudiante 1
            {78.0, 88.5, 92.5, 76.0},   // Notas del Estudiante 2
            {85.5, 89.0, 93.0, 91.5}    // Notas del Estudiante 3

        };
        
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Calcular el promedio de notas");
            System.out.println("2. Encontrar la nota máxima");
            System.out.println("3. Intercambiar las notas");
            System.out.println("4. Mostrar la matriz de notas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    calcularPromedio(notasEstudiantes);
                    break;
                case 2:
                    encontrarNotaMaxima(notasEstudiantes);
                    break;
                case 3:
                    intercambiarNotas(notasEstudiantes);
                    break;
                case 4:
                    mostrarMatrizNotas(notasEstudiantes);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 0);
        
        scanner.close();
    }
    
    public static void calcularPromedio(double[][] notasEstudiantes) {
        double sumaNotas = 0;
        int totalNotas = 0;
        for (int i = 0; i < notasEstudiantes.length; i++) {
            for (int j = 0; j < notasEstudiantes[i].length; j++) {
                sumaNotas += notasEstudiantes[i][j];
                totalNotas++;
            }
        }
        double promedio = sumaNotas / totalNotas;
        
        System.out.println("El promedio de las notas es: " + promedio);
    }
    
    public static void encontrarNotaMaxima(double[][] notasEstudiantes) {
        double notaMaxima = notasEstudiantes[0][0];
        for (int i = 0; i < notasEstudiantes.length; i++) {
            for (int j = 0; j < notasEstudiantes[i].length; j++) {
                if (notasEstudiantes[i][j] > notaMaxima) {
                    notaMaxima = notasEstudiantes[i][j];
                }
            }
        }
        
        System.out.println("La nota máxima es: " + notaMaxima);
    }
    
    public static void intercambiarNotas(double[][] notasEstudiantes) {
        double[] temp = notasEstudiantes[0];
        notasEstudiantes[0] = notasEstudiantes[2];
        notasEstudiantes[2] = temp;
        
        System.out.println("Notas intercambiadas correctamente.");
    }
    
    public static void mostrarMatrizNotas(double[][] notasEstudiantes) {
        System.out.println("Matriz de notas:");
        for (int i = 0; i < notasEstudiantes.length; i++) {
            for (int j = 0; j < notasEstudiantes[i].length; j++) {
                System.out.print(notasEstudiantes[i][j] + " ");
            }
            System.out.println();
        }
    }
}
