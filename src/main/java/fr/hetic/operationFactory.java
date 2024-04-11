import java.util.Map;
import java.util.function.BinaryOperator;

public class OperationFactory {
    public static OperationStrategy getOperationStrategy(String operator) {
        switch (operator) {
            case "+":
                return new AdditionStrategy();
            case "-":
                return new SubtractionStrategy();
            case "*":
                return new MultiplicationStrategy();
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
