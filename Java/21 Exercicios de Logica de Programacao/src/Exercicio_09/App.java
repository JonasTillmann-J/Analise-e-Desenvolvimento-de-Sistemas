import java.util.Scanner;

public class App {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número para calcular: ");
        int N1 = sc.nextInt();
        System.out.println("Informe o segundo número para calcular: ");
        int N2 = sc.nextInt();
        int soma = (N1+N2);
        int subtracao = (N1-N2);
        int multiplicacao = (N1*N2);
        System.out.println("A soma é: " + soma+
                "\nA subtração é: " + subtracao +
                "\nA multiplicação é: " + multiplicacao +
                "\nA divisão é: " + (N2 != 0 || N1 != 0 ? (double)N1/N2 : "Operação invalidada : Não é possivel dividir por zero"));
                /*
                *                                   |Ação caso |
                                                    |resposta  |
                                                    |seja falso|
                *                                       |
                *   (N2 != 0 || N1 != 0 ? (double)N1/N2 : "Operação invalidada 
                *       /          /    | |Ação caso    |
                *   |Condição Booleana| | |Resposta seja|
                *                       | |vedadeira    |
                *                       |            
                *                       |
                *                   |Operador Como se fosse o IF|
                * 
                */
        sc.close();
    }
}
