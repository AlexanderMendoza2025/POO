import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sentencias de control
        //IF
        int edad;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
