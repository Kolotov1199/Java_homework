package exception;

class MyException extends Exception {

    public MyException(String message) {
        super(message);

    }

}


class ExceptionDemo {


    public static void throwException(boolean shouldThrow) throws MyException {

        if (shouldThrow) {
            throw new MyException("Исключение было брошено");
        } else {
            System.out.println("Исключение не было брошено");

        }

    }

    public static void main(String[] args) {

        try {
            throwException(true);
        } catch (MyException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
        try {throwException(false);}
        catch (MyException e) {
            System.out.println("Поймано исключение: " + e.getMessage());

        }

    }

}