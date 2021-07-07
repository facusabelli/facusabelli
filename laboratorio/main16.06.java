public class main {
    public static void main(String[] args){
        Dueño a = new Dueño("jose", "luis", 12345678);
        Viviendas b = new Viviendas("pablo", "ferreira", 8765432, "Congreso 1234");
        Empresas c = new Empresas("facundo", "sabelli", 87654321, "Congreso 4321", "poli");

        SistemaDeRegistro s = new SistemaDeRegistro();

        b.tarifaViviendas();
        c.tarifaempresas();
    }
}
