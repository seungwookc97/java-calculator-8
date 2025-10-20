package calculator;

import java.util.regex.Pattern;

class Calculator {

    public static int calculate(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String operator = ",|:";
        String numbers = input;

        if (input.startsWith("//")) {
            int newlineIndex = input.indexOf("\n");
            if (newlineIndex == -1) {
                newlineIndex = input.indexOf("\\n");
                if (newlineIndex != -1) {
                    String customDelimiter = input.substring(2, newlineIndex);
                    operator = Pattern.quote(customDelimiter);
                    numbers = input.substring(newlineIndex + 2);
                }
            } else {
                String addOperator = input.substring(2, newlineIndex);
                operator = Pattern.quote(addOperator);
                numbers = input.substring(newlineIndex + 1);
            }
        }

        String[] numberArray = numbers.split(operator);
        return sum(numberArray);
    }

    private static int sum(String[] numbers) {
        int total = 0;
        for (String number : numbers) {
            total += Integer.parseInt(number);
        }
        return total;
    }
}
