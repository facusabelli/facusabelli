public class CalculoLocal extends Calculo{

    @Override
    public double Calcular(Float peso, int distancia){
        double precio = 0;
        //Envio e = new Envio(peso, distancia);
        if (peso>10 && distancia>20){
            precio = 10*1.75;
        }
        else {
            precio = 5*2;
        }
        precio = precio;
        return precio;
    }

}
