package uniquindio.edu.co.model;

import java.time.LocalDateTime;

public abstract class Vehiculo {
    private String placa, nombreConductor;
    private int identificacionConductor;
    private LocalDateTime horaDeIngreso; // falta saber que tipo de dato usar por que toca despues calcular en base a eso (Si pero con LocalDate, pues no va  a hacer un tipo de dato primitivo, por lo que en realidad seria una clase)
    private  LocalDateTime horaSalida;
    private int tipoVehiculo;
    private int espacioAsignado;
    private boolean estaElVehiculo;


        public Vehiculo (String placa, String nombreConductor,int identificacionConductor , int tipoVehiculo,int espacioAsignado)  {
                    this.horaDeIngreso = LocalDateTime.now();
                    this.horaSalida = null; //Hora de Salida puede ser NULL whateveruwant aunque se supone que lo estamos trabajando con un boolean o sea TRUE OR FALSE, por eso lo puse null
                     this.placa = placa;
                    this.nombreConductor = nombreConductor;
                    this.identificacionConductor=identificacionConductor; 
                    this.tipoVehiculo = tipoVehiculo;
                    this.espacioAsignado = espacioAsignado;
                    this.estaElVehiculo = true;
                    }

                
                
                public String getPlaca() {
            return placa;
        }



        public void setPlaca(String placa) {
            this.placa = placa;
        }



        public String getNombreConductor() {
            return nombreConductor;
        }



        public void setNombreConductor(String nombreConductor) {
            this.nombreConductor = nombreConductor;
        }



        public int getIdentificacionConductor() {
            return identificacionConductor;
        }



        public void setIdentificacionConductor(int identificacionConductor) {
            this.identificacionConductor = identificacionConductor;
        }



        public LocalDateTime getHoraDeIngreso() {
            return horaDeIngreso;
        }



        public void setHoraDeIngreso(LocalDateTime horaDeIngreso) {
            this.horaDeIngreso = horaDeIngreso;
        }



        public LocalDateTime getHoraSalida() {
            return horaSalida;
        }



        public void setHoraSalida(LocalDateTime horaSalida) {
            this.horaSalida = horaSalida;
        }



        public int getTipoVehiculo() {
            return tipoVehiculo;
        }



        public void setTipoVehiculo(int tipoVehiculo) {
            this.tipoVehiculo = tipoVehiculo;
        }



        public int getEspacioAsignado() {
            return espacioAsignado;
        }



        public void setEspacioAsignado(int espacioAsignado) {
            this.espacioAsignado = espacioAsignado;
        }



        public boolean isEstaElVehiculo() {
            return estaElVehiculo;
        }



        public void setEstaElVehiculo(boolean estaElVehiculo) {
            this.estaElVehiculo = estaElVehiculo;
        }



                public void registrarSalida(){
                    this.horaSalida = LocalDateTime.now();
                    this.estaElVehiculo = false;
                }
                

    
    /** metodos abastractos
     * calcular tarifa
     * y mas
     */

    /** metodos
     *
     */

}
