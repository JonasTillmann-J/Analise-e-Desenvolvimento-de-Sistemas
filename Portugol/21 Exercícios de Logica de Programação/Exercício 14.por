programa {
  funcao inicio() {
    /*Escreva um programa que solicite um número inteiro maior ou igual a 2 e menor ou
      igual a 10, valide o número informado e em seguida calcule e apresente no console o
      fatorial do número informado.
    */
    inteiro N1, N2, I, Resultado = 0, Valoranterior
    logico Condicao1 = verdadeiro
    escreva("Informe o Primeiro Numero: ")
    leia(N1)
    faca{
      se(N1 < 2){
        escreva("Informe um numero maior ou igual a 2: ")
        leia(N1)
        Condicao1 = verdadeiro
      }senao se(N1 > 10){
        escreva("Informe um numero menor ou igual a 10: ")
        leia(N1)
        Condicao1 = verdadeiro
      }senao{
        Condicao1=falso
      }
    }enquanto(Condicao1)
    Valoranterior = N1*(N1-1)
    N2=N1
    N1 = N1 - 2
    para(I=N1; I != 0; I--){
      Valoranterior =+ Valoranterior*I
      Resultado = Valoranterior 
    }
    escreva(""+N2+" Fatorado é Igual a: "+Resultado)
  }
}
