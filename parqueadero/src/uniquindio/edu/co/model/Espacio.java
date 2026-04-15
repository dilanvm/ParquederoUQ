package uniquindio.edu.co.model;

public class Espacio {
    private String codigo, tipoEspacio, estado;
    private Vehiculo vehiculoAsignado;

    //relaciones


    public Espacio(String codigo, String tipoEspacio, String estado, Vehiculo vehiculoAsignado) {
        this.codigo = codigo;
        this.tipoEspacio = tipoEspacio;
        this.estado = estado;
        this.vehiculoAsignado = vehiculoAsignado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoEspacio() {
        return tipoEspacio;
    }

    public void setTipoEspacio(String tipoEspacio) {
        this.tipoEspacio = tipoEspacio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
    }

    @Override
    public String toString() {
        return "Espacio{" +
                "codigo='" + codigo + '\'' +
                ", tipoEspacio='" + tipoEspacio + '\'' +
                ", estado='" + estado + '\'' +
                ", vehiculoAsignado=" + vehiculoAsignado +
                '}';
    }


    // metodos
    public void ocupar (Vehiculo vehiculo){
        this.vehiculoAsignado=vehiculo;
        this.estado="ocupado";
    }
}
