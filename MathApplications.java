class MathOperations {
    // Multiplication method
    public static float mul(float x, float y) {
        float t = x * y;
        return t;
    }

    // Division method
    public static float divide(float a, float b) {
        return (a / b);
    }
}

public class MathApplications {
    public static void main(String args[]) {
        // Multiplication
        float z = MathOperations.mul(4.0f, 5.0f);

        // Division
        float D = MathOperations.divide(z, 2.0f);

        // Output
        System.out.println("Division = " + D);
        System.out.println("Multiplication = " +z);
    }
}