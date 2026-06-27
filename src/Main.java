 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {

         System.out.println("\nBienvenidos a la fabrica de laptops");
         System.out.println();

         Laptop laptop1 = LaptopFactory.crearLaptop("gamer");
         laptop1.ejecutarPrueba();
         System.out.println();

         Laptop laptop2 = LaptopFactory.crearLaptop("basica");
         laptop2.ejecutarPrueba();
         System.out.println();

         Laptop laptop3 = LaptopFactory.crearLaptop("profesional");
         laptop3.ejecutarPrueba();
     }
 }

