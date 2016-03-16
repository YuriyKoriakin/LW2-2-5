package override;

/**
 * Created by Yuriy on 16.03.2016.
 */
public class A {
    int a;
    int b;
    double r;
    public void calcSquare(int a, int b) {//Площа прямокутника
        int squareOfRectangle;
        squareOfRectangle = a * b;
        System.out.println("Square of rectangle is: "  +squareOfRectangle);
    }

    public void calcSquare(int a) {//площа квадрата
        int squareOfFoursquare;
        squareOfFoursquare = a * a;
        System.out.println("Square of foursquare is: "  +squareOfFoursquare);
    }

    public void calcSquare(double r) {//площа кола
        double squareOfCircle;
        squareOfCircle = (Math.PI * (r * r));
        System.out.println("Square of circle is: "  + squareOfCircle);
    }
}
