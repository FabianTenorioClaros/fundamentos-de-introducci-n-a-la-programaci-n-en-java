public class Insomio{
    public int calcularTiempo(){
        int horaDurmio=2;
        int minDurmio=45;
        int horaDesperto=11;
        int minDesperto=25;
        int horaDurmioMin=horaDurmio*60+minDurmio;
        int horaDespertoMin=horaDesperto*60+minDesperto;
        int res=horaDespertoMin-horaDurmioMin;
        return res;
    }
}
