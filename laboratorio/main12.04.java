import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner ingreso1 = new Scanner(System.in);
        Scanner ingreso2 = new Scanner(System.in);
        Scanner ingreso3 = new Scanner(System.in);
        Scanner ingreso4 = new Scanner(System.in);
        Scanner ingreso5 = new Scanner(System.in);

        System.out.println("Ingrese un nombre");
        String textoIngresado1 = ingreso1.nextLine();

        System.out.println("Ingrese una edad");
        int textoIngresado2 = ingreso2.nextInt();

        System.out.println("Ingrese un DNI");
        int textoIngresado3 = ingreso3.nextInt();

        System.out.println("Ingrese un telefono");
        int textoIngresado4 = ingreso4.nextInt();

        System.out.println("Ingrese una Direccion");
        String textoIngresado5 = ingreso5.nextLine();

        System.out.println("----------------------------------------------------");

        Persona persona1 = new Persona(textoIngresado1,textoIngresado2,textoIngresado3,textoIngresado4,textoIngresado5);
        System.out.println(persona1);

        String n = persona1.getNombre();
        int e = persona1.getEdad();
        int d = persona1.getDni();
        int t = persona1.getTelefono();
        String dir = persona1.getDireccion();

        System.out.println(n)
        System.out.println(e)
        System.out.println(d)
        System.out.println(t)
        System.out.println(dir)

        persona1.setDatos(tipoDeDato,nuevoDatoInt,nuevoDatoString);

    }

}
