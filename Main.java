import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    try {
      Service1 s = new Service1();
      Scanner read=new Scanner(System.in);  
      int choose=0;
      while(choose!=3){
      System.out.println("***MENU***");
      System.out.println("1 - Dodaj studenta");
      System.out.println("2 - Lista studentów");
      System.out.println("3 - Powrót do MENU");
      choose=read.nextInt();
      switch(choose){
        case 1:{
            System.out.println("Podaj imie: ");
            String imie=read.next();  
            System.out.println("Podaj wiek: ");
            int wiek=read.nextInt();
            System.out.println("Podaj date urodzenia(dd-mm-rrrr): ");
            String dataUr=read.next();  
            s.addStudent(new Student(imie, wiek, dataUr));
            System.out.println("Dodano studenta, powrot do MENU");
            break;
          }
      case 2:{
        var studenci = s.getStudents();
        for(Student aktualny : studenci) {
          System.out.println(aktualny.ToString());
          }
        }  
      }
      
    }
    read.close();
    } 
    catch (IOException e) {

    }
    }
}