/**
 * Programmer: Eddy Valverde Garro
 * Version - 1.0
 * Last Modification: 14/08/17 19:00;
 */
package LogicaDeNegocio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author edva5
 */
public class Administrador extends Persona{    
    public Administrador() {        
        super();
    }
    public Administrador(String cedula_o_passaporte, String nombre, String Apellido1, String Apellido2, String telefono, String email, String clave, Date fecaNacimiento) {
        super(cedula_o_passaporte, nombre, Apellido1, Apellido2, telefono, email, clave, fecaNacimiento);
    }
}