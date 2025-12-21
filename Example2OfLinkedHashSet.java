import java.util.*;
class Student{
private String name;
private String rollno;
private String email;
public Student(String name, String rollno, String email){
super();
this.name=name;
this.rollno=rollno;
this.email=email;
}
public String getName(){
return name;
}
public String getRollno(){
return rollno;
}
public String getEmail(){
return email;
}
public String toString(){
return "Student Name: "+name+" Student RollNo: "+rollno+" Student email: "+email;
}
}
public class Example2OfLinkedHashSet{
public static void main(String[] args){
Student s1=new Student("Aarthi","23AK1A0511","aarthip265");
Student s2=new Student("Anu","23AK1A0509","anu435");
LinkedHashSet<Student> lhs=new LinkedHashSet<Student>();
lhs.add(s1);
lhs.add(s2);
System.out.println(lhs);
for(Object obj:lhs){
System.out.println(obj);
}
}
}