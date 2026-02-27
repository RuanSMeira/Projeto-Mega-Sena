# 🎲 Mega-Sena App - Desenvolvido por Ruan Silva Meira

Simulador da Mega-Sena desenvolvido em **Java para Android**, que realiza o sorteio de seis números aleatórios não repetidos entre 1 e 60.

---

## 📌 Sobre o Projeto

Este aplicativo foi desenvolvido com o objetivo de praticar:

- Manipulação de `TextView`
- Estruturas de repetição (`for`)
- Geração de números aleatórios
- Lógica para evitar números duplicados
- Organização de código em Java para Android

O app simula um sorteio semelhante ao da Mega-Sena, garantindo que nenhum número seja repetido.

---

## 🚀 Funcionalidades

- 🎲 Geração automática de números aleatórios
- 🔁 Validação para impedir números repetidos
- 📱 Interface simples e funcional
- ⚡ Atualização dinâmica ao clicar no botão de sorteio

---

## 🛠 Tecnologias Utilizadas

- Java  
- Android SDK  
- XML (Layouts)  
- Android Studio  

---

## 🧠 Lógica do Sorteio

A aplicação gera números aleatórios e verifica se já foram utilizados antes de adicioná-los à lista exibida na tela.

```java
for (int i = 1; i < textViews.length; i++) {

    int numeroSorteado = (int) (Math.random() * 60) + 1;
    boolean repetido = false;

    for (int j = 0; j < i; j++) {

        int numeroAnterior = Integer.parseInt(textViews[j].getText().toString());

        if (numeroSorteado == numeroAnterior) {
            repetido = true;
            break;
        }
    }

    if (!repetido) {
        textViews[i].setText(String.valueOf(numeroSorteado));
    } else {
        i--;
    }
}
