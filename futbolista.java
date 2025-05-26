public class  futbolista extends Deportes{

private int dorsal;
private String demarcacion;

public futbolista() {
    // Constructor por defecto
}
public futbolista(int dorsal, String demarcacion) {
    this.dorsal = dorsal;
    this.demarcacion = demarcacion;
}
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    public void jugarpartido () {
        System.out.println("El futbolista está jugando.");
    }
    public void entrenar() {
        System.out.println("El futbolista está entrenando.");
    }
    @Override
    public void concentrase() {
        System.out.println("El futbolista está concentrado.");
    }
    @Override
    public void viajar() {
        System.out.println("El futbolista está viajando.");
    }

}


