package sobrecarga;
import java.util.Scanner;
public class Sobrecarga {
    public static void main(String[] args){
        Amigo amigo = new Amigo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mes(Texto) y año en que nos conocimos");
        String mesString = sc.next();
        int año = sc.nextInt();
        System.out.println("Introduce de nuevo el mes(numero) y año en que nos conocimos");
        int mes = sc.nextInt();
        int año2 = sc.nextInt();
        System.out.println(amigo.desdeCuando(mesString, año));
        System.out.println(amigo.desdeCuando(mes, año2));
    }
    
}
