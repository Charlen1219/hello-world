import java.util.*;
// Creating abstract class
abstract class FarmAnimals{
   String gender;
   int age;
   int weight;
   // Constructor
   FarmAnimals(String gender,int age,int weight){
       this.gender = gender;
       this.age = age;
       this.weight = weight;
   }
   abstract void makeNoise();
}
// Inheritance
class Chicken extends FarmAnimals{
   boolean birdFlue;
   // Constructor
   Chicken(String gender,int age,int weight,boolean flue){
       // Calling FarmAnimals constructor
       super(gender,age,weight);
       birdFlue = flue;
   }
   // Method overRiding
   void makeNoise() {
       System.out.println("Cluck");
   }
}
// Inheritance
class Cow extends FarmAnimals{
   boolean dairyCow;
   String temperament;
   // Constructor
   Cow(String gender,int age,int weight,boolean dairyCow,String temperament){
       // Calling FarmAnimals constructor
       super(gender,age,weight);
       this.dairyCow = dairyCow;
       this.temperament = temperament;
   }
   // Method overRiding
   void makeNoise() {
       System.out.println("Moo");
   }
}
public class Driver {
   public static void main(String[] args) {
       ArrayList<FarmAnimals> animalList = new ArrayList<FarmAnimals>();
       FarmAnimals a = new Chicken("male",5,2,false);
       FarmAnimals b = new Cow("female",3,50,true,"shy");
       FarmAnimals c = new Cow("female",4,60,true,"bold");
       FarmAnimals d = new Chicken("male",1,1,false);
       FarmAnimals e = new Chicken("male",4,2,true);
       animalList.add(a);
       animalList.add(b);
       animalList.add(c);
       animalList.add(d);
       animalList.add(e);
       for(int i = 0;i < animalList.size();i++) {
           FarmAnimals animal = animalList.get(i);
           if(animal.getClass() == Chicken.class) {
               System.out.print("Genger = "+animal.gender+" Age = "+animal.age+" Weight = "+animal.weight);
               Chicken temp = (Chicken)animal;
               System.out.println(" Bird flue = "+temp.birdFlue);
           }
           else {
               System.out.print("Genger = "+animal.gender+" Age = "+animal.age+" Weight = "+animal.weight);
               Cow temp = (Cow)animal;
               System.out.println(" Dairy cow = "+temp.dairyCow+" Temperament = "+temp.temperament);
           }
              
           animal.makeNoise();
           System.out.println();
       }
   }
} 