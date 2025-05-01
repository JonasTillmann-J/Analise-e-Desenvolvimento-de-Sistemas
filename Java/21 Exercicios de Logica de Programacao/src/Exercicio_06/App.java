import java.util.Scanner;

public class App {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade para verificarmos: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você é menor de idade!");
        }
        sc.close();
    }
}
