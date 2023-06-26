
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro
{
    // instance variables - replace the example below with your own
    private int edad=2;
    private String nombre="Perro";
    private float peso=1.0f;
    
    public int adadHumana(){
    //la edad se multiplica por 7 y se devuelve
        return edad*7;
    }
    public void alimentar (int tipoDeComida){
        if (tipoDeComida==0)
        System.out.println("Soy un perro comiendo carne");
        else
        System.out.println("Soy un perro comiendo croquetas");
    }
    public String Interactuar(){
        return "Guau";
    }
    public void imprimeInformacion(){
        System.out.println("Soy un perro con "+edad+" años, y me llamo: "+nombre);
    }
    Perro (int pEdad, String pNombre, float pPeso){
        edad=pEdad;
        nombre=pNombre;
        peso=pPeso;
    }
}