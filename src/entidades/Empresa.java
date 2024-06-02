
package entidades;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Empresa {
    
    private String contra;
    private String nombre;
    private String correo;

    public Empresa(String contra, String nombre, String correo) {
        this.contra = contra;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Empresa\nContraseña: " + contra + "\nNombre: " + nombre + "\nCorreo: " + correo ;
    }
    
    
    
}
