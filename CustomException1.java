import java.util.Scanner;
class PasswordException extends Exception
{
public String getMessage()
{
return "Invalid password. Try again!";
}
}
class Login
{
int password=123456;
String userName="AARTHI";
int PS;
String US;
void takeInput()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the User Name: ");
US=sc.next();
System.out.println("Enter the Password: ");
PS=sc.nextInt();
}
void check()throws PasswordException
{
if(password==PS && userName.equals(US))
{
System.out.println("Login Successful");
}
else
{
PasswordException p=new PasswordException();
System.out.println(p.getMessage());
throw p;
}
}
}
class APP
{
void start()
{
Login l=new Login();
try
{
l.takeInput();
l.check();
}
catch(Exception e)
{
try
{
l.takeInput();
l.check();
}
catch(Exception a)
{
try
{
l.takeInput();
l.check();
}
catch(Exception b)
{
System.out.println("Login failed.");
System.exit(0);
}
}
}
}
}
public class CustomException1
{
public static void main(String[] args)
{
APP app=new APP();
app.start();
}
}
