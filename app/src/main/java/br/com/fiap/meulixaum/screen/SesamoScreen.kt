package br.com.fiap.meulixaum.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.meulixaum.R


@Composable
fun SesamoScreen() {
    Surface(color = Color.White) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Informações",
                fontSize = 30.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 12.dp, bottom = 4.dp)
            )
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                color = Color(0xFFD4E9D6),
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(width = 4.dp, color = Color.Black)
            ) {
                Card(
                    colors = CardDefaults.cardColors(Color(0xFFD4E9D6)),

                    ) {

                    Text(
                        text = "ECOPONTO - VILA Sesamo",
                        fontSize = 24.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 8.dp, bottom = 4.dp)
                            .align(Alignment.CenterHorizontally),
                    )

                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Materiais recebidos:",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 16.dp, 4.dp)
                    )
                    Text(
                        text = "- Resíduos da Construção Civil (até 1 m³/dia)\n " +
                                "- Eletroeletrônicos, Recicláveis, Óleo de cozinha, Pilhas e Baterias\n" +
                                "- Resíduos de Poda e Jardinagem e Pneus",
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 16.dp, top = 8.dp, 4.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(modifier = Modifier.align(Alignment.CenterHorizontally))
                    {
                        Image(
                            painter = painterResource(id = R.drawable.vilasesamo),
                            contentDescription = "Imagem de uma moça.",
                            modifier = Modifier
                                .size(300.dp)
                                .clip(shape = RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop,
                            alignment = Alignment.Center
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            text = "Rua do Passáro Amarelo Gigante, 356 - São Paulo - SP",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        val uriHandler = LocalUriHandler.current
                        Button(
                            onClick = {
                                val url = "https://www.google.com/maps"
                                uriHandler.openUri(url)
                            },
                            colors = ButtonDefaults.buttonColors(Color.White),
                            modifier = Modifier
                                .padding(8.dp),
                            border = BorderStroke(
                                1.dp,
                                color = Color.Gray
                            )
                        ) {
                            Text(
                                text = "Como chegar",
                                fontSize = 20.sp,
                                color = Color.Black
                            )
                        }
                        Text(
                            text = "*Resíduos da construção civil: tábuas, tijolos, telhas, tubulações, piso, lata de tinta vazia\n" +
                                    "**Poda e jardinagem: folhas e galhos\n" +
                                    "***Recicláveis: papel, plástico, vidro, metal e isopor",
                            fontSize = 14.sp,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 16.dp, top = 8.dp, 4.dp)
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SesamoScreenPreview() {
    SesamoScreen()
}
