import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int x, cont;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero mayor a 1: ");
        x = sc.nextInt();
        cont = 1;
        while(cont <= x){
            if(cont % 2 == 0) System.out.println(cont);
            cont++; 
        }
    }
}
