package com.example.learntogether

// Imports nécessaires : chaque ligne "importe" une fonction ou une classe
// dont on a besoin pour construire l'interface avec Jetpack Compose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

// Point d'entrée de l'application : c'est la première classe exécutée au lancement
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Permet à l'app de s'afficher derrière la barre de statut (plein écran)

        // setContent définit le contenu de l'écran en utilisant Jetpack Compose
        setContent {
            // Applique le thème visuel de l'application (couleurs, typographie...)
            LearnTogetherTheme {
                // Scaffold fournit une structure d'écran standard Material Design
                // innerPadding correspond aux marges automatiques (ex : barre de statut)
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Affiche notre écran personnalisé, en lui passant le padding automatique
                    ComposeArticleScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Fonction Composable personnalisée qui affiche l'écran de l'article Compose
// @Composable indique que cette fonction fait partie de l'interface utilisateur
@Composable
fun ComposeArticleScreen(modifier: Modifier = Modifier) {
    // Column empile ses enfants (image, textes) les uns en dessous des autres, verticalement
    Column(
        modifier = modifier
    ) {
        // 1er élément : l'image d'illustration
        Image(
            painter = painterResource(R.drawable.bg_compose_background), // Charge l'image depuis res/drawable
            contentDescription = null,          // null car l'image est purement décorative (pas besoin d'accessibilité)
            contentScale = ContentScale.FillWidth, // L'image s'adapte pour remplir toute la largeur
            modifier = Modifier.fillMaxWidth()  // L'image occupe toute la largeur de l'écran
        )

        // 2e élément : le titre "Jetpack Compose tutorial"
        Text(
            text = stringResource(R.string.compose_title), // Récupère le texte depuis strings.xml
            fontSize = 24.sp,                                // Taille de police demandée par l'exercice
            modifier = Modifier.padding(16.dp)               // Marge de 16dp sur les 4 côtés
        )

        // 3e élément : le 1er paragraphe explicatif
        Text(
            text = stringResource(R.string.compose_paragraph1),
            textAlign = TextAlign.Justify,                    // Texte justifié (aligné des deux côtés)
            modifier = Modifier.padding(start = 16.dp, end = 16.dp) // Marge uniquement à gauche et à droite
        )

        // 4e élément : le 2e paragraphe explicatif
        Text(
            text = stringResource(R.string.compose_paragraph2),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)                // Marge sur les 4 côtés cette fois
        )
    }
}

// Aperçu (Preview) : permet de voir le résultat dans Android Studio
// sans avoir besoin de lancer l'application sur un téléphone émulateur
@Preview(showBackground = true)
@Composable
fun ComposeArticleScreenPreview() {
    LearnTogetherTheme {
        ComposeArticleScreen()
    }
}