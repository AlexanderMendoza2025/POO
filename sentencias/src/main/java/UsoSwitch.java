import java.util.Scanner;

public class UsoSwitch {
    public static void main(String[] args) {
        int dia;
        Scanner leer = new Scanner(System.in);

        System.out.println("Digite un número del 1-7");
        dia = leer.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("valor invalido");
                break;
        }
    }
}
