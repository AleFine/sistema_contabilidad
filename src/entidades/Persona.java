
package entidades;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Persona {
    private int name;
    private int lastname;
       public Persona(int name, int lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", lastname=" + lastname + '}';
    }
       

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getLastname() {
        return lastname;
    }

    public void setLastname(int lastname) {
        this.lastname = lastname;
    }

 
    
    
}
