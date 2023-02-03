import java.io.Console;

public class UsePerson {
    public static void main(String[] args) {
        Person objectPerson=new Person();
        Console c=System.console();
        System.out.println("Anna etunimi");
        objectPerson.setFname(c.readLine());
        System.out.println("Etunimi ="+objectPerson.getFname());
      }  
}