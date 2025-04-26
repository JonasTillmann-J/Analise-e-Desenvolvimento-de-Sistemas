package Atividades24_e_25_04_2025;

import java.util.Scanner;

public class Main {
    public static void main(String Args[]){

        Scanner sc = new Scanner(System.in);
        Atividades Atvd = new Atividades();
        boolean condition = true;

        System.out.println("Olá seja bem vindo");
        System.out.println("Deseja Iniciar o Sistema?: Y = sim | N = não");
        char initResponse = sc.next().charAt(0);

        if(initResponse == 'Y' || initResponse == 'y'){
            System.out.println("Programa Iniciado...");
            System.out.println("Central de Atividades: ");
            System.out.println("DR:25-04-2025");
            
            do {
                System.out.println("Informe que atividade deseja visualizar\n1: Verificador de número repetidos\n2: Somador e criador da média N Números inteiros");
                int userChoice = sc.nextInt();
                switch (userChoice) {
                    case 1:
                        System.out.println("verificador de número repetidos iniciado...");
                        boolean conditionAtvd5_24 = true;
                        while (conditionAtvd5_24) {
                            Atvd.Atvd5_24(sc);
                            conditionAtvd5_24 = Atvd.Reset(sc);
                        }
                        break;
                    case 2:
                        System.out.println("Somador de craidor da média de 10 Números inteiros");
                        boolean conditionAtvd1_25 = true;
                        while (conditionAtvd1_25) {
                            Atvd.Atvd1_25(sc);
                            conditionAtvd1_25 = Atvd.Reset(sc);
                        }
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