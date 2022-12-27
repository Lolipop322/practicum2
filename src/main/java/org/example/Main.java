package main.java.org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Введите стороны прямоугольника");
       double a=Double.parseDouble(in.nextLine());
       double b=Double.parseDouble(in.nextLine());
       Rectangle square=new Rectangle(a,b);
       System.out.println("Площадь квадрата:"+square.getS());
       System.out.println("Периметр квадрата:"+square.getP());
       System.out.println("Введите радиус круга");
       double r=Double.parseDouble(in.nextLine());
       Circle circle=new Circle(r);
       System.out.println("Площадь круга:"+circle.getS());
       System.out.println("Периметр круга:"+circle.getP());
       System.out.println("Введите стороны треугольника");
       a=Double.parseDouble(in.nextLine());
       b=Double.parseDouble(in.nextLine());
       double c=Double.parseDouble(in.nextLine());
       Triangle triangle = new Triangle(a,b,c);
       System.out.println("Площадь треугольника:"+triangle.getS());
       System.out.println("Периметр треугольника:"+triangle.getP());
    }
}