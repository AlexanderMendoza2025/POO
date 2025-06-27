import Persona.Persona;

public class Main {
    public static void main(String[] args) {
        Persona[] persona = new Persona[3];

        persona[0] = new Persona("Juan",18,"Sistema");
        persona[1] = new Persona("Maria",22,"Sistema");
        persona[2] = new Persona("Carlos",19,"Sistema");

        for (Persona p : persona){
            p.mostrarInformacion();
        }
    }
}
