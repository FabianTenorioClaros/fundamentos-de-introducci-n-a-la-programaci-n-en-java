public class Turril
{
    private int capacidad;//Litros
    private int cantAgua;//litros
    public Turril(){
        capacidad=210;
        cantAgua=0;
    }
    public void cargarAgua(){
        cantAgua=capacidad;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public int getCantAgua(){
        return cantAgua;
    }
    public void serCapacidad(int nCapacidad){
        capacidad=nCapacidad;
    }
    public void serCantAgua(int nCantAgua){
        cantAgua=nCantAgua;
    }
}