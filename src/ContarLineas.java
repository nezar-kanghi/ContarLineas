import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    public static void main(String[] args) {

        int contador = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {

            while (reader.readLine() != null) {
                contador++;
            }

            System.out.println("El archivo datos.txt tiene " + contador + " lineas");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
