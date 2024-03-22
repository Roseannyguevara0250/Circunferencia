
import java.io.*;

public class Circunferencia {
   
   public final double PI=3.14;
   private double radio;
   private double longitud;
   private double diametro;
   private double area;
   
   //Constructor con parametro
   public Circunferencia (double radio) {
      
      this.radio = radio;
      
   }
   
   //Constructor sin parametro
   public Circunferencia() {
      //Se puede asignar cualquier otro valor desde aca para radio de c1
      this.radio = 3.0;
     
   }

      
   public void setRadio (double radio) {
      this.radio = radio;
   } //Fin del metodo setRadio
   
   
   public double getRadio(){
      return radio;
   } //Fin del metodo getRadio
   
   
   public void calcularDiametro (double radio){
      diametro = radio*radio;
   } //Fin del metodo calcularDiametro
   
   
   public double getDiametro(){
      return diametro;
   } //Fin del metodo getDiametro
   

   public void calcularLongitud (double diametro, final double PI){
      longitud = diametro*PI;
   } //Fin del metodo calcularLongitud
   
   
   public double getLongitud(){
      return longitud;
   } //Fin del metodo getLongitud
      
   
   public void calcularArea(double radio, final double PI){
      area = 2*PI*radio;
   } //Fin del metodo calcularArea
   
   
   public double getArea(){
      return area;
   } //Fin del metodo getArea
   
}