class Charger{
private String name;
private int voltage;
public Charger(String name,int voltage){
this.name=name;
this.voltage=voltage;
}
public void setName(String name){
this.name=name;
}
public void setVoltage(int voltage){
this.voltage=voltage;
}
public String getName(){
return name;}
public int getVoltage(){
return voltage;}
}
class OS{
private String name;
private int version;
public OS(String name,int version){
this.name=name;
this.version=version;
}
public void setName(String name){
this.name=name;
}
public void setVersion(int version){
this.version=version;
}
public String getName(){
return name;
}
public int getVersion(){
return version;
}
}
class Mobile{
OS s=new OS("Android",15);
void hasCharger(Charger c){
System.out.println(c.getName());
System.out.println(c.getVersion());
}
}
public class AggregationAndComposition{
public static void main(String[] args){
Mobile m=new Mobile();
Charger c=new Charger("Apple",20);
m.hasCharger(c);
System.out.println("...........................");
System.out.println(m.s.getName());
System.out.println(m.s.getVersion());

