programa {
  funcao inicio() {
    inteiro N1, N2, N3, Resultado

    escreva("Informe o Primeiro Numero: ")
    leia(N1)
    escreva("Informe o Segundo Numero: ")
    leia(N2)
    escreva("Informe o Terceiro Numero: ")
    leia(N3)

    se((N1>N2)e(N1>N3)){
      Resultado = N1
    }senao se((N2>N1)e(N2>N3)){
      Resultado = N2
    }senao{
      Resultado = N3
    }

    escreva("O maior Numero Desse Conjunto é: "+Resultado)
  }
}
