public abstract class Deportes {

    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public Deportes() {
        // Constructor por defecto
    }
    public Deportes(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void viajar (); 
    
    public abstract void concentrase ();
    // Método abstracto para obtener información del deporte
}
