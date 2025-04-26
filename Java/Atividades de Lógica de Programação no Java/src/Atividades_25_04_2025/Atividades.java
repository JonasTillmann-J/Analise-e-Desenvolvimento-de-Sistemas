package Atividades_25_04_2025;

import java.util.Scanner;

public class Atividades {
    

    public void Atividade5(){
        Scanner sc = new Scanner(System.in);
        
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
        sc.close();
    }
}
