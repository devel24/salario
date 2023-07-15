
/**
 * Write a description of class Salario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salario
{
    public static void CalcularSalario(String Nombre, int Edad, float Salario)
    {
        System.out.println("Hola " + Nombre);
        
        if(Edad <= 17){
            System.out.println("Parece que eres muy pequeño para trabajar " + Nombre + " vuelve en unos años");
        }else if(Edad >= 18 && Edad <= 45){
            System.out.println("Tu salario es " + (Salario*1.05));
        }else if(Edad >= 46 && Edad <= 60){
            System.out.println("Tu salario es " + (Salario*1.15));
        }else{
            System.out.println("Parece que eres muy grande para trabajar " + Nombre);
        }
    }
}
