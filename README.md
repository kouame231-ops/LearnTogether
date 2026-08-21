# Learn Together – Article sur Compose

## Description

Application Android développée avec **Jetpack Compose** et **Kotlin**, réalisée dans le cadre du cours *"Créer une mise en page"* (Chapitre 3, exercice *"S'entraîner : Principes de base de Compose"*).

L'application affiche un écran de tutoriel présentant Jetpack Compose : une image d'illustration, un titre, et deux paragraphes explicatifs.

## Aperçu

L'écran comprend :
- Une image occupant toute la largeur de l'écran
- Un titre ("Jetpack Compose tutorial") avec une taille de police de 24sp
- Deux paragraphes de texte justifié (`TextAlign.Justify`)

## Caractéristiques techniques respectées

| # | Élément | Caractéristique |
|---|---------|------------------|
| 1 | Image | Occupe toute la largeur de l'écran (`fillMaxWidth`) |
| 2 | 1er `Text` (titre) | Taille de police 24sp, padding 16dp (haut, bas, début, fin) |
| 3 | 2e `Text` (paragraphe 1) | Taille par défaut, padding 16dp (début, fin), alignement `Justify` |
| 4 | 3e `Text` (paragraphe 2) | Taille par défaut, padding 16dp (4 côtés), alignement `Justify` |

## Technologies utilisées

- **Langage** : Kotlin
- **Toolkit UI** : Jetpack Compose
- **IDE** : Android Studio
- **Composants Compose** : `Column`, `Image`, `Text`, `Scaffold`

## Structure du projet

```
app/src/main/java/com/example/learntogether/
 └── MainActivity.kt        # Point d'entrée + écran ComposeArticleScreen

app/src/main/res/
 ├── drawable/
 │    └── bg_compose_background.png
 └── values/
      └── strings.xml        # Chaînes de texte (titre, paragraphes)
```

## Concepts Compose mis en pratique

- Fonctions `@Composable`
- Mise en page verticale avec `Column`
- Modificateurs (`Modifier`) : `padding`, `fillMaxWidth`
- Chargement de ressources : `painterResource`, `stringResource`
- Alignement de texte : `TextAlign.Justify`

## Auteur

Kouame Yao Eric

## Cours

Support de cours Android – Chapitre 3 : *Créer une mise en page*
