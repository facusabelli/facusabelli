public class CalculoProveedor extends Calculo{

    @Override
    public double Calcular(Float peso, int distancia){
        double precio = 0;
        //Envio e = new Envio(peso, distancia);
        if (peso>5){
            precio = 5*1.25;
        }
        else {
            precio = 2*2;
        }
        precio = precio;
        return precio;
    }

}
