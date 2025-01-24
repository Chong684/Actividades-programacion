import java.util.ArrayList;
import java.util.Scanner;

public class 7PalabrasPersona {
    private String nombre;
    private int edad;
    private String correoElectronico;

    public 7PalabrasPersona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Correo: " + getCorreo());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();

        System.out.print("¿Cuántas personas deseas ingresar? ");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingresando información para la persona #" + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Correo Electrónico: ");
            String correo = scanner.nextLine();

            Persona persona = new Persona(nombre, edad, correo);
            personas.add(persona);

            System.out.println();
        }

        System.out.println("Información de todas las personas ingresadas:");
        for (Persona persona : personas) {
            persona.mostrarInfo();
        }
    }
}

//claramente chat me ayudo .-.
