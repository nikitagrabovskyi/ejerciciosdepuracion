package ejercicios.depuracion;

// PROGRAMA QUE LEE UN NÚMERO N Y MUESTRA N ASTERISCOS
import java.util.*;

public class Ejemplo2While {

    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int n, contador = 0;
        System.out.print("Introduce un número: ");
        n = pedirNumero();
        while (contador < n) {
            System.out.print("* ");
            System.out.println("contador: " + contador);
            contador++;
        }
    }
}
