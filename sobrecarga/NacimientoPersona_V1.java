package sobrecarga;
import java.util.Scanner;
public class NacimientoPersona_V1 {
    public static void main(String[] args){
        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);
        int dia=0, año=0;
        String mesString="";
        System.out.println("Introduce el dia, mes(Texto) y año en que nos conocimos");
        try{
            dia = sc.nextInt();
            mesString = sc.next();
            año = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Debe introducir el dia y año de forma numerica y mes String");
            System.exit(0);
        }
        System.out.println("Introduce de nuevo el dia, mes(numero) y año en que nos conocimos");
        int dia2 = sc.nextInt();
        int mes = sc.nextInt();
        int año2 = sc.nextInt();
        System.out.println(persona.ingresaFechaNacimiento(dia, mesString, año));
        System.out.println(persona.ingresaFechaNacimiento(dia2, mes, año2));
    }
}

    

