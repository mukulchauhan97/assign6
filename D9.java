abstract class vehicle
{
  abstract void start();
  abstract void stop();
}
class two extends vehicle
{
  void start()
  {
    System.out.println("Start bike");
   }
  void stop()
  {
    System.out.println("stop bike");
  }
}
class four extends vehicle
{
  void start()
  {
    System.out.println("Start car");
   }
  void stop()
  {
    System.out.println("stop car");
  }
}
class D9
{
 public static void main(String args[])
 {
   vehicle obj=new two();
   obj.start();
   obj.stop();
   obj=new four();
   obj.start();
   obj.stop();
 }
}

