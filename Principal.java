
import java.util.Scanner;


public class Principal {
  public static void main(String[]args){
      
   final double PI = 3.14;
   
   // Crear objeto c1 a partir del constructor sin parametros
   Circunferencia c1 = new Circunferencia();
   System.out.println("Radio de C1: " + c1.getRadio());
   
   // Calcular e imprimir diametro de c1
   c1.calcularDiametro(c1.getRadio());
   System.out.println("Diametro de C1: " + c1.getDiametro());
   
   // Calcular e imprimir longitud de c1
   c1.calcularLongitud(c1.getDiametro(),PI);
   System.out.println("Longitud de C1: " + c1.getLongitud());
   
   // Calcular e imprimir area de c1
   c1.calcularArea(c1.getRadio(), PI);
   System.out.println("Area de C1: " + c1.getArea());
   
   
   //Linea en blanco
   System.out.println("");
   
   
   // Toma de valores por teclado    
   Scanner teclado = new Scanner(System.in);
   
   //Solicitar por teclado el radio de c2 y almacenarlo en la variable radio
   System.out.print("Ingrese el radio de C2: ");
   double radio = teclado.nextDouble();
   
   // Crear objeto c2 a partir del constructor con parametros
   Circunferencia c2 = new Circunferencia(radio);
   c2.setRadio(radio);
   
   // Calcular e imprimir diametro de c2
   c2.calcularDiametro(c2.getRadio());
   System.out.println("Diametro de C2: " + c2.getDiametro());
   
   // Calcular e imprimir longitud de c2
   c2.calcularLongitud(c2.getDiametro(),PI);
   System.out.println("Longitud de C2: " + c2.getLongitud());
   
   // Calcular e imprimir area de c2
   c2.calcularArea(c2.getRadio(), PI);
   System.out.println("Area de C2: " + c2.getArea());        
      
   }
}
