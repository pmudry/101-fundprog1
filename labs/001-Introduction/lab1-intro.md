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

<style>
r { color: Red }
y { color: Yellow }
</style>

# Objectifs et donnée du laboratoire

Les objectifs de ce laboratoire sont :

1. se familiariser avec les outils utilisés dans le cours _101.1 Programmation impérative_;
1. faire vos premiers pas en _Scala_ (si ce n'est pas déjà fait);

La durée de laboratoire est de **2 périodes**. Vous aurez l'occasion durant ce premier laboratoire de créer votre premier projet _Scala_ et de faire connaissance avec l'environnement de développement _IntelliJ_.

# Partie 1. Le site web du cours

Le site web du cours sert à assurer l'échange d'informations entre étudiant-e-s et professeur-e-s. Vous y trouverez des informations sur le cours, des anciens examens, les dernières nouvelles… Cette plate-forme est accessible tant à l'intérieur qu’à l'extérieur de la HES-SO Valais. Le site est disponible à l’adresse (https://inf1.begincoding.net)

# Installation des outils

<y> Je sais pas vraiment s'il faut installer les outils command line ou pas... J'hésite franchement.</y>

<y>
1. GraalVM install depuis IntelliJ semble possible
--1. Explication dans intellij
```
cs java-home --jvm graalvm-java17  
cs java --jvm graalvm-java17 --setup
```
</y>

1. Allez sur la page (https://docs.scala-lang.org/getting-started/index.html)
1. Télécharger l'installateur `Scala` pour votre système d'exploitation. Cet installateur de commande s'appelle `Coursier` et c'est lui qui va gérer l'installation des outils pour pouvoir faire du `Scala`. 
1. Lancez une ligne de commande (TODO expliquer)
1. Dans la ligne de commande, tapez exactement la ligne suivante :

```
cs java --jvm 17
```

Cela va télécharger la machine virtuelle Java qui sert à exécuter les programmes écrits non seulement en Java (qui est un langage de programmation assez célèbre) mais également les programmes écrits en `Scala`, `Clojure`, `Kotlin`, `Groovy`, ... 

1. Vous devriez maintenant pouvoir commencer à faire du Scala. Pour vérifier que tout fonctionne correctement, tapez `scala` dans la ligne de commande. Vous devriez voir la chose suivante : 

```
Welcome to Scala 3.2.0 (11.0.15, Java OpenJDK 64-Bit Server VM).
Type in expressions for evaluation. Or try :help.

scala>
```

> L'outil `Coursier` est un programme mais qui n'a pas d'interface utilisateur. Vous allez en rencontrer beaucoup dans vos études et dans votre vie de programmeur·euse ! En réalité, la majorité des programmes sont comme cela, sans information visible.


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
