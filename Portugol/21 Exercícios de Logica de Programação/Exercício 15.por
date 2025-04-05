programa {
  funcao inicio() {
    inteiro N1, I, Contador = 0
    
    escreva("Informe um Número Inteiro para Verificar se é primo ou não: ")
    leia(N1)

    para(I = 0; I <= 100; I++){
      se(N1 % I == 0){
        Contador = Contador + 1
      }
    }
    se(Contador == 2){
      escreva("Primo")
      escreva("\n"+Contador)
    }senao{
      escreva("Não Primo")
      escreva("\n"+Contador)
    }
  }
}
