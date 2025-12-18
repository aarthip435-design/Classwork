class Plane{
void takeOff(){
System.out.println("Plane is taking off");
}
void fly(){
System.out.println("Plane is flying");
}
void land(){
System.out.println("Plane is landing");
}
}
class CargoPlane extends Plane{
void fly(){//overridden method
System.out.println("Cargoplane is flying at low heights");
}
void carryCargo(){//specialized method
System.out.println("Cargoplane carries cargo");
}
}
class PassengerPlane extends Plane{
void fly(){//overridden method
System.out.println("Passengerplane is flying at medium heights");
}
void carryPassenger(){//specialized method
System.out.println("Passenger plane carries passengers");
}
}
class FighterPlane extends Plane{
void fly(){//overridden method
System.out.println("Fighter plane is flying at great heights");
}
void carryWeapons(){//specialized method
System.out.println("Fighter plane carries weapons");
}
}
public class Polymorphism{
public static void main(String[] args){
CargoPlane cp=new CargoPlane();
PassengerPlane pp=new PassengerPlane();
FighterPlane fp=new FighterPlane();
Plane ref;
ref=cp;
ref.takeOff();
ref.fly();
ref.land();
((CargoPlane)(ref)).carryCargo();
ref=pp;
ref.takeOff();
ref.fly();
ref.land();
((PassengerPlane)(ref)).carryPassenger();
ref=fp;
ref.takeOff();
ref.fly();
ref.land();
((FighterPlane)(ref)).carryFighter();
}
}




