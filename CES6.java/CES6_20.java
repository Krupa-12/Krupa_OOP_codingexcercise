public class Main {
    public static void main(String[] args) {

        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide numerator and denominator.");
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
    }
}
