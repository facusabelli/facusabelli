import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SistemaRegistro{

    private ArrayList<Libro> ArrayLibro;
    private HashMap<String, Integer> MapLibros;

    public SistemaDeRegistro() {
        this.ArrayLibro = new ArrayList<>();
        this.MapLibros = new HashMap<>();
    }

    public void libros(libro a){
        this.arrayLibro.add(a);
    }

    public void LibrosVendidosSegunEditorial(){

        Scanner libros = new Scanner(System.in);
        System.out.println("¿Sobre que editorial quiere ver las ventas?");
        System.out.println("1-Kapelusz,2-Sudamericana,3-Atlántida,4-ElAteneo,5-Interzona,6-Sur,7-Alianza");
        int pregunta = libros.nextInt();

        int editorial1 = 0;
        int editorial2 = 0;
        int editorial3 = 0;
        int editorial4 = 0;
        int editorial5 = 0;
        int editorial6 = 0;
        int editorial7 = 0;

        for(Libro a: ArrayLibro){
            if(a.getNombreEditorial()== "Kapelusz"){
                editorial1 += 1;
            }
            if(a.getNombreEditorial()== "Sudamericana"){
                editorial2 += 1;
            }
            if(a.getNombreEditorial()== "Atlántida"){
                editorial3 += 1;
            }
            if(a.getNombreEditorial()== "ElAteneo"){
                editorial4 += 1;
            }
            if(a.getNombreEditorial()== "Interzona"){
                editorial5 += 1;
            }
            if(a.getNombreEditorial()== "Sur"){
                editorial6 += 1;
            }
            if(a.getNombreEditorial()== "Alianza"){
                editorial7 += 1;
            }
        }

        if(pregunta==1){
            System.out.println("La editorial que eligio vendio: "+ editorial1 +"libros");
        }
        else if(pregunta==2){
            System.out.println("La editorial que eligio vendio: "+ editorial2 +"libros");
        }
        else if(pregunta==3){
            System.out.println("La editorial que eligio vendio: "+ editorial3 +"libros");
        }
        else if(pregunta==4){
            System.out.println("La editorial que eligio vendio: "+ editorial4 +"libros");
        }
        else if(pregunta==5){
            System.out.println("La editorial que eligio vendio: "+ editorial5 +"libros");
        }
        else if(pregunta==6){
            System.out.println("La editorial que eligio vendio: "+ editorial6 +"libros");
        }
        else if(pregunta==7){
            System.out.println("La editorial que eligio vendio: "+ editorial7 +"libros");
        }
        MapLibros.put("Kapelusz",editorial1);
        MapLibros.put("Sudamericana",editorial2);
        MapLibros.put("Atlántida",editorial3);
        MapLibros.put("ElAteneo",editorial4);
        MapLibros.put("Interzona",editorial5);
        MapLibros.put("Sur",editorial6);
        MapLibros.put("Alianza",editorial7);
        
        System.out.println("los libros que vendido cada editorial son: ");
        for(String i : MapLibros.keySet()){
                System.out.println("La editorial "+i+"vendio: "+MapLibros.get(i));
    }
}
