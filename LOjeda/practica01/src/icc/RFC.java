import java.util.Scanner;

/**
*Programa para simular una consulta de psicología
*Objetivo que el programa recabe información y la utilice para generar comentarios
*@autor Luis Angel Ojeda Cruz 
*@version 1.0
*/

public class RFC{

  public static void main(String[]args){
  
    Scanner in = new Scanner(System.in);
    String nombreCompleto;
    String fechaNacimiento;
    
    System.out.println("Favor de ingresar su nombre completo");
    nombreCompleto = in.nextLine();
    System.out.println("Ingrese  su fecha de nacimiento en formato dd/mm/aa");
    fechaNacimiento = in.nextLine();
    
    int primerEspacio = nombreCompleto.indexOf(" ");
    int ultimoEspacio = nombreCompleto.lastIndexOf(" ");
    
    String nombre = nombreCompleto.substring(0, primerEspacio);
    String apellidoPaterno = nombreCompleto.substring(primerEspacio+1, ultimoEspacio);
    String apellidoMaterno = nombreCompleto.substring(ultimoEspacio + 1);
    
    String letrasPaterno = apellidoPaterno.substring(0,2);
    char inicialMaterno = apellidoMaterno.charAt(0);
    char inicialNombre = nombre.charAt(0);
    
    int primeraDiagonal = fechaNacimiento.indexOf("/");
    int ultimaDiagonal = fechaNacimiento.lastIndexOf("/");
    
    String dia = fechaNacimiento.substring(0, primeraDiagonal);
    String mes = fechaNacimiento.substring(primeraDiagonal + 1, ultimaDiagonal);
    String año = fechaNacimiento.substring(ultimaDiagonal + 1);
    
    String rfc = letrasPaterno + inicialMaterno + inicialNombre + año + mes + dia;
    
    System.out.println("El RFC de " + nombreCompleto + "es: " + rfc.toUpperCase());
    
    
  }
  
}
