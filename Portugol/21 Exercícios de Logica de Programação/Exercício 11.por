programa {
  funcao inicio() {
    cadeia Nome
    real Altura, Peso, Imc
        
    escreva("Digite seu nome: ")
    leia(Nome)
    escreva("Digite sua altura (em metros, use ponto para decimal): ")
    leia(Altura)
    escreva("Digite seu peso (em kg, use ponto para decimal): ")
    leia(Peso)
    
    Imc = Peso / (Altura * Altura)

    escreva("\n", Nome, ", seu IMC é: ", Imc)
  }
}
