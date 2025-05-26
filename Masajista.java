public class Masajista extends Deportes {

public String titulacion;
public int aniosExperiencia;
public Masajista() {
    // Constructor por defecto
}

public Masajista(String titulacion, int aniosExperiencia) {
    this.titulacion = titulacion;
    this.aniosExperiencia = aniosExperiencia;
}
public String getTitulacion() {
    return titulacion;
}
public void setTitulacion(String titulacion) {
    this.titulacion = titulacion;
}
public int getAniosExperiencia() {
    return aniosExperiencia;
}
public void setAniosExperiencia(int aniosExperiencia) {
    this.aniosExperiencia = aniosExperiencia;
}
public void darMasaje() {
    System.out.println("El masajista está dando un masaje.");
}
@Override
public void concentrase() {
    System.out.println("El masajista está concentrado.");
}
@Override
public void viajar() {
    System.out.println("El masajista está viajando.");
}
}
