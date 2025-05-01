import java.util.Scanner;

public class App {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um Número inteiro para verificar se é par ou ímpar: ");
        int N1 = sc.nextInt();
        if ((N1 % 2) == 0) {
            System.out.println("O número "+N1+" é par.");
        }else{
            System.out.println("O número "+N1+" é impar.");
        }
        sc.close();
    }
}
