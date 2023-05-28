import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Arrays;

import java.time.LocalDateTime;

public class Main{

    public static void main(String[] args){

        

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // int[] numeros = {9, 10, 12, 25, 2};
        // int maior = numeros[0];
        // int menor = numeros[0];
        // int media = 0;

        // for(int i = 0; i < numeros.length; i++){
        //     if(numeros[i] > maior){
        //         maior = numeros[i];
        //     }
        //     if(numeros[i] < menor){
        //         menor = numeros[i];
        //     }
        //     media += numeros[i];
        // }

        // System.out.println("Maior: " + maior);
        // System.out.println("Menor: " + menor);
        // System.out.println("Média: " + media/numeros.length);

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // String[] letras = new String[5];

        // letras[0] = "A";
        // letras[1] = "B";
        // letras[2] = "C";
        // letras[3] = "D";
        // letras[4] = "E";

        // for(int i = 0; i < letras.length; i++) {
        //     System.out.println(letras[i]);
        // }

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // String[] letras = {"A", "B", "C", "D", "E"};
        // for(int i = 0; i < letras.length; i++) {
        //     System.out.println(letras[i]);
        // }

        // System.out.println(Arrays.toString(letras));

        // System.out.println(numeros);

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // for(int i = 1; i <= 10; i++){
        //     for(int j = 1; j <= 10; j++){
        //         System.out.println(j + " x " + i + " = " + j*i);
        //     }
        // }

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // String nome = "José Eduardo";

        // LocalDate hoje = LocalDate.now();
        // Locale brasil = new Locale("pt", "BR");
        // String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        // String saudacao;
        // LocalDateTime agora = LocalDateTime.now();

        // if(agora.getHour() >= 0 && agora.getHour() < 12){
        //     saudacao = "Bom dia";
        // } else if(agora.getHour() >= 12 && agora.getHour() < 18){
        //     saudacao = "Boa tarde";
        // } else if(agora.getHour() >= 18 && agora.getHour() < 0){
        //     saudacao = "Boa noite";
        // } else {
        //     saudacao = "Olá";
        // }

        // System.out.printf("Olá, %s. Hoje é %s., %s.", nome, diaSemana, saudacao.toUpperCase());

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // System.out.println(nome.toUpperCase());
        // System.out.println(nome.toLowerCase());
        // System.out.println(nome.length());

        // String outroNome = "josé Eduardo";
        // System.out.println(nome.equals(outroNome));
        // System.out.println(nome.equalsIgnoreCase(outroNome));

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // int nota = 100;
        // String graduacao;

        // // if(nota >= 70){
        // //     System.out.println("Aluno Aprovado!");
        // // } else{
        // //     System.out.println("Aluno Não Aprovado!");
        // // }
        
        // if(nota >= 80){
        //     // System.out.println("Graduação A");
        //     graduacao = "A";
        // } else if(nota < 80 && nota >= 70){
        //     // System.out.println("Graduação B");
        //     graduacao = "B";
        // } else if(nota < 70 && nota >= 60){
        //     // System.out.println("Graduação C");
        //     graduacao = "C";
        // } else if(nota < 60 && nota >= 0){
        //     // System.out.println("Graduação D");
        //     graduacao = "D";
        // } else {
        //     // System.out.println("Nota Inválida!");
        //     graduacao = "";
        // }

        // switch(graduacao){
        //     case "A":
        //     case "B":
        //         System.out.println("Aluno Aprovado!");
        //         break;
        //     case "C":
        //     case "D":
        //         System.out.println("Aluno Não Aprovado.");
        //         break;
        //     default:
        //         System.out.println("Graduacao Inválida");
        // }

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // boolean fimDeSemana = true;
        // boolean fazendoSol = true;

        // boolean vamosAPraia = fimDeSemana && fazendoSol;

        // // System.out.println(vamosAPraia);

        // String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";

        // System.out.println(mensagem);

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // String nome;

        // nome = "José Eduardo Nogueira";

        // System.out.println("Olá "+nome+"!");

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // int a;
        // int b = 2;
        // a = 3;
        // int soma = a + b;
        // int subt = a - b;
        // int mult = a * b;
        // float divi = (float) a / b; //cast ou coerção

        // System.out.println(soma);
        // System.out.println(subt);
        // System.out.println(mult);
        // System.out.println(divi);

    }

}