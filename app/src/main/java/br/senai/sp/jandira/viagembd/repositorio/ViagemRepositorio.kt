package br.senai.sp.jandira.viagembd.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.viagembd.R
import br.senai.sp.jandira.viagembd.model.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    @Composable
    fun ListarTodasAsViagens(): List <Viagem> {
        val Londres = Viagem(
            id = 1,
            destino = "Londres",
            descricao = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.londres)

            )

        val Italia = Viagem(
            id = 2,
            destino = "Florença",
            descricao = "Florence, capital of the Tuscany region of Italy, is home to many works of Renaissance art and architecture.",
            dataChegada = LocalDate.of(2020, 3, 7),
            dataPartida = LocalDate.of(2020, 3, 18),
            imagem = painterResource(id = R.drawable.florenca)

            )

        val Porto = Viagem(
            id = 3,
            destino = "Porto",
            descricao = "Porto is the second city in Portugal, the capital of the Oporto District, and one of the Iberian Peninsula's major urban areas.",
            dataChegada = LocalDate.of(2021, 7, 4),
            dataPartida = LocalDate.of(2021, 7, 12),

            )

        val Chile = Viagem(
            id = 4,
            destino = "Santiago",
            descricao = "Santiago, Chile's capital and largest city, sits in a valley surrounded by the snow-capped Andes and the Chilean mountain range.",
            dataChegada = LocalDate.of(2022, 5, 4),
            dataPartida = LocalDate.of(2022, 5, 12),
            imagem = painterResource(id = R.drawable.santiago)

            )

        val Alemanha = Viagem(
            id = 5,
            destino = "Berlin",
            descricao = "Berlin, the capital of Germany. Some reminders of the city's turbulent history in the 20th century are the Holocaust Memorial and the ruins of the Berlin Wall, full of graffiti.",
            dataChegada = LocalDate.of(2023, 10, 23),
            dataPartida = LocalDate.of(2023, 10, 29),

            )

        val Tailandia = Viagem(
            id = 6,
            destino = "Bangkok",
            descricao = "Bangkok, the capital of Thailand, is a large city known for its ornate shrines and lively city life.",
            dataChegada = LocalDate.of(2024, 4, 14),
            dataPartida = LocalDate.of(2024, 4, 19),

            )

        return listOf(Londres, Italia, Porto, Chile, Alemanha, Tailandia)
    }

}