public class Dog extends Animal {
    private String owner;

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    void sayHello() {
        System.out.println("Olen koira");
        
    }
    
}
