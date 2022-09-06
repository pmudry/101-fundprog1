---
title: "Labo 1 -- First steps"
course: "101.1 Programmation impérative"
author: [Pierre-André Mudry]
date: "23.7.2022"
version: "0.7"

# LaTex specific
fontsize: 10pt
caption-justification: centering
---

# Objectifs et donnée du laboratoire

Les objectifs de ce laboratoire sont :

1. se familiariser avec les outils utilisés dans le cours _101.1 Programmation impérative_;
1. faire vos premiers pas en _Scala_ (si ce n'est pas déjà fait);

La durée de laboratoire est de **2 périodes**. Vous aurez l'occasion durant ce premier laboratoire de créer votre premier projet _Scala_ et de faire connaissance avec l'environnement de développement _IntelliJ_.

# Partie 1. Le site web du cours

Le site web du cours sert à assurer l'échange d'informations entre étudiant-e-s et professeur-e-s. Vous y trouverez des informations sur le cours, des anciens examens, les dernières nouvelles… Cette plate-forme est accessible tant à l'intérieur qu’à l'extérieur de la HES-SO Valais. Le site est disponible à l’adresse (https://inf1.begincoding.net)

## Tâche 1
Effectuez les tâches suivantes :

1.	Essayer de retrouver sur le site le cours du jour ainsi que ce laboratoire.
2.	Téléchargez les fichiers `RoomCalc.scala` et Input.java et retrouvez ces fichiers sur le disque.

# Partie 2. Environnement de développement

```scala
package labs.ideas

var length = 30
var symbol = "▒"

def progress(value: Int) = {
  require(value >= 1)

  for (i <- 1 to value) {
    print("[")
    print(symbol * i)
    print(" " * (length - i) + "]")
    Thread.sleep(200)
    print("\b" * (length + 2))
  }
}

@main
def main() = {
  progress(10)
}
``` 
