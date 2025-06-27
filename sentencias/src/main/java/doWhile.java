import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        String opt;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Quieres salir?");
            opt = leer.nextLine();
        }while (opt.equalsIgnoreCase("no"));
        System.out.println("Adios");
    }
}
