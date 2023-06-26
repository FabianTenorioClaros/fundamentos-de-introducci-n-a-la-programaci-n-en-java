public class Gato{
    private int edad;
    private double peso;
    private String nombre;
    
    public Gato(int edad, double peso, String nom){
        this.edad = edad;
        this.peso = peso;
        nombre = nom;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double tom){
        peso = tom;  
    }
}
