import java.util.Scanner;
class animal
{
String breed,color;
void speak()
{}
}
class dog extends animal
{
void setData(String s1,String s2)
{
breed=s1;
color=s2;
}
void speak()
{
System.out.println("breed:"+breed+"\ncolor:"+color+"\nspeak:"+"bark.....");
}
}
class cat extends animal
{
void setData(String s1,String s2)
{
breed=s1;
color=s2;
}
void speak()
{
System.out.println("breed:"+breed+"\ncolor:"+color+"\nspeak:"+"meow.....");
}
}
class m
{
public static void main(String args[])
{
Scanner kb=new Scanner(System.in);
dog d=new dog();
cat c=new cat();
String s1,s2;
System.out.println("Enter values:");
s1=kb.next();
s2=kb.next();
d.setData(s1,s2);
System.out.println("Enter values:");
s1=kb.next();
s2=kb.next();
c.setData(s1,s2);
d.speak();
c.speak();
}
}