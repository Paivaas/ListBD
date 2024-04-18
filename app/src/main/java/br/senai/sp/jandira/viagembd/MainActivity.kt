     package br.senai.sp.jandira.viagembd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.viagembd.repositorio.ViagemRepositorio
import br.senai.sp.jandira.viagembd.ui.theme.ViagembdTheme
import br.senai.sp.jandira.viagembd.utilitarios.encurtadorDeDatas
import java.util.Date

     class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViagembdTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    //var utilitarios =
    val viagens = ViagemRepositorio().ListarTodasAsViagens()


   LazyColumn{
       items(viagens){
           Card(modifier = Modifier
               .padding(horizontal = 16.dp)
               .fillMaxWidth()) {
               Column (modifier = Modifier.padding(12.dp)) {

                   Surface (modifier = Modifier.height(200.dp), shape =  RoundedCornerShape(10.dp)){
                       Image(painter = if (it.imagem == null) painterResource(id = R.drawable.noimage)else it.imagem!!, contentDescription = "", contentScale = ContentScale.Crop)
                   }
                   Spacer(modifier = Modifier.height(12.dp))
                   Text(text = "${it.destino}  ${it.dataChegada.year}",
                       fontWeight = FontWeight.Bold,
                       fontSize = 28.sp,)
                   Text(text = it.descricao)

                   Row (horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()){

                       Text(text = encurtadorDeDatas(it.dataChegada, it.dataPartida))
                   }

               } //juju
           }
           Spacer(modifier = Modifier.height(12.dp))
       }
   }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ViagembdTheme {
        Greeting("Android")
    }
}