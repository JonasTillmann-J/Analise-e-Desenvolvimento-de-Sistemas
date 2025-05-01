import java.util.Scanner;

public class App {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        double valor1, valor2, valor3, media;

        System.out.println("Digite à primera nota: ");
        valor1 = sc.nextDouble();

        System.out.println("Digite à segunda nota: ");
        valor2 = sc.nextDouble();

        System.out.println("Digite à terceira nota: ");
        valor3 = sc.nextDouble();

        media = (valor1 + valor2 + valor3) / 3;

        System.out.println("A média é: " + media);
        
        sc.close();
    }
}
