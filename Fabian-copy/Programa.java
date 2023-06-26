
/**
 * Write a description of class Programa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Programa
{
    public static void main (String args[]){
    Perro miPerro = new Perro(4, "Juanacha", 5.5f);
    miPerro.alimentar(0);
    miPerro.Interactuar();
    miPerro.imprimeInformacion();  
    
    Gato miArenita= new Gato(1, "Arenita", 2.0f);
    miArenita.Interactuar();
    miArenita.alimentar(0);
    miArenita.ImprimeInformacion();
    }
}
