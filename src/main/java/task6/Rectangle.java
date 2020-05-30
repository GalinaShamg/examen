package task6;

public class Rectangle {
    int length;
    int width;
    String ifIsSquare;

    public static String ifIsSquare(int length, int width){
        return length==width ? "квадрат" : "прямоугольник";
    }
}
