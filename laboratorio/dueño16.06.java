public class Dueño{
    
    private String nombre;
    private int edad;
    private int dni;

    public Dueño(String nombre,String apellido,int dni){
          this.nombre=nombre;
          this.apellido=apellido;
          this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(string apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}