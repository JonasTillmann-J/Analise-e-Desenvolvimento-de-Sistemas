
public class App {
    public static void main(String arg[]){
        int soma = 0;
        System.out.println("Contador de 50 Numeros inteiros:");
        for (int i = 0; i < 50; i++) {
            soma = soma + i;
            System.out.println("Soma dos " + (i+1) + " números inteiros: " + soma);
        }
    }
}
