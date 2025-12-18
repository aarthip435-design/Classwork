import java.util.Scanner;
class InvalidException extends Exception{
public String getMessage(){                                                 
return "Invalid user details. Try again";
}
}
class ATM{
int acc_num=12345678;
int password=265265;
int AN,PN;
void acceptInput(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the account number: ");
AN=sc.nextInt();
System.out.println("Enter the password: ");
PN=sc.nextInt();
}
void verify() throws InvalidException{
if(acc_num==AN && password==PN){
System.out.println("Collect your money");
}else{
InvalidException i=new InvalidException();
System.out.println(i.getMessage());
throw i;
}
}
}
class Bank{
void initiate(){
ATM atm=new ATM();
try{
atm.acceptInput();
atm.verify();
}
catch(Exception e){
try{
atm.acceptInput();
atm.verify();
}
catch(Exception a){
try{
atm.acceptInput();
atm.verify();
}
catch(Exception b){
System.out.println("Card is blocked");
System.exit(0);
}
}
}
}
}
public class CustomException{
public static void main(String[] args){
Bank b=new Bank();
b.initiate();
}
}