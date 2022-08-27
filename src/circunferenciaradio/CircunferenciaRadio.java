package circunferenciaradio;
import java.util.Scanner;

/**
 *
 * @author Rib
 */
public class CircunferenciaRadio 
{
  //Programa que devuelve el radio y área de un circulo
    public static void main(String[] args) 
    {
        double radio, longitudCircunferencia, areaCircunferencia;
        final double pi = 3.141592;
           Scanner s = new Scanner(System.in);
           System.out.println("** 1. Programa que devuelve el radio y área de un circulo**\n");
           System.out.println("Ingrese el radio del numero: ");
           radio=s.nextDouble();    
           longitudCircunferencia = 2*pi*radio;
           areaCircunferencia = pi*radio*radio;  
       System.out.println("La Longitud de la Ciruncerencia es: "+longitudCircunferencia);
       System.out.println("El Area de la Ciruncerencia es: "+areaCircunferencia);
    }   
}
