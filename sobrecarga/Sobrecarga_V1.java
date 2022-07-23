package sobrecarga;
import java.util.Scanner;
public class Sobrecarga_V1 {
     public static void main(String[] args){
         int mes=0, año=0,año2=0;
        Amigo amigo = new Amigo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mes(Texto) y año en que nos conocimos");
        String mesString = sc.next();
        try{
            año = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Debe introducir el año de forma numerica");
            System.exit(0);
        }
         System.out.println("introduce de nuevo el mes(numero) y año en que nos conocimos");
         try{
             mes = sc.nextInt();
             año2 = sc.nextInt();
         }
         catch(Exception e){
             System.out.println("Debe introducir el mes y año de forma numerica");
             System.exit(0);           
         }       
        System.out.println(amigo.desdeCuando(mesString, año));
        System.out.println(amigo.desdeCuando(mes, año2));
    }
    
}
