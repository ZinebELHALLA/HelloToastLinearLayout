
# HelloToastConstraintLayout



## Table des matières

- [Description](#Description)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Démonstration](#Démonstration)

## Description

**HelloToastConstraintLayout** est une application Android simple qui démontre l'utilisation de `ConstraintLayout` pour concevoir une interface utilisateur. L'application comprend un compteur qui s'incrémente à chaque clic sur un bouton et affiche un message toast à l'aide d'un autre button. Cette application aide à comprendre les concepts de base du développement Android, les dispositions de l'interface et la gestion des événements.

## Installation

Pour exécuter ce projet localement, suivez ces étapes :

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/ZinebELHALLA/HelloToastConstraintLayout.git
   ```
2. Ouvrez le projet dans **Android Studio**.
3. Laissez Android Studio configurer le projet et télécharger les dépendances nécessaires.
4. Connectez un appareil Android ou configurez un émulateur Android.
5. Cliquez sur le bouton **Run** dans Android Studio ou utilisez `Shift + F10` pour compiler et exécuter l'application.

## Utilisation

1. Ouvrez l'application sur votre appareil Android ou émulateur.
2. Vous verrez deux boutons : **TOAST** et **COUNT**, ainsi qu'un compteur affiché au centre de l'écran.
3. En cliquant sur le bouton **TOAST**, un message toast indiquant "Hello, this is a Toast!" apparaîtra.
4. En cliquant sur le bouton **COUNT**, le nombre affiché au centre de l'écran s'incrémentera.

### Structure du projet :

- **app/java/com.example.hellotoast/MainActivity.java** : Contient la logique pour les événements de clic sur les boutons et la gestion du compteur.
- **app/res/values/colors.xml** : Contient les définitions de couleurs personnalisées.
- **app/res/layout/activity_main.xml** : Définit la mise en page à l'aide de `ConstraintLayout`.

## Démonstration

| Appui sur le bouton Toast | Appui sur le bouton Compter | 
|--------------------------|----------------------------|
| ![Toast Button](images/toast.png) | ![Count Button](images/count.png) |

,
