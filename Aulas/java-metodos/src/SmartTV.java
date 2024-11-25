public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    
    public void ligar(){
        ligada = true;
        System.out.println("Bem vindo!");
    }    
    public void desligar(){
        ligada = false;
        System.out.println("Até logo!");
    }
    
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
    }
    public void descerCanal(){
        canal--;
    }
}
