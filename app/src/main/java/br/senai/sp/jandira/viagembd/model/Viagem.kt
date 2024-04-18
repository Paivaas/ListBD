package br.senai.sp.jandira.viagembd.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

data class Viagem(
    var id: Int = 0,
    var destino: String = "",
    var dataChegada: LocalDate = LocalDate.now(),
    var dataPartida: LocalDate = LocalDate.now(),
    var imagem: Painter? = null
)

