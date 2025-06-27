import java.util.Scanner;

public class edades {
    public static void main(String[] args) {
        //leer 10  edades y decir cual es mayor
        int[] edades = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < edades.length; i++){
            System.out.println("Ingrese una edad:");
            edades[i] = sc.nextInt();
        }

        int mayor = 0;
        for (int edad : edades){
            if (edad > mayor){
                mayor = edad;
            }

        }

        System.out.println("la edad mayor es:" + mayor);
    }
}
