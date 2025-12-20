import java.util.*;
class Employee{
private String empName;
private String empDesignation;
private String empEmail;
public Employee(String empName,String empDesignation,String empEmail){
this.empName=empName;
this.empDesignation=empDesignation;
this.empEmail=empEmail;
}
public String getEmpName(){
return empName;
}
public String getEmpDesignation(){
return empDesignation;
}
public String getEmail(){
return empEmail;
}
@Override
public String tostring(){
return "Employee Name: "+empName+" Employee Designation: "+empDesignation+" Employee Email: "+empEmail;
}
}
public class Example2OfLinkedList{
public static void main(String[] args){
Employee e1=new Employee("Aarthi","Developer","aarthip435");
Employee e2=new Employee("Anu","Tester","anup435");
Employee e3=new Employee("Vicky","Tech Support","vickyp435");
LinkedList<Employee> ll=new LinkedList<Employee>();
ll.add(e1);
ll.add(e2);
ll.add(e3);
for(Object obj:ll){
System.out.println(obj);
}
}
}
/*
Autoboxing
int a=10;
Integer i=new Integer(a);
Auto unboxing
Integer in=new Integer(10);
int b=in;
*/