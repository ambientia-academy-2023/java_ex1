public class Horse implements IAnimal {

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
    
}
