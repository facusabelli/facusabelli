public class main {
    public static void main(String[] args){
        Libro b = new Libro(100,"el principito","Kapelusz");
        SistemaDeRegistro SR = new SistemaDeRegistro();
        SR.libros(b);


    SR.LibrosVendidosSegunEditorial();

}
}