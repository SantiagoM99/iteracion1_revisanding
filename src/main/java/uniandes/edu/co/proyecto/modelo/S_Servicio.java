package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="serviciosSpa")
public class S_Servicio extends Servicio{
    
    private String nombre;
    private Integer duracion;
    private Integer costo;
    
    @ManyToOne
    @JoinColumn(name="spa",referencedColumnName = "nombre")
    private Spa spa;

    public S_Servicio(){
        ;
    }

    public S_Servicio(String nombre, Integer duracion, Integer costo){
        this.nombre= nombre;
        this.duracion=duracion;
        this.costo=costo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Spa getSpa() {
        return spa;
    }

    public void setSpa(Spa spa) {
        this.spa = spa;
    }

    

     
}
