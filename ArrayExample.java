public class ArrayExample {
    public static void main(String[] args) {
        String[] cars={"Volvo", "Audi", "Ford","Nissan"};
        System.out.println("Ensimmäinen auto = "+cars[0]);
        //tulostetaan kaikki autot
        for(int x=0; x<cars.length; x++){
            System.out.println(cars[x]);
        }
        //tai näin 
        for (String car : cars) {
            System.out.print(car+",");
        }
      }  
}
