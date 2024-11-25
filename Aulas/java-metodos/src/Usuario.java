public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();
    
        smartTV.ligar();
        
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
    
        smartTV.subirCanal();
        smartTV.subirCanal();
       
        System.out.println("Canal: " + smartTV.canal);

        smartTV.mudarCanal(10);

        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.desligar();
    
    
    
    
    
    }
}
