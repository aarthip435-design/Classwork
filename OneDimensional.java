import java.util.Scanner;
class OneDimensional{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int age[]=new int[5];
for(i=1;i<=age.length;i++){
System.out.println("Enter the age of student:"+i);
age[i]=sc.nextInt();}
System.out.println("The ages are.............");
for(i=1;i<=age.length;i++){
System.out.println(age[i]);
}
}
}

