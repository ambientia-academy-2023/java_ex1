public class Horse extends Animal implements IAnimal {

    @Override
    public void sayName() {
        System.out.println("Minun nimeni on Hepo");
        
    }

    @Override
    public int sayAge(String fname) {
        if(fname.equals("Hepo")){
            return 15;
        }
        return 0;
    }

    @Override
    void sayHello() {
        System.out.println("Horse perii Animal luokan");
        
    }
    
}
