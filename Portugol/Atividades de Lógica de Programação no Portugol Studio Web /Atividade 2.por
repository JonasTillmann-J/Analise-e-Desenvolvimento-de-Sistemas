programa {
   inclua biblioteca Util
   inteiro Num
  funcao inicio() {

    inteiro minimo = 1, maximo = 100, User
    Num = Util.sorteia(minimo, maximo)
    escreva(Num)

    enquanto(User != Num){
      
      escreva("Digite um numero e teste sua sorte: ")
      leia(User)
      se(User > Num){
        limpa()
        escreva("Esta muito alto, tente novamente: \n\n")
        
      }senao se(User < Num){
        limpa()
        escreva("Esta muito baixo, tente novamente: \n\n")
        
      }senao{
        limpa()
        escreva("\nvocê acertou Parabens, o numero era: "+Num+"\n\n")
      }
      
    }
      
  }
}
