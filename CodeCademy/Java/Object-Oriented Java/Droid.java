public class Droid {
  int batteryLevel = 100;
  String name;
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;    
  }
  public String toString() {
    String str = "Hello, I’m the droid: " + name; 
    return str;
  }
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;     
  }
  public void energyReport() {
    System.out.println("Now battery level is " + batteryLevel + ".");
  }
  public void energyTransfer(int bl) {
    batteryLevel = bl;
    //return batteryLevel;
  }
  public static void main(String[] args) {

    Droid myDroid = new Droid("Codey");
    //System.out.println(myDroid);
    System.out.println(myDroid.name);
    myDroid.performTask("dancing");   
    myDroid.energyReport();
    myDroid.performTask("jogging");
    myDroid.energyReport();
    Droid tom = new Droid("Tom");
    tom.energyTransfer(myDroid.batteryLevel);
    tom.performTask("levitating");
    tom.energyReport();
  }
}