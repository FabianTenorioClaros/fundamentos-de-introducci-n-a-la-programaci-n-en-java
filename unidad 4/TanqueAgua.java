public class TanqueAgua{
    private int capacidad,cantAgua; //litros
    
    public TanqueAgua(){
        capacidad=950;
        cantAgua=0;
    }
    public int cantTurrilesNecesarios(){
        int res=capacidad/210;
        return res;
    }public int getCapacidad(){
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