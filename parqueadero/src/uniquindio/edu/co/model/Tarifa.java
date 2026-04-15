package uniquindio.edu.co.model;

public class Tarifa {
    private double valorHora,descuento;
    private String tipoVehiculo;

    // relaciones

    /**
     *
     * @param valorHora
     * @param descuento
     * @param tipoVehiculo
     */
    public Tarifa(double valorHora, double descuento, String tipoVehiculo){
        this.descuento=descuento;
        this.tipoVehiculo=tipoVehiculo;
        this.valorHora=valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString(){
        return "El tipo de vehiculo "+tipoVehiculo+'\n'+
                "Valor por hora: "+valorHora+'\n'+
                "Descuento si aplica: "+descuento+'\n';
    }
}
