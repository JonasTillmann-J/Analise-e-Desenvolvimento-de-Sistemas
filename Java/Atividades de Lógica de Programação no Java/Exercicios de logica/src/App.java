import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número(0 encerra o codigo.)");
        int n1 = sc.nextInt();
        int menor = n1;
        if (n1 == 0) {
            System.out.println("Nenhum numero foi informado");
           
        }
        
        while (n1 != 0) {
            if(n1 < menor){
                menor = n1;
            }
            System.out.println("Informe seu numero novamente (0 ainda serve para sair do sistema.): ");
            n1 = sc.nextInt();
        }
        System.out.println(menor);
        sc.close();
    }
    
}
