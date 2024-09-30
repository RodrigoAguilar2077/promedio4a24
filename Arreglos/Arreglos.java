import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Arreglos {
    public static void main(String[] args) throws IOException {
        // Declaración y construcción de un arreglo
        int[] arreglo1 = new int[5];

        // Asignación de valores al arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = i + 1;
        }

        System.out.println("Contenido del primer arreglo:");
        // Imprimir el contenido del arreglo1
        for (int elemento : arreglo1) {
            System.out.println("Elemento: " + elemento);
        }

        // Declaración de un arreglo
        double[] arreglo2;

        // Objetos para introducir valores
        BufferedReader Bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        // Tamaño del arreglo
        int t;

        System.out.println("¿Cuál es el tamaño del arreglo?");
        entrada = Bufer.readLine();
        t = Integer.parseInt(entrada);

        // Construimos el arreglo
        arreglo2 = new double[t];

        // Rellenar el arreglo mediante teclado
        for (int i = 0; i < arreglo2.length; ++i) {
            System.out.println("Escribe el elemento [" + (i + 1) + "]: ");
            entrada = Bufer.readLine();
            arreglo2[i] = Double.parseDouble(entrada);
        }

        // Imprimir el contenido del arreglo2
        System.out.println("Contenido del arreglo2:");
        for (double numero : arreglo2)
            System.out.println("Valor del arreglo: " +  numero);
    }
}
