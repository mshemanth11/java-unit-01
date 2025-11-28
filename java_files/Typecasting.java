
class TypeCastingDemo {
    public static void main(String[] args) {
        int a = 10;
        double d = a;  // implicit casting

        double x = 9.75;
        int y = (int)x; // explicit casting

        System.out.println("Implicit Casting (int to double): " + d);
        System.out.println("Explicit Casting (double to int): " + y);
    }
}
