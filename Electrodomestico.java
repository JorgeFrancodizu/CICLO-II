
public class Electrodomestico {
    public String capacidad;
    public String color;
    public String marca;
    public String consumo_energia;

    public Electrodomestico(String capacidad, String color, String marca, String consumo_energia) {
        this.capacidad = capacidad;
        this.color = color;
        this.marca = marca;
        this.consumo_energia = consumo_energia;
    }
    
    @Override
    public String toString(){
        return "\tElectrodomestico capacidad: " + capacidad + "kg" + "\ncolor: " + color + "\nmarca: " + marca + "\nconsumo_energia: " + consumo_energia + "kwh/mes";
    }
}
