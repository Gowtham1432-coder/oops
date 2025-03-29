class Operations {
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
}

// Derived class - MoreOperations, inheriting Operations
class  new extends Operations {
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        } else {
            return a / b;
        }
    }
}

// Final class - Calculator, inheriting MoreOperations
class Calculator extends new {
    public void performOperation(String operation, double a, double b) {
        switch (operation) {
            case "add":
                System.out.println("Addition: " + add(a, b));
                break;
            case "subtract":
                System.out.println("Subtraction: " + subtract(a, b));
                break;
            case "multiply":
                System.out.println("Multiplication: " + multiply(a, b));
                break;
            case "divide":
                System.out.println("Division: " + divide(a, b));
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.performOperation("add", 10, 5);
        calc.performOperation("subtract", 10, 5);
        calc.performOperation("multiply", 10, 5);
        calc.performOperation("divide", 10, 5);
        calc.performOperation("divide", 10, 0);  // Division by zero
    }
}
