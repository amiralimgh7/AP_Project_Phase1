# Card Duel — Advanced Programming Project

A Java console card game with player accounts, deck management, a card shop, and duel logic. The implementation separates controllers, models, and console views.

## Stack

Java 11, Maven, Gson, Jackson, and JUnit 4.

## Getting started

1. Open `pom.xml` as a Maven project in a Java IDE.
2. Select a JDK compatible with the Java 11 source level.
3. Run the `Main` class with the repository root as the working directory.

The working directory matters: the application reads `Monster.csv`, `SpellTrap.csv`, and the JSON persistence files from the repository root.

To compile and run the existing tests with Maven:

```sh
mvn compile
mvn test
```

## Project layout

| Path | Purpose |
| --- | --- |
| `src/main/java/controller/` | Accounts, decks, shop, duels, and card effects |
| `src/main/java/model/` | Players, cards, decks, and game state |
| `src/main/java/view/` | Console input and output |
| `src/test/java/` | Existing controller, model, and view tests |
| `Monster.csv`, `SpellTrap.csv` | Card definitions |
| `json*.txt` | Application persistence files |

This repository represents phase 1 of the Advanced Programming project.
