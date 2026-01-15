import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileDivider {

    public static int divide(String fileName) throws OperationAttemptException {
        Scanner sc = null;

        try {
            File f = new File(fileName);
            sc = new Scanner(f);
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();
            return numerator / denominator;

        } catch (FileNotFoundException e) {
            throw new OperationAttemptException("File not found", e);

        } catch (InputMismatchException e) {
            throw new OperationAttemptException("Invalid number format", e);

        } catch (NoSuchElementException e) {
            throw new OperationAttemptException("Not enough numbers", e);

        } catch (ArithmeticException e) {
            throw new OperationAttemptException("Division by zero", e);

        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public static int divideSafe(String fileName) {
        try {
            return divide(fileName);
        } catch (OperationAttemptException e) {
            return 0;
        }
    }
}
