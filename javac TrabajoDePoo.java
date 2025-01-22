public class TrabajoDePoo {
    public int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    
    public int resta(int numero1, int numero2){
        return numero1 - numero2;
    }
}


public class Main {
    public static void main(String[] args){
        
       TrabajoDePoo problemas = new TrabajoDePoo();
        
        int numero1 = 4;
        int numero2 = 2;
        
         System.out.println("Resultado de la suma: " + problemas.suma(numero1, numero2));
        System.out.println("Resultado de la resta: " + problemas.resta(numero1, numero2));
         
        
    }
}
