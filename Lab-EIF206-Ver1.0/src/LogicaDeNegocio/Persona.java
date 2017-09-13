/**
 * Programmer: Eddy Valverde Garro
 * Version - 1.0
 * Last Modification: 14/08/17 19:00;
 */
package LogicaDeNegocio;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author edva5
 */
public abstract class Persona {
        protected String cedula_o_passaporte;//using protected attributes can be accessed directly by sons, otherwise, just by gets and sets
    protected String nombre;
    private String Apellido1;
    private String Apellido2;
    protected String telefono;
    protected String email;
    protected String clave;
    private Date fechaNacimiento;
    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the Apellido1
     */
    public String getApellido1() {
        return Apellido1;
    }

    /**
     * @param Apellido1 the Apellido1 to set
     */
    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    /**
     * @return the Apellido2
     */
    public String getApellido2() {
        return Apellido2;
    }

    /**
     * @param Apellido2 the Apellido2 to set
     */
    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }


    public Persona() {
    }

    public Persona(String cedula_o_passaporte, String nombre, String Apellido1, String Apellido2, String telefono, String email, String clave, Date fecaNacimiento) {
        this.cedula_o_passaporte = cedula_o_passaporte;
        this.nombre = nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.telefono = telefono;
        this.email = email;
        this.clave = clave;
        this.fechaNacimiento = fecaNacimiento;
    }

    

    /**
     * @return the cedula_o_passaporte
     */
    public String getCedula_o_passaporte() {
        return cedula_o_passaporte;
    }

    /**
     * @param cedula_o_passaporte the cedula_o_passaporte to set
     */
    public void setCedula_o_passaporte(String cedula_o_passaporte) {
        this.cedula_o_passaporte = cedula_o_passaporte;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     *
     */
    public String toString(){        
        return cedula_o_passaporte+" "+nombre+" "+telefono+" "+email;
    }
    public Vector<String> toVectorOfString(){        
        Vector<String> aux = new Vector<>();
        aux.add(cedula_o_passaporte);
        aux.add(nombre);
        aux.add(telefono);
        aux.add(email);
        aux.add(clave);
       return aux;
    }
}