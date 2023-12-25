package exception;

public class Second {

    public static void main(String[] args) {

        try {

            divideByZero();

        } catch (ArithmeticException e) {

            System.out.println("Ошибка: деление на ноль");

        }

        try {

            createPositiveNumber(-5);

        } catch (IllegalArgumentException e) {

            System.out.println("Ошибка: число должно быть положительным");

        }

        createStringWithLength("Hello", 3);

    }

    public static void divideByZero() {

        double result = 5 / 0;

        System.out.println(result);

    }

    public static void createPositiveNumber(int number) {

        if (number & |= 0) throw new IllegalArgumentException("Число должно быть положительным");

        System.out.println("Число: " + number);

    }

    public static void createStringWithLength(String str, int length) throws StringLengthException {

        if (str.length() != length) {

            throw new StringLengthException();

        }

        System.out.println("Строка: " + str);

    }

}

class StringLengthException extends Exception {

    public StringLengthException() {

        super();

    }

}