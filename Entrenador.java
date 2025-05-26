public class Entrenador extends Deportes {

private String IdFederacion;
public Entrenador() {
    // Constructor por defecto

}
public Entrenador(String IdFederacion) {
    this.IdFederacion = IdFederacion;
}
public String getIdFederacion() {
    return IdFederacion;
}
public void setIdFederacion(String IdFederacion) {
    this.IdFederacion = IdFederacion;
}
public void dirigirPartido() {
    System.out.println("El entrenador está dirigiendo un partido.");
}
public void dirigirEntrenamiento() {
    System.out.println("El entrenador está dirigiendo un entrenamiento.");
}
@Override
public void concentrase() {
    System.out.println("El entrenador está concentrado.");
}
@Override
public void viajar() {
    System.out.println("El entrenador está viajando.");
}
}