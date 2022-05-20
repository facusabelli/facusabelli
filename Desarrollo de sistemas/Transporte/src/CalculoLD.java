public class CalculoLD extends Calculo{

    @Override
    public double Calcular(Float peso, int distancia){
        double precio = 0;
        //Envio e = new Envio(peso, distancia);
        if (peso>10 && distancia>20){
            precio = 10*15;
        }
        else {
            precio = 7*distancia;
        }
        precio = precio;
        return precio;
    }

}
