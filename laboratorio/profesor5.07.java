public class Profesor extends persona{
    private static int descuento = 10;
    public Profesor(String nuevonombre, String nuevoapellido2) {
        super(nuevonombre, nuevoapellido2);
    }

    public void ProfesorOAlumno() {
        System.out.println("Profesor"+this.getApellido());
    }
}