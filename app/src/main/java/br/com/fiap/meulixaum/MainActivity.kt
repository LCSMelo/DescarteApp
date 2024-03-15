package br.com.fiap.meulixaum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import br.com.fiap.meulixaum.screen.DescricaoItem
//import br.com.fiap.meulixaum.screen.DescricaoItem
import br.com.fiap.meulixaum.screen.ListaScreen
import br.com.fiap.meulixaum.ui.theme.MeuLixaumTheme
import br.com.fiap.meulixaum.screen.LoginScreen
import br.com.fiap.meulixaum.screen.MapScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//            val navController = rememberNavController()
//            NavHost(navController = navController, startDestination = "listaScreen") {
//                composable("listaScreen") { ListaScreen() }
//                composable("mapScreen") { MapScreen(navController, nome!!, idade!!) }
//            }
            MeuLixaumTheme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login",
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.End,
                                animationSpec = tween(1000)
                            )
                        },
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Start,
                                animationSpec = tween(3000)
                            )
                        }
                    ) {
                        composable(route = "login") {
                            LoginScreen(navController)
                        }
                        composable(route = "lista") {
                            ListaScreen(navController)
//                            DescricaoItem(navController)
                        }
                        composable(route = "mapscreen") {
                            MapScreen()
                        }
//                        composable(
//                            route = "perfil/{nome}/{idade}",
//                            arguments = listOf(
//                                navArgument(name = "nome") {
//                                    type = NavType.StringType
//                                },
//                                navArgument(name = "idade") {
//                                    type = NavType.IntType
//                                }
//                            )
//                        ) {
////                            val nome = it.arguments?.getString("nome")
////                            PerfilScreen(navController, nome!!) // chama-se doublebang
//                            val nome = it.arguments?.getString("nome")
//                            val idade = it.arguments?.getInt("idade")
//                            MapScreen() // chama-se doublebang
//                        }
//                        composable(
//                            route = "pedidos?numero={numero}",
//                            arguments = listOf(navArgument(name = "numero") {
//                                defaultValue = "sem valor"
//                            })
//                        ) {
////                            PedidosScreen(navController, it.arguments?.getString("numero")!!)
//                        }
                    }

                }
            }
        }
    }
}

