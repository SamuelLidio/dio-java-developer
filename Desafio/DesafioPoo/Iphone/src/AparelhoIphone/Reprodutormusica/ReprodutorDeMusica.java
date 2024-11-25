package AparelhoIphone.Reprodutormusica;

public interface ReprodutorDeMusica {


    default void pausar() {
        System.out.println("Pausando musica.");

    }

    default void tocar(){
        System.out.println("Tocando musica.");
    
    }

    default void escolherMusica(){
        System.out.println("Escolhendo a musica.");
    }


}
    

