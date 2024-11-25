package AparelhoIphone.Navegadorinternet;


public interface NavegadorInternet {

    default void exibirPagina(){
        System.out.println("Exibindo pagina na web.");

    }

    default void atualizarPagina (){
        System.out.println("Atualizando pagina web.");

    }

    default void adicionarNovaAba(){
        System.out.println("Criando nova aba.");
    }
    
}