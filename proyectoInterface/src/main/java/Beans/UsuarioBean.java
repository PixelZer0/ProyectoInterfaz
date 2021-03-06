package Beans;

import com.google.gson.annotations.Expose;

/**
 *
 * @author Julián
 */
public class UsuarioBean {

    // VARIABLES
    @Expose
    private Integer id;
    @Expose
    private String dni;
    @Expose
    private String nombre;
    @Expose
    private String primer_apellido;
    @Expose
    private String segundo_apellido;
    @Expose
    private String login;
    @Expose(serialize = false)
    private String pass;
    @Expose
    private String email;
    @Expose(serialize = false)
    private Integer id_tipousuario = 0;
    @Expose(deserialize = false)
    private TipoUsuarioBean obj_tipousuario = null;

    // CONSTRUCTORES
    public UsuarioBean(Integer id) {
        this.id = id;
    }

    public UsuarioBean() {
    }

    // MÉTODOS FUNCIONALES
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId_tipousuario() {
        return id_tipousuario;
    }

    public void setId_tipousuario(Integer id_tipousuario) {
        this.id_tipousuario = id_tipousuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public TipoUsuarioBean getObj_tipousuario() {
        return obj_tipousuario;
    }

    public void setObj_tipousuario(TipoUsuarioBean obj_tipousuario) {
        this.obj_tipousuario = obj_tipousuario;
    }

}
