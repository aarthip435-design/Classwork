class Student{
private String rollNo;
private String name;
private String email;
private int age;
public void setData(String rollNo,String name,String email,int age){
this.rollNo=rollNo;
this.name=name;
this.email=email;
this.age=age;
}
public String getRollNo(){
return rollNo;
}
public String getName(){
return name;
}
public String getEmail(){
return email;
}
public int getAge(){
return age;
}
}
public class Encapsulation{
public static void main(String[] args){
Student s1=new Student();
Student s2=new Student();
s1.setData("23AK1A0511","AARTHI","aarthip435",20);
s2.setData("23AK1A0532","CHINMAYA SAI","nimmi216",20);
System.out.println("The student 1 RollNo is: "+s1.getRollNo());
System.out.println("The student 1 Name is: "+s1.getName());
System.out.println("The student 1 Email is: "+s1.getEmail());
System.out.println("The student 1 Age is: "+s1.getAge());
System.out.println("The student 2 RollNo is: "+s2.getRollNo());
System.out.println("The student 2 Name is: "+s2.getName());
System.out.println("The student 2 Email is: "+s2.getEmail());
System.out.println("The student 2 Age is: "+s2.getAge());
}
}
