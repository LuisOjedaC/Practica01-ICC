import java.util.Scanner;

/**
*Programa para simular una consulta de psicología
*Objetivo que el programa recabe información y la utilice para generar comentarios
*@autor Luis Angel Ojeda Cruz 
*@version 1.0
*/

public class Psicologo{
  
  public static void main(String[]args){
    
    Scanner in = new Scanner(System.in);
    String nombre;
    String problema;
    String respuesta;
    
    System.out.println("Bienvenido a su consulta ¿Cuál es su nombre?");
    nombre = in.nextLine();
    System.out.println("Hola "+nombre+" ¿Cuál es su problema?");
    problema = in.nextLine();
    System.out.println("MMMM... ya veo");
    System.out.println("Y digame...");
    System.out.println("¿Por qué dice? '"+problema+"'");
    respuesta = in.nextLine();
    System.out.println("Muy interesante!!, Hablaremos de ello con más con más detalle en la siguiente sesión.");
    
  }
  
}
