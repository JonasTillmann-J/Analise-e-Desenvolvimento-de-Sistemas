programa {
  funcao inicio() {
    inteiro Numero

    escreva("Digite um número inteiro: ")
    leia(Numero)

    se((Numero % 3 == 0) e (Numero % 5 == 0)){
      escreva("\nO número ", Numero, " é múltiplo de 3 e de 5.")
    }senao{
      escreva("\nO número ", Numero, " não é múltiplo de 3 e de 5.")
    }
  }
}
