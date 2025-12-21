import java.util.*;
class NameComparator implements Comparator<Student>{
public int compare(Student s1,Student s2){
return s1.getName().compareTo(s2.getName());
}
}
class RollnoComparator implements Comparator<Student>{
public int compare(Student s1,Student s2){
return s1.getRollno().compareTo(s2.getRollno());
}
}
class Student{
private String name;
private String rollno;
public Student(String name,String rollno){
super();
this.name=name;
this.rollno=rollno;
}
public String getName(){
return name;
}
public String getRollno(){
return rollno;
}
public String toString(){
return "Student Name: "+name+" Student Rollno: "+rollno;
}
}
public class ExampleOfComparator{
public static void main(String[] args){
Student s1=new Student("AARTHI","23AK1A0511");
Student s2=new Student("ANU","23AK1A0509");
Student s3=new Student("PRABHAS","23AK1A0511");
ArrayList<Student> al=new ArrayList<Student>();
al.add(s1);
al.add(s2);
al.add(s3);
Collections.sort(al,new NameComparator());
for(Object i:al){
System.out.println(i);
}
}
}