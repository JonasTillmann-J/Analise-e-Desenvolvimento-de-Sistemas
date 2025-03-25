programa {
  funcao inicio() {
    inteiro N1, N2
    real Soma, Subtracao, Multiplicacao, Divisao
        
    escreva("Digite o primeiro número inteiro: ")
    leia(N1)
        
    escreva("Digite o segundo número inteiro: ")
    leia(N2)

    Soma = N1 + N2
    Subtracao = N1 - N2  
    Multiplicacao = N1 * N2
    
    escreva("\nSoma: ", Soma)
    escreva("\nSubtração: ", Subtracao)
    escreva("\nMultiplicação: ", Multiplicacao)
    se (N2 != 0 e N1 != 0) {
      Divisao = N1 / N2
      escreva("\nDivisão: ", Divisao)
    }senao{
      escreva("\nNão é possível dividir por zero.")
    }
  }
}
