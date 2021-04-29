package typeinfo;//: typeinfo/Shapes.java
import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + "---draw()"); }
  abstract public String toString();
  Boolean highlight = true;
}

class Circle extends Shape {
  Boolean highlight = false;
  public String toString() { return "Circle highlight:"+ highlight; }
}

class Square extends Shape {
  public String toString() { return "Square highlight:"+ highlight; }
}

class Rhomboid extends Shape {
  public String toString() { return "Rhomboid highlight:"+ highlight; }
}

class Triangle extends Shape {
  public String toString() { return "Triangle highlight:"+ highlight; }
}	

public class Shapes {

  public static void rotate(Shape shape) {
    if(shape instanceof Circle){
      System.out.println("Circle do not need rotate!");
    }else{
      System.out.println(Shape.class.getSimpleName() + ".rotate()");
    }
  }

  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle(), new Rhomboid()
    );
    for(Shape shape : shapeList){
      shape.draw();
      rotate(shape);
    }

    String canonicalName = Shape.class.getCanonicalName();

    Rhomboid rhomboid = new Rhomboid();
    Shape oneShape = (Shape)rhomboid;// even if upcast to Shape, but the oneShape is still a Rhomboid.
    oneShape.draw();
    System.out.println(oneShape instanceof Shape);
    System.out.println(oneShape instanceof Rhomboid);
    Rhomboid oneRhomboid = (Rhomboid)oneShape; // downcast
    oneRhomboid.draw();

//    Circle oneCircle = (Circle) oneRhomboid;//  typeinfo.Rhomboid cannot be converted to typeinfo.Circle
    System.out.println(oneShape instanceof Circle);

  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
