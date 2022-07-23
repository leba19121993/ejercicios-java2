package sobrecarga;
import java.util.Scanner;
public class NacimientoPersona {
    public static void main(String[] args){
        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia, mes(Texto) y año en que nos conocimos");
        int dia = sc.nextInt();
        String mesString = sc.next();
        int año = sc.nextInt();
        System.out.println("Introduce de nuevo el dia, mes(numero) y año en que nos conocimos");
        int dia2 = sc.nextInt();
        int mes = sc.nextInt();
        int año2 = sc.nextInt();
        System.out.println(persona.ingresaFechaNacimiento(dia, mesString, año));
        System.out.println(persona.ingresaFechaNacimiento(dia2, mes, año2));
    }
}
