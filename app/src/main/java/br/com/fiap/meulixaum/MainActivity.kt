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
import br.com.fiap.meulixaum.screen.ListaScreen
import br.com.fiap.meulixaum.screen.LoginScreen
import br.com.fiap.meulixaum.screen.MariaScreen
import br.com.fiap.meulixaum.screen.SesamoScreen
import br.com.fiap.meulixaum.ui.theme.MeuLixaumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MeuLixaumTheme {
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
                        }
                        composable(route = "mariascreen") {
                            MariaScreen()
                        }
                        composable(route = "sesamoscreen") {
                            SesamoScreen()
                        }

                    }
                }
            }
        }
    }
}

