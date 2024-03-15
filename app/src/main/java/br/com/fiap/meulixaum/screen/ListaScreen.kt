package br.com.fiap.meulixaum.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ListaScreen(navController: NavController) {

    Surface(color = Color.White) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .fillMaxHeight()
        ) {
            Text(
                text = "Locais para Descarte de Recicláveis",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))

            Column {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    color = Color(0xFFD4E9D6),
                    shape = RoundedCornerShape(8.dp),
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Text(
                            text = "Ecoponto - Vila Maria",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Rua Jesus Nazareno, 1933",
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Horário de Funcionamento: 10:00 - 14:00",
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                        Button(
                            onClick = {
                                navController.navigate("mapscreen")
                            },
                            colors = ButtonDefaults.buttonColors(Color.White)
                        ) {
                            Text(
                                text = "Mais informações",
                                fontSize = 15.sp,
                                color = Color(0xFF248600)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Surface(color = Color.White) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        color = Color(0xFFD4E9D6),
                        shape = RoundedCornerShape(8.dp),
                    ) {
                        Column(
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text(
                                text = "Ecoponto - Vila Sésamo",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "Rua do Passáro Amarelo Gigante, 356",
                                fontSize = 14.sp,
                                color = Color.Gray
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "Horário de Funcionamento: 09:00 - 15:00",
                                fontSize = 14.sp,
                                color = Color.Gray
                            )
                            Button(
                                onClick = {
                                    navController.navigate("mapscreen")
                                },
                                colors = ButtonDefaults.buttonColors(Color.White)
                            ) {
                                Text(
                                    text = "Mais informações",
                                    fontSize = 15.sp,
                                    color = Color(0xFF248600)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ListaScreenPreview() {
    ListaScreen(navController = rememberNavController())
}
