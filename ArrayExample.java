import java.util.Arrays;

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
        //Array sort esimerkki
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
      }  
}
