public class Alumno extends Persona{

    private String curso;

    public Alumno(String nombre, int edad, int dni, String curso) {
        super(nombre, edad, dni);
        this.curso=curso;
        this.HashAlumno = new HashSet<>();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
