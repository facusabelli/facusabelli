import java.util.HashSet;

public class Madre extends Persona{

    private String empresa;
    private HashSet<Hijo> HashHijo;

    public Madre(String nombre, int edad, int dni,String empresa) {
        super(nombre, edad, dni);
        this.empresa=empresa;
        this.HashHijo = new HashSet<>();
    }

    public void RegistrarHijo(Hijo a){
        this.HashHijo.add(a);
    }
    
    public void HijosMenoresDeEdad(){
        System.out.println("hijos menores de edad:");
        for(Hijo a : this.HashHijo){
            if(a.getEdad()<=17){
                System.out.println(a.getNombre());
            }
        }
    }
}