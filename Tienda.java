import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {
    public static List<Electrodomestico> Electrodomesticos = new ArrayList<>();
    
    public static void agregarElectrodomestico(String comando){
        String[] comandoListado = comando.split("&");
        String tipo = comandoListado[1];
        String capacidad = comandoListado[2];
        String color = comandoListado[3];
        String marca = comandoListado[4];
        String energia = comandoListado[5];
        
        if(tipo.equals("Nevera")){
            String temperatura = comandoListado[6];
            Nevera nuevaNevera = new Nevera(capacidad, color, marca, energia, temperatura);
            Electrodomesticos.add(nuevaNevera);
        } else {
            String programa_lavado = comandoListado[6];
            String consumo_agua  = comandoListado[7];
            Lavadora nuevaLavadora = new Lavadora(capacidad,color,marca,energia,programa_lavado,consumo_agua);
            
            Electrodomesticos.add(nuevaLavadora);
        }                  
    }
    public static void listar_items_tienda(){
        System.out.println("***Tienda la Pipa***");
        
        Electrodomesticos.forEach((item) -> {
            
            System.out.println(item);
        }
                
        );
    }
    
    public static void procesarComandos(){
        Scanner entrada = new Scanner(System.in);
        String comando = entrada.nextLine();
        char opcion = comando.charAt(0);
        
        do {
            
            switch (opcion){
                case '1':
                    agregarElectrodomestico(comando);
                    comando = entrada.nextLine();
                    opcion = comando.charAt(0);
                    break;
                case '2':
                    listar_items_tienda();
                    comando = entrada.nextLine();
                    opcion = comando.charAt(0);
                    break;
                    
            }
        } while(opcion == '1' || opcion == '2');
    }
    
    public static void main(String[] args) {
        procesarComandos();
    }
}
