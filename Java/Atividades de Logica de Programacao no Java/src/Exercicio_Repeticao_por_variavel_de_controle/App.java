package Exercicio_Repeticao_por_variavel_de_controle;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            int cout = 0, contador = 0;

            System.out.println("Informe quantos numero deseja contar: ");
            int vzs = sc.nextInt();

            for (int i=0; i<= vzs;i++){
                if(contador == 0){
                    System.out.println("Informe os numeros inteiros que deseja calcular");
                    contador++;
                }else{
                    System.out.println("Informe os numeros inteiros que deseja calcular");
                    cout = sc.nextInt();
                    cout = cout + cout;
                }
            }
            System.out.println("Seus numeros somados resultam em: "+ cout);
        sc.close();
    }
}
