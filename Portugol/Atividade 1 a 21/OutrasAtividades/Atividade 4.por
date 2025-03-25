programa {
  funcao inicio() {
  inteiro User, I, Contador = 0

  escreva("Informe o numero que queira verificar: ")
  leia(User)

  para (I = 1; I <= 100; I++){ 
    se((User % I) == 0){
      Contador = Contador + 1
    }
  }
  se(Contador == 2){
     escreva("Esse numero é seu Primo d:0\n")
     escreva("Valor contador: "+Contador)
  }senao{
    escreva("Esse numero não é um numero Primo\n")
    escreva("Valor contador"+Contador)
  }
  }
}
