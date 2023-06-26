public class BombaAgua{
    private int cantAguaTrans;//litros
    private Turril turrilConectado;
    private TanqueAgua tanqueConectado;
    public BombaAgua(int cantAguaTrans){
        this.cantAguaTrans=cantAguaTrans;
    }
    public BombaAgua(){
        cantAguaTrans=7;
    }
    public void Bombear(){
        int cantAguaTurril=turrilConectado.getCantAgua();
        cantAguaTurril=cantAguaTurril-cantAguaTrans;
        turrilConectado.serCantAgua(cantAguaTurril);
        
        int cantAguaTanque=tanqueConectado.getCantAgua();
        cantAguaTanque=cantAguaTanque+cantAguaTrans;
        tanqueConectado.serCantAgua(cantAguaTanque);
        
    }
    public int cantVecesBombear(){
        int res=210/cantAguaTrans;
        return res;
    }
    public void conectarTurril(Turril turril){
        turrilConectado=turril;
    }
    public void conectarTanque(TanqueAgua tanque){
        tanqueConectado=tanque;
    }
}