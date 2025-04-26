package Atividades_25_04_2025;

import java.util.Scanner;

public class Main {
    public static void main(String Args[]){

        Scanner sc = new Scanner(System.in);
        Atividades Atvd = new Atividades();

        System.out.println("Olá seja bem vindo");
        System.out.println("Deseja Iniciar o Sistema?: Y = sim | N = não");
        char initResponse = sc.next().charAt(0);
        if(initResponse == 'Y' || initResponse == 'y'){
            System.out.println("Programa Iniciado...");
            System.out.println("Central de Atividades: ");
            System.out.println("DR:25-04-2025");
            
            boolean condition = false;
            do {
                System.out.println("Informe que atividade deseja visualizar\n1: verificadora de numero repetidos\n2:");
                int userChoice = sc.nextInt();
                switch (userChoice) {
                    case 1:
                        Atvd.Atividade5(); 
                        break;
                    default:
                        System.out.println("Valor invalido tente de novo");
                        condition = true;
                        break;
                }
            } while (condition);
        }

        System.out.println("Essa é uma verificadora de numero repetidos, informe os números\ne o sistema ira verificar se são iguais");
        System.out.println("Primeiro Informe quantos numeros irá verificar: "); 
        
        sc.close();
    }
}