public class main {
    public static void main(String[] args){
        banco a = new banco("Santander");

        cliente b = new cliente("Facundo",12345,1234);
        cliente c = new cliente("Tobias",123456,123);
        cliente d = new cliente("Sabelli",1234567,12);

        a.agregarClientesVisitantes(b);
        a.agregarClientesVisitantes(c);
        a.agregarClientesVisitantes(d);

        a.cbusDeClientesVisitantes();

        a.imprimirHashSet(a.cbusDeClientesVisitantes());

        a.cantidadDeVisitasPorCliente(1,b);

        a.imprimirHashMap(a.cantidadDeVisitasPorCliente(4,b))
    }
}
