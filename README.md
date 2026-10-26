# Assignment #5 - Strategy Pattern (Navigation System)

## Overview
This project is an implementation of the **Strategy Behavioral Design Pattern** in Java (JDK 17) for the Software Design Patterns course.

It simulates a **Navigation / Route Planning System** where route calculation algorithms change dynamically at runtime depending on the selected transport strategy (Car, Walk, Bicycle), avoiding conditional branching logic (`if`/`switch`) inside the context.

## Project Structure
```text
strategy-pattern-assignment/
├── README.md
├── report.md
└── src/
    ├── RouteStrategy.java      # Strategy Interface
    ├── CarStrategy.java        # Concrete Strategy 1
    ├── WalkStrategy.java       # Concrete Strategy 2
    ├── CycleStrategy.java      # Concrete Strategy 3
    ├── NavigatorContext.java   # Context
    └── Main.java               # Client / Entry Point