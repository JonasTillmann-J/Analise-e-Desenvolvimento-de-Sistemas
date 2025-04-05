programa {
  funcao inicio() {
    /*Escreva um programa que percorra os primeiros 100 números inteiros maiores do que
      zero e imprima no console o resultado da soma dos números pares e também dos
      números impares (separadamente).*/
    inteiro ContadorPar = 0, ContadorImpar = 0, I = 0, VezesRodadoPar = 0, VezesRodadoImpar = 0
    para(I; I <= 100; I++){
      se(I % 2 == 0){
        ContadorPar = ContadorPar + I
        VezesRodadoPar ++
      }senao{
        ContadorImpar += I
        VezesRodadoImpar ++
      }
    }
    escreva("A quantidade de numeros Pares de 1 a "+(I-1)+" é de: "+(VezesRodadoPar-1)+", e seus valores somados são: "+ContadorPar)
    escreva("\nA quantidade de numeros Imares de 1 a "+(I-1)+" é de: "+VezesRodadoImpar+", e seus valores somados são: "+ContadorImpar)
  }
}
