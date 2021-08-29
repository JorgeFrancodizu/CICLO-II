
public class Lavadora extends Electrodomestico{
    
    public String programa_lavado;
    public String consumo_agua;

    public Lavadora(String capacidad, String color, String marca, String consumo_energia,String programa_lavado, String consumo_agua) {
        super(capacidad, color, marca, consumo_energia);
        this.programa_lavado = programa_lavado;
        this.consumo_agua = consumo_agua;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nprograma_lavadado:" + programa_lavado + "\nconsumo_agua:" + consumo_agua + "L/ano";
    }
    
}
