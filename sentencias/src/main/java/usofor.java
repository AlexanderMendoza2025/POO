import java.util.Scanner;

public class usofor {
    public static void main(String[] args) {
        //cliclo for
        int num;
        Scanner leer = new Scanner(System.in);

        System.out.println("dime un numero");
        num = leer.nextInt();

        for (int i =1;i<=num;i++){
            System.out.println(i*4);
        }
    }
}
