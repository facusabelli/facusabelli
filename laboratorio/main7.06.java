public class main {
    public static void main(String[] args){
        Alumno facundo = new Alumno("facundo",17,23456789,"quinto");
        facundo.AgregarNota();
        facundo.MenorNota();
        facundo.MayorNota();
        facundo.PromedioNota();
        facundo.agregarMateria();
    }
}
