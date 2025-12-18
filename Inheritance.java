class Credit{
int cardNo=12345;
int pinNo=265265; 
}
class Hacker extends Credit{
void viewDetails(){
System.out.println(cardNo);
System.out.println(pinNo);
}
void changeDetails(){
cardNo=262626;//overridden variables
pinNo=7777777;
}
}
public class Inheritance{
public static void main(String[] args){
Hacker h=new Hacker();
h.viewDetails();
h.changeDetails();
System.out.println(".........................................");
h.viewDetails();
}
}