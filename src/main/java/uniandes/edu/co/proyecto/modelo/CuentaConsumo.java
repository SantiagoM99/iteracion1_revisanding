package uniandes.edu.co.proyecto.modelo;

import java.sql.Time;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;   
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="cuentas_c")
public class CuentaConsumo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idcuenta;
    
    private Boolean estado;
    private Timestamp checkin;
    private Timestamp checkout;

    @OneToOne
    @JoinColumn(name = "idhabitacion", referencedColumnName = "idhabitacion")
    private Habitacion idhabitacion;

    public CuentaConsumo(
        Boolean estado, 
        Timestamp checkin, 
        Timestamp checkout,
        Habitacion idHabitacion
        ) {
        this.estado = estado;
        this.checkin = checkin;
        this.checkout = checkout;
        this.idhabitacion = idHabitacion;
    }

    public CuentaConsumo()
    {;}
    
    public Integer getIdCuenta() {
        return idcuenta;
    }
    public Boolean getEstado() {
        return estado;
    }
    public Timestamp getCheckin() {
        return checkin;
    }
    public Timestamp getCheckout() {
        return checkout;
    }
    public void setId(Integer id) {
        this.idcuenta = id;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public void setCheckin(Timestamp checkin) {
        this.checkin = checkin;
    }
    public void setCheckout(Timestamp checkout) {
        this.checkout = checkout;
    }
    public Habitacion getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdHabitacion(Habitacion idHabitacion) {
        this.idhabitacion = idHabitacion;
    }
}
