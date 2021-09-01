public static ArrayList<Integer> tipo_ropa(ArrayList<Integer> lista1){       
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++){            
            if(!lista2.contains(lista1.get(i))){                
                lista2.add(lista1.get(i));
            }
        }    
        return lista2;     
    }
    
    public static List<Integer> ropa_faltante (List<Integer> lista1,List<Integer> lista2, int X){
        
        List<Integer> lista3 = new ArrayList<>();
        List<Integer> lista4 = new ArrayList<>();
        
        for (int i = 0; i < lista2.size(); i++){
            
            if (Objects.equals(X, lista2.get(i))){
                lista3.add(i);
            }
        }
        for (int i = 0; i < lista1.size(); i++){
            for (int j = 0; j < lista3.size(); j++){
                if (Objects.equals(lista1.get(i), lista3.get(j))){
                    lista4.add(lista1.get(i));
                }
            }
        }
        return lista4;
    }
   
    public static List<Integer>  novendo (List<Integer> lista1, List<Integer> lista2){
        List<Integer> lista3 = new ArrayList<>();
        
        for (int i = 0; i < lista1.size(); i++){
            
            if (!lista2.contains(lista1.get(i))){
                
                lista3.add(lista1.get(i));
            }
        }
        
        return lista3;
    }
    
    public static Integer cambio_socios (List<Integer> lista1, List<Integer> lista2){
        
        int contadorLista1 = 0;
        
        for (int i = 0; i < lista1.size(); i++) {
            
            if (!lista2.contains(lista1.get(i))) {
                
                contadorLista1++;
            }
        }
        
        int contadorLista2 = 0;
        
        for (int i = 0; i < lista2.size(); i++){
            
            if (!lista1.contains(lista2.get(i))) {
                
                contadorLista2++;
            }
        }
        
        if (contadorLista1 > contadorLista2) {
            return contadorLista2;
        } else {
            return contadorLista1;
        }
    }
                
}                                        
    
