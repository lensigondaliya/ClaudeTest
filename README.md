# Java Calculator

A lightweight, interactive command-line calculator built in Java. Supports the four fundamental arithmetic operations with continuous session support — no restart required between calculations.

---

## Features

- **Addition, Subtraction, Multiplication, Division** — all core operations supported
- **Continuous session loop** — keep calculating until you choose to quit
- **Divide-by-zero protection** — graceful error handling with a clear message
- **Invalid operator detection** — unsupported operators are caught and reported
- **Formatted output** — results are displayed to two decimal places
- **Clean separation of concerns** — logic lives in `Calculator.java`, I/O in `Main.java`

---

## Project Structure

```
ClaudeTest/
├── src/
│   ├── Calculator.java   # Core arithmetic logic
│   └── Main.java         # CLI entry point and user interaction loop
└── README.md
```

---

## How to Run

### In IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the green **Run** button in the gutter, or press `Ctrl+Shift+F10` (Windows/Linux) / `Ctrl+Shift+R` (macOS)

### From the Terminal

```bash
# Compile
javac src/Calculator.java src/Main.java -d out

# Run
java -cp out Main
```

---

## Example Session

```
Simple Java Calculator
======================
Enter first number: 25
Enter operator (+, -, *, /): /
Enter second number: 4
Result: 25.00 / 4.00 = 6.25
Continue? (y/n): y
Enter first number: 100
Enter operator (+, -, *, /): /
Enter second number: 0
Error: Cannot divide by zero
Continue? (y/n): y
Enter first number: 7
Enter operator (+, -, *, /): *
Enter second number: 6
Result: 7.00 * 6.00 = 42.00
Continue? (y/n): n
Goodbye!
```

---

## Tech Stack

| Technology | Version  | Purpose                        |
|------------|----------|--------------------------------|
| Java       | 17+      | Core language                  |
| Java SE    | Built-in | `Scanner` for CLI input        |
| IntelliJ IDEA | Any   | Recommended IDE                |

---

## License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).