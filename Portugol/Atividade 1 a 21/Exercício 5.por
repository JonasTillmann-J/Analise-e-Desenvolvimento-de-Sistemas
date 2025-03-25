programa {
  funcao inicio() {
    inteiro N1
    
    escreva("Informe um Numero para Verificar se é Positivo, Negativo ou Igual a Zero: ")
    leia(N1)

    se(N1 > 0){
      escreva("Seu Numero Informado: "+N1+" é Positivo")
    }senao se(N1 < 0){
      escreva("Seu Numero Informado: "+N1+" é Negativo")
    }senao{
      escreva("Seu Numero Informado: "+N1+" é o Zero")
    }
  }
}
