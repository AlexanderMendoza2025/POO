public class arreglos {
    public static void main(String[] args) {
        //arrays de enteros
        //Notas y obtener el promedio

        int[] notas = new int[4];
        notas[0] = 80;
        notas[1] = 90;
        notas[2] = 85;
        notas[3] = 60;

        float promedio, suma=0;
        int contador = 0;
        while (contador < 4){
            suma += notas[contador];
            contador++;
        }

        promedio = suma / notas.length;
        System.out.println("El promedio es. "+ promedio);
    }
}
