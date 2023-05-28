public class Function{

    public static void main(String[] args){
        
        int resultado = soma(2, 3);
        System.out.println(resultado);
        
        // String nomeOriginal = "Let's Code";
        // saudacao(nomeOriginal);
    }

    public static void saudacao(String nomeParametro){
        System.out.println("Hello, " + nomeParametro + "!");
    }

    public static int soma(int a, int b){
        return a + b;
    }

}