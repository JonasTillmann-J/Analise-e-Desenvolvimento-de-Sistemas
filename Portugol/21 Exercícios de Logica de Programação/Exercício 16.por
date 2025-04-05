programa {
  inclua biblioteca Util
  funcao inicio() {
    inteiro I = 0, J = 0, Quant = 20
    real Vetor[Quant], NumeroInformado, Soma = 0

    para(I; I < Quant; I++){
    escreva("\nInforme o "+(I+1)+"° Número: ")
    leia(NumeroInformado)
    Vetor[I] = NumeroInformado
    escreva("Somando ...")
    Soma = Soma + Vetor[J]
    }
    escreva("\nMedia dos numeros informados: "+(Soma/Quant))
  }
}
