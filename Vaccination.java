import java.util.Scanner;
abstract class Vaccine{
int age;
boolean firstDoseTaken=false;
boolean secondDoseTaken= false;
String nationality;
boolean firstDose(){
if(age>=18){
System.out.println("First Dose was successfully done. Now you have to pay 250 rupees.");
 firstDoseTaken=true;
return firstDoseTaken;
}else{
System.out.println("Not eligible to take medicine");
return firstDoseTaken;
}
}
boolean secondDose(){
if(firstDoseTaken){
System.out.println("Your Second dose is successfully done.");
secondDoseTaken= true;
return secondDoseTaken;
}else{
System.out.println("First you need to take the first dose before taking the second dose.");
return secondDoseTaken;
}
}
abstract void boostDose();
}
class Example extends Vaccine{
Example(String nationality,int age){
this.nationality=nationality;
this.age=age;
}
void boostDose(){
if(secondDoseTaken){
System.out.println("Your Booster Dose is successfully done");
}else{
System.out.println("First you need to complete the first and second doses");
}
}
}
public class Vaccination{
public static void main(String[] args){
Example e1=new Example("Indian",20);
Example e2=new Example("Indian",17);
e1.firstDose();
e1.secondDose();
e1.boostDose();
}
}

