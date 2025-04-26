package Atividades24_e_25_04_2025;
import java.util.Scanner;
public class Atividades {
    public boolean Reset(Scanner sc){
        System.out.println("Deseja refazer a Atividade?: Y = sim | N = não");
        char userResponse = sc.next().charAt(0);
        if(userResponse == 'n' || userResponse == 'N'){
            return false;
        }else{
            return true;
        }
    }  
    public void Atvd1_25(Scanner sc){
        int soma = 0;
        double media = 0;
        System.out.println("Quantos Numeros irá Calcular?");
        int userData = sc.nextInt();
        System.out.println("Informe "+userData+" Números Inteiros");
        //inicialização do vetor
        int[] vetor = new int[userData];
        int[] vetorInverso = new int[userData];
        //Alocando os Números no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o "+(i+1)+"º Número");
            vetor[i] =  sc.nextInt();
            soma = soma + vetor[i];
        }
        System.out.println("-------------------------------\nNúmeros em ordem normal");
        for (int  l = 0; l < vetor.length; l++) {   
            System.out.println(vetor[l] + " ");
        }

        media = soma/userData;
        System.out.println("A soma dos seus números é: "+soma);
        System.out.println("A média dos seus números é: "+media);
        System.out.println("\nNúmeros em ordem contraria");

        for (int j = (vetor.length-1); j >= 0; j--) {
            System.out.println(vetor[j] + " ");
        }
        
    }
    public void Atvd5_24(Scanner sc){
        System.out.println("Informe quantos numeros vc irá verificar");
        int vetorLength = sc.nextInt();
        int contador = 0;
        int[] vetor = new int[vetorLength];
        int[] result = new int[vetorLength];
        
        for (int i = 0; i < vetorLength; i++) {
            System.out.println("Informe o "+(i+1)+"º número");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
        boolean repetido = false;

        for (int j = 0; j < contador; j++) {
            if (vetor[i] == result[j]) {
                repetido = true;
                break;
            }
        }
        // Se não for repetido, adiciona ao vetor 'unicos'
            if (!repetido) {
                result[contador] = vetor[i];
                contador++;
            }
        }
        //print dos valores do vetor no console.
        for (int k = 0; k < contador; k++) {
            System.out.println((k+1)+"º valor no vetor: "+result[k]);
        }
    }
}
