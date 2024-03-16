package br.com.fiap.meulixaum.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.meulixaum.R

@Composable
fun EcycleScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .background(colorResource(id = R.color.primary))
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Column(modifier = Modifier.background(colorResource(id = R.color.primary))) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.padding(bottom = 20.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(520.dp),

                    colors = CardDefaults.cardColors(Color.White),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                )
                {
                    Column(
                        modifier = Modifier.padding(
                            vertical = 16.dp,
                            horizontal = 16.dp
                        )
//                                .background(color = Color.White),
                    ) {
                        Text(
                            text = "Seus dados",
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.primary),
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "O RecycleFinder é um aplicativo que simplifica a reciclagem," +
                                    "ajudando os cidadãos a localizar pontos de coleta de lixo reciclável em suas cidades." +
                                    " Com informações sobre locais e materiais aceitos," +
                                    " promove a conscientização ambiental e reduz a poluição, " +
                                    "contribuindo para um futuro mais sustentável. Baixe agora e faça a diferença!",

                            fontSize = 25.sp,
                            color = colorResource(id = R.color.primary),
                            textAlign = TextAlign.Start,

                            )

                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    navController.navigate("lista")
                },
                shape = RoundedCornerShape(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),

                ) {
                Text(
                    text = "Buscar",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold, fontSize = 20.sp,
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 5.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EcycleScreenPreview() {
    EcycleScreen(navController = rememberNavController())
}