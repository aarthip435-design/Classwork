import java.lang.Math;
class Circle{
double area(int r){
return Math.PI*r*r;
}
double area(float r){
return Math.PI*r*r;
}
double area(double r){
return Math.PI*r*r;
}
}
public class MethodOverloading1{
public static void main(String[] args){
Circle c=new Circle();
System.out.println(c.area(10));
System.out.println(c.area(25.5f));
System.out.println(c.area(30.5));
}
}
