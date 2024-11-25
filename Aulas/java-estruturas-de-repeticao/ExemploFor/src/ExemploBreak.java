public class ExemploBreak {
    
    public static void main(String[] args) {
    
        for(int numero = 1; numero <= 8; numero++){
            if(numero == 3)
                continue;
            else if(numero ==6)
                break;
            System.out.println(numero);        
        }

    }
}
