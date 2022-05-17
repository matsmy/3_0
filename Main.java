import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
    Scanner scan = new Scanner(System.in);
    Service1 s = new Service1();
    int a = 0;
    System.out.println("Wybierz działanie:\n1. Dodawanie nowego studenta\n2. Wyswietlenie listy studentow");
    a=scan.nextInt();
    scan.nextLine();
    switch (a) {
      case 1: {
        System.out.println("Podaj imie");
        String name = scan.nextLine();
        System.out.println("Podaj wiek");
        int age = scan.nextInt();
        s.addStudent(new Student(name, age));
        break;
    }
    case 2: {
        System.out.println("Lista studentow\n");
        var students = s.getStudents();
        for(Student current : students)
        {
        System.out.println(current.ToString());
        }
        break;
      }}}
  
      catch (IOException e) {
      System.out.print("ERROR!!");
        }
    }}