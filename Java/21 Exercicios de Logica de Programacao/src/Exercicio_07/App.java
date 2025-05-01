import java.util.Scanner;

public class App {
    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int N1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int N2 = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        int N3  = sc.nextInt();

        if ((N1 > N2) && (N1 > N3)){
            System.out.println("O maior numero entre todos é o número: " + N1);
        }else if ((N2 > N1) && (N2 > N3)){
            System.out.println("O maior numero entre todos é o número: " + N2);
        }else if ((N3 > N1) && (N3 > N2)){
            System.out.println("O maior numero entre todos é o número: " + N3);
        }else if ((N1 == N2) && (N1 == N3)){
            System.out.println("Os números são iguais.");
        }else if ((N1 == N2) && (N1 > N3)){
            System.out.println("O maior numero entre todos é o número: " + N1);
        }else if ((N1 == N3) && (N1 > N2)){
            System.out.println("O maior numero entre todos é o número: " + N1);
        }else if ((N2 == N3) && (N2 > N1)){
            System.out.println("O maior numero entre todos é o número: " + N2);
        }else if ((N2 == N1) && (N2 > N3)){
            System.out.println("O maior numero entre todos é o número: " + N2);
        }else if ((N3 == N1) && (N3 > N2)){
            System.out.println("O maior numero entre todos é o número: " + N3);
        }else if ((N3 == N2) && (N3 > N1)){
            System.out.println("O maior numero entre todos é o número: " + N3);
        }    
        sc.close();
    }
}
