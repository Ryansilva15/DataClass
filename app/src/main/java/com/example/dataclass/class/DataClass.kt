package com.example.dataclass.class

import com.example.dataclass.Perguta


data class Pergunta(val pergunta: String, val respostaCerta: Int)

fun main() {
    val pergunta1 = Pergunta("Qual a pergunta?",1)
    val pergunta2 = Pergunta("Qual a pergunta?",1)

    println(pergunta1 == pergunta2)
}