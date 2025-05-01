import java.util.Scanner;

public class App {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de um numero inteiro, possitivo, negativo ou igual a zero:");
        int N1 = sc.nextInt();
        if(N1 > 0){
            System.out.println("O número " + N1 + " é positivo.");
        } else if(N1 < 0){
            System.out.println("O número " + N1 + " é negativo.");
        }else{
            System.out.println("O número " + N1 + " é igual a zero.");
        }
        sc.close();
    }
}
