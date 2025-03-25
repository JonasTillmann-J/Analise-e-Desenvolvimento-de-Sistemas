programa {
  funcao inicio() {
    inteiro Senha, Condicao
    escreva("Informe sua senha: ")
    leia(Senha)

    enquanto(Condicao != Senha){
      escreva("\nEscreva Sua Senha Novamente Para Verificação: ")
      leia(Condicao)
      
      se(Condicao != Senha){
        limpa()
        escreva("Senha Incorreta\n") 
      }senao{
        limpa()
        escreva("Senha Correta, Conta Validada\n")
      }

    }
  }
}
