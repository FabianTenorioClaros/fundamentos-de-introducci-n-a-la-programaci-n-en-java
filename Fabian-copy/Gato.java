
/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato
{
    // instance variables - replace the example below with your own
    private int edad=1;
    private String nombre="Gato";
    private float peso=3.0f;
    
public int edadHumana (){
        //la edad se multiplica por 7 y se devueleve
        return edad*7;
}
public void alimentar (int tipoDeComida){
    if (tipoDeComida==0)
    System.out.println("Soy un Gato que come Gatocat");
    else
    System.out.println("Soy un Gato que come Croquetas");
}
public String Interactuar(){
    return "Miau";
}
public void ImprimeInformacion(){
    System.out.println("Soy un Gato con "+edad+" año, y me llamo "+nombre);
}
Gato (int gEdad, String gNombre, float gPeso){
    edad=gEdad;
    nombre=gNombre;
    peso=gPeso;
}
}
