public class UseAnimals {
    public static void main(String[] args) {
        Cat objectCat=new Cat();
        objectCat.setColor("Orange");
        
        Dog objectDog=new Dog();
        objectDog.setColor("Black");
        objectDog.setOwner("Teppo Testi");
        
        objectCat.sayHello();
        objectDog.sayHello();
        System.out.println("Koiran omistaja = "+objectDog.getOwner());
      }  
}
