class P
{
  int a;
  float f;
  void dis()
  {
    System.out.println("NO Values");
  }
  void dis(int a)
  { 
    this.a=a;
    System.out.println("Values : "+a);
  } 
  void dis(float f)
  { 
    this.f=f;
    System.out.println("Values : "+f);
  } 
}
class D7
{
  public static void main(String args[])
  {
   P obj = new P();
   obj.dis();
   obj.dis(9);
   obj.dis(10.4f);
  }
}

