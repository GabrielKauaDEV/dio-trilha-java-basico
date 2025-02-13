public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
      //tipos primitivos  
        byte idade = 123;
        short ano = 2020;
        int cep = 25935252; //se começar com zero pode haver problemas, ao começar com 0 é normal declarar como tipo String
        long cpf = 98563789102L; //se começar com zero pode haver problemas, ao começar com 0 é normal declarar como tipo String
        float pi = 3.14F; 
        double salarioMinimo = 2500.33;

        //é necessario usar o F no final de um valor float e L no final de um valor long para evitar alteração do tipo de dado
        
        //declaração de constante
        final String MEU_NOME = "Gabriel";  
    }
}
