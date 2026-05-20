[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/716M3ZCB)
# Devoir 11 : Propriétaires, enclos et animaux de rente
## Objectifs :
- Entraînement à la lecture et à la retranscription en Java d'informations fournies textuellement.
- Entraînement à de l'algorithmique simple (révision module 319).
- Révision de l'ensemble des concepts vus en classe.
- **Bonne préparation à la E1 à venir**.

## Durée :
Vous devriez être en mesure de réaliser l'ensemble des fonctionnalités décrites ci-dessous en **1h à 1h30** maximum.

## Mission :
- Retranscrivez avec précision les explications ci-dessous dans votre projet Java afin d'obtenir une application fonctionnelle.
- Veillez à respecter les enseignements reçus à l'EMF (classes dans les bons packages, ordre des choses dans vos classes, choix des noms, ...).

## Contexte général :
Plusieurs propriétaires d'animaux de rente (bovins, caprins, porcins, volailles, équins, ...) se mettent ensemble et se cotisent afin que vous réalisiez un petit programme simple pour répartir leurs animaux dans des enclos, en tenant compte de quelques règles simples.

## Indications fournies :
Un propriétaire aura un nom et un prénom. Ces informations devront pouvoir être demandées ultérieurement mais plus jamais modifiées. L'affichage éventuel d'un propriétaire produira un résultat ressemblant à ceci : `"Paul Duchampsec"`.

Un animal aura un propriétaire, un type ("Cheval", "Porc", ...), un numéro unique (17, 324, ...) et si oui ou non il s'agit d'un herbivore (car herbivores et non-herbivores ne peuvent pas être mélangés dans le même enclos). Ces informations devront pouvoir être demandées ultérieurement mais jamais modifiées sauf pour le propriétaire qui peut changer (par ex. vente de l'animal à un autre propriétaire). L'affichage d'un animal devra produire un résultat ressemblant à ceci : `"N°0031-Cheval-Propriété de Paul Duchampsec"`.

Un enclos permet d'accueillir un certain nombre d'animaux. Il y a des grands enclos et des plus petits. La taille de chaque enclos sera définie lors de sa création. On doit pouvoir demander à un enclos s'il lui reste encore de la place, combien d'animaux il contient, combien d'animaux on pourrait encore y placer. On doit également pouvoir y placer un animal. Sans pour autant pouvoir spécifier lequel en particulier on souhaite retirer, on devra également pouvoir retirer un animal de cet enclos qui sera pris dans le cheptel actuel (au hasard si vous le souhaitez, vous êtes libres de faire comme vous voulez). Pour terminer, on doit pouvoir lui demander s'il contient au moins un herbivore.

A vôté de votre main(), faites une méthode de génération d'animaux qui recevra un propriétaire et qui produira aléatoirement un nouvel animal de l'un de ces types choisi au hasard ("Cheval", "Vache", "Chèvre", "Poule", "Chien", "Porc"). Seuls les 3 premiers sont des herbivores. Pour faire simple, faites en sorte que cette méthode utilise un compteur général, à chaque fois incrémenté, pour le numéro unique de l'animal afin de ne jamais réutiliser le même.

Dans votre main(), créez un tableau avec 8 enclos, chacun avec de la place pour 8 animaux.

Dans un autre tableau, créez les 4 propriétaires suivants : "Mario Duprévert", "Paul Duchampsec", "Fred Dupaturage" et "Tom Delaprairie".

Pour chaque propriétaire de votre tableau, créez aléatoirement 10 animaux à l'aide de votre méthode de génération et tentez de placer ces animaux dans l'un ou l'autre des enclos disponibles. Si à un moment donné le placement d'un animal devait échouer, indiquez-le sur la console et faites que votre programme s'arrête.

Une fois que tous les animaux auront trouvé leur place, enclos par enclos, affichez leur contenu.

Vous devriez obtenir une sortie console ressemblant à ceci :
````
Contenu de l'enclos N°1
   N°0001-Vache-Propriété de Mario Duprévert
   N°0002-Chèvre-Propriété de Mario Duprévert
   N°0004-Vache-Propriété de Mario Duprévert
   N°0008-Chèvre-Propriété de Mario Duprévert
   N°0009-Cheval-Propriété de Mario Duprévert
   N°0010-Chèvre-Propriété de Mario Duprévert
   N°0011-Vache-Propriété de Paul Duchampsec
   N°0013-Vache-Propriété de Paul Duchampsec
Contenu de l'enclos N°2
   N°0003-Porc-Propriété de Mario Duprévert
   N°0005-Poule-Propriété de Mario Duprévert
   N°0006-Porc-Propriété de Mario Duprévert
   N°0007-Poule-Propriété de Mario Duprévert
   N°0012-Chien-Propriété de Paul Duchampsec
   N°0014-Poule-Propriété de Paul Duchampsec
   N°0015-Poule-Propriété de Paul Duchampsec
   N°0018-Porc-Propriété de Paul Duchampsec
Contenu de l'enclos N°3
   N°0016-Cheval-Propriété de Paul Duchampsec
   N°0017-Vache-Propriété de Paul Duchampsec
   N°0019-Chèvre-Propriété de Paul Duchampsec
   N°0026-Chèvre-Propriété de Fred Dupaturage
   N°0027-Chèvre-Propriété de Fred Dupaturage
   N°0029-Vache-Propriété de Fred Dupaturage
   N°0031-Cheval-Propriété de Tom Delaprairie
   N°0035-Cheval-Propriété de Tom Delaprairie
Contenu de l'enclos N°4
   N°0020-Porc-Propriété de Paul Duchampsec
   N°0021-Chien-Propriété de Fred Dupaturage
   N°0022-Chien-Propriété de Fred Dupaturage
   N°0023-Poule-Propriété de Fred Dupaturage
   N°0024-Chien-Propriété de Fred Dupaturage
   N°0025-Porc-Propriété de Fred Dupaturage
   N°0028-Chien-Propriété de Fred Dupaturage
   N°0030-Chien-Propriété de Fred Dupaturage
Contenu de l'enclos N°5
   N°0032-Porc-Propriété de Tom Delaprairie
   N°0033-Porc-Propriété de Tom Delaprairie
   N°0034-Porc-Propriété de Tom Delaprairie
   N°0037-Porc-Propriété de Tom Delaprairie
   N°0038-Chien-Propriété de Tom Delaprairie
   N°0039-Porc-Propriété de Tom Delaprairie
   N°0040-Poule-Propriété de Tom Delaprairie
Contenu de l'enclos N°6
   N°0036-Vache-Propriété de Tom Delaprairie
Contenu de l'enclos N°7
Contenu de l'enclos N°8
````

## RESTITUTION :
1. Rendre ce devoir normalement par `push` GitHub
