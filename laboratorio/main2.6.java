public class main {
    public static void main(String[] args){

    Madre madre1 = new Madre("Maria",45,2276132,"Samsung");
    Hijo hijo1 = new Hijo("Nicolas",10,4500372,"Politecnico Modelo","FIFA");
    madre1.RegistrarHijo(hijo1);
    madre1.HijosMenoresDeEdad();
    }
}