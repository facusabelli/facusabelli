package  com.company ;

public  class  Main {

public  static  void  main ( String [] args ) {
        Persona p1 =  nueva  Persona ();
        Persona p2 =  nueva  Persona ( " jose " );
        Persona p3 =  nueva  Persona ( " pablo " , 2 , 2345678 , 23456789 , " Triunvirato 2345 " );
        
        int e1= p1.getEdad();
        System.out.println(e1);
        p1.setEdad(e1*2);
        e1= p1.getEdad();
        System.out.println(e1);

        int t2= p2.getTelefono();
        System.out.println(t2);
        p2.setTelefono(12348765);
        t2= p2.getTelefono();
        System.out.println(t2);

        String n3 = p3.getNombre();
        int e3 = p3.getEdad();
        int d3 = p3.getDni();
        int t3 = p3.getTelefono();
        String dir3 = p3.getDireccion();
        System.out.println(n3)
        System.out.println(e3)
        System.out.println(d3)
        System.out.println(t3)
        System.out.println(dir3)



