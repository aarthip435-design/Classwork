class Rectangle{
int area(int l,int b){
return l*b; 
}
float area(int l,float b){
return l*b;
}
float area(float l,int b){
return l*b;
}
int area(int l,int b,int h){
return l*b*h;
}
}
public class MethodOverloading{
public static void main(String[] args){
Rectangle r=new Rectangle();
Sytem.out.prinln(r.area(10,20));
Sytem.out.prinln(r.area(35.5f,20));
Sytem.out.prinln(r.area(20,30.5f));
Sytem.out.prinln(r.area(10,20,30));
}
}