# MotorRace

## Beschreibung
Scroll down to see the English version 

**MotorRace** ist ein einfaches Java-Projekt, das eine Simulation eines Autorennens modelliert. Ziel ist es, die Grundlagen der objektorientierten Programmierung (OOP) in Java zu demonstrieren – insbesondere die Modellierung von Objekten wie Motor, Tank und Rennauto sowie deren Zusammenwirken in einer realitätsnahen Umgebung.

### Hauptmerkmale

- **Klassenstruktur**: Enthält die Klassen `Engine`, `Tank`, `RaceCar` und einen Testlauf in `RaceTest`.
- **Simulation**: Zwei Fahrzeuge verschiedener Teams ("Ferrari" und "Red Bull") treten in einem Rennen gegeneinander an.
- **Attribute und Methoden**:
  - Jedes Auto verfügt über einen eigenen `Engine`- und `Tank`.
  - Der Verbrauch, die Geschwindigkeit und die gefahrene Strecke werden berechnet und ausgegeben.
  - Tankvorgänge und Nachfüllen werden simuliert.
- **Ausgabe**: Das Programm gibt detaillierte Statusupdates für jedes Auto nach jeder Fahrperiode aus und bestimmt am Ende den Gewinner des Rennens.

### Zielgruppe

Dieses Projekt richtet sich an:
- Studierende, die erste Erfahrungen mit objektorientierter Programmierung sammeln möchten.
- Lehrkräfte, die eine verständliche Simulation zur Demonstration von OOP-Konzepten suchen.

### Programm starten

Stellen Sie sicher, dass Sie eine Java-Entwicklungsumgebung installiert haben. Kompilieren und führen Sie dann die Klasse `RaceTest` aus:

```sh
javac motorRace/*.java
java motorRace.RaceTest
```

---

## English

# MotorRace

**MotorRace** is a simple Java project that models a car racing simulation. Its main purpose is to demonstrate the basics of object-oriented programming (OOP) in Java – especially modeling components like Engine, Tank, and RaceCar, and how they interact in a realistic scenario.

### Features

- **Class Structure**: Includes classes `Engine`, `Tank`, `RaceCar`, and a test harness `RaceTest`.
- **Simulation**: Two vehicles from different teams ("Ferrari" and "Red Bull") compete head to head.
- **Attributes & Methods**:
  - Each car has its own `Engine` and `Tank`.
  - Calculates fuel usage, speed, and distance traveled.
  - Simulates refueling and fuel consumption.
- **Output**: The program prints detailed status updates after each period and announces the winner after the race.

### Target Audience

This project is intended for:
- Beginners learning object-oriented programming in Java.
- Educators looking for clear examples to demonstrate OOP principles.

### How to Run

Make sure you have the Java SDK installed. Then compile and run the `RaceTest` class:

```sh
javac motorRace/*.java
java motorRace.RaceTest
```
