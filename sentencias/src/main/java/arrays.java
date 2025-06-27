public class arrays {
    public static void main(String[] args) {
        String[] frutas = new String[5];

        frutas[0] = "Melon";
        frutas[1] = "sandia";
        frutas[2] = "Mango";
        frutas[3] = "Manzana";
        frutas[4] = "Mamones";

        for (String fruta : frutas){
            System.out.println(fruta);
        }
    }
}
