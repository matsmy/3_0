public class Student {

  private String Name;
  private int Age;
  private String Du;

  public Student(String name, int age, String du) {
    Name = name;
    Age = age;
    Du = du;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetDu() {return Du;}

  public String ToString() {
    return Name + " " + Integer.toString(Age) + " " + Du;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", -1, "00.00.0000");
    return new Student(data[0], Integer.parseInt(data[1]), data[2]);
  }
}