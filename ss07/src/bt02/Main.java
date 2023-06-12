package bt02;

public class Main {
    public static void main(String[] args) {
        StaticMethod s = new StaticMethod();

        double result1 = s.calCircleArea(2);
        double result2 = s.calRectangleArea(3, 4);
        double result3 = s.calTriangleArea(5, 6, 7);
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
    }
}
