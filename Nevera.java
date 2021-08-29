public class Nevera extends Electrodomestico {
    
    public String temperatura_minima;

    public Nevera(String capacidad, String color, String marca, String consumo_energia, String temperatura_minima) {
        super( capacidad, color, marca, consumo_energia);
        this.temperatura_minima = temperatura_minima;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\ntemperatura_minima:" + temperatura_minima + "C°";
    }
}

