programa {
  funcao inicio() {
    /*Area de variaveis globais*/
    inteiro Condicao = 0, Soma = 0, Usuario

    /*Trecho de Input do Usuario*/
    escreva("Informe até quanto deseja Contar: ")
    leia(Usuario)

    /*Trecho de soma dos algarismos*/
    enquanto(Condicao != Usuario){
      Condicao++
      Soma = Soma + Condicao
    }

  /*Trecho de output para o usuario*/
    escreva("Resultado: " + Soma)
  }
}
