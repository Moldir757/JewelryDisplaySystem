# Jewelry Display System

## Project Description

This project demonstrates the Bridge Design Pattern in Java.

The system represents a jewelry display application where different types of jewelry can be displayed using different display styles. The Bridge Pattern separates the jewelry display abstraction from the display style implementation.

This allows the jewelry types and display styles to change independently.

## Bridge Pattern

The Bridge Pattern is a structural design pattern that separates an abstraction from its implementation so that both can vary independently.

In this project, the abstraction is related to the type of jewelry being displayed, while the implementation is related to the style used to display the jewelry.

## Project Structure

### Abstraction

`JewelryDisplay` is the main abstraction. It contains a reference to the `DisplayStyle` interface.

### Refined Abstractions

- `NecklaceDisplay` displays a necklace.
- `RingDisplay` displays a ring.

### Implementor

`DisplayStyle` is the Implementor interface. It defines the `display()` operation.

### Concrete Implementors

- `ElegantDisplayStyle` displays jewelry on a luxury velvet stand.
- `MinimalistDisplayStyle` displays jewelry on a simple white stand.

### Client

`Main` creates the display objects and combines them with different display styles at runtime.

## How the Bridge Works

The project has two separate parts.

The first part represents the jewelry type:

- Necklace
- Ring

The second part represents the display style:

- Elegant
- Minimalist

`JewelryDisplay` connects these two parts through the `DisplayStyle` reference.

For example, a necklace can use the elegant style:

```java
JewelryDisplay necklace =
        new NecklaceDisplay(
                "Diamond Necklace",
                elegantStyle);

The same necklace can then use the minimalist style:
necklace =
        new NecklaceDisplay(
                "Diamond Necklace",
                minimalistStyle);

The NecklaceDisplay class does not need to be changed when the display style changes.
Runtime Switching
The program demonstrates switching display implementations at runtime.
Initially:
- Diamond Necklace uses ElegantDisplayStyle
- Gold Ring uses MinimalistDisplayStyle
After switching:
- Diamond Necklace uses MinimalistDisplayStyle
- Gold Ring uses ElegantDisplayStyle
This demonstrates that the abstraction and implementation can vary independently.
Clean Code Principles
1. Single Responsibility Principle
Each class has one main responsibility.
For example:
- NecklaceDisplay is responsible for displaying a necklace.
- RingDisplay is responsible for displaying a ring.
- ElegantDisplayStyle is responsible for elegant display.
- MinimalistDisplayStyle is responsible for minimalist display.
This keeps the classes focused and easier to understand.
2. Meaningful Names
The project uses names that clearly describe the purpose of each class and method.
Examples:
- JewelryDisplay
- DisplayStyle
- NecklaceDisplay
- ElegantDisplayStyle
- MinimalistDisplayStyle
The method display() clearly describes the operation performed by the display style.
3. Small and Focused Classes
The classes are kept small and focused on one task.
For example, MinimalistDisplayStyle only contains the logic required for the minimalist display style.
This makes the code easier to read, test, and maintain.
4. No Duplicated Logic Between Concrete Implementors
The concrete display styles implement the same DisplayStyle interface, but each class contains its own display behavior.
ElegantDisplayStyle handles the elegant presentation, while MinimalistDisplayStyle handles the minimalist presentation.
The two classes do not duplicate unnecessary logic.
5. Open/Closed Principle
The design allows new display styles to be added without changing the existing abstraction classes.
For example, a new LuxuryDisplayStyle could implement the DisplayStyle interface.
JewelryDisplay, NecklaceDisplay, and RingDisplay would not need to be modified.
This makes the system easier to extend.
Advantages of the Design
- Jewelry types and display styles can change independently.
- New display styles can be added easily.
- The code has low coupling between abstraction and implementation.
- The system is easier to extend and maintain.
- Different display styles can be selected at runtime.
How to Run
1. Open the project in IntelliJ IDEA.
2. Open Main.java.
3. Run the main() method.
4. The console will show the jewelry displayed using different styles.
Example Output
JEWELRY DISPLAY SYSTEM

Elegant display: Diamond Necklace is shown on a luxury velvet stand.
Minimalist display: Gold Ring is shown on a simple white stand.

SWITCHING DISPLAY STYLE

Minimalist display: Diamond Necklace is shown on a simple white stand.
Elegant display: Gold Ring is shown on a luxury velvet stand.

Conclusion
The Jewelry Display System demonstrates the Bridge Design Pattern by separating jewelry display types from display styles.
The system allows different jewelry types to work with different display styles without changing the abstraction classes. This makes the design flexible, reusable, and easier to extend.