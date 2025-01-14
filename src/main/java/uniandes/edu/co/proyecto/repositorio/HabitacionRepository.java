package uniandes.edu.co.proyecto.repositorio;

import uniandes.edu.co.proyecto.modelo.Habitacion;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;


public interface HabitacionRepository extends JpaRepository<Habitacion, Integer>{
    @Query(value = "SELECT * FROM habitaciones", nativeQuery = true)
    Collection<Habitacion> darHabitaciones();

    @Query(value = "SELECT * FROM habitaciones WHERE idHabitacion = :idHabitacion", nativeQuery = true)
    Habitacion darHabitacion(@Param("idHabitacion") int idHabitacion);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO habitaciones (idHabitacion, capacidad, disponible, tipo, dotacion, precioNoche,nombreHotel) VALUES (parranderos_sequence.nextval, :capacidad, :disponible, :tipo, :dotacion, :precioNoche, :nombreHotel)", nativeQuery = true)
    void insertarHabitacion(@Param("capacidad") int capacidad, @Param("disponible") Boolean disponible, @Param("tipo") String tipo, @Param("dotacion") String dotacion, @Param("precioNoche") int precioNoche, @Param("nombreHotel") String nombreHotel);

    @Modifying
    @Transactional
    @Query(value = "UPDATE habitaciones SET capacidad = :capacidad, disponible = :disponible, tipo = :tipo, dotacion = :dotacion, precioNoche = :precioNoche, nombreHotel = :nombreHotel WHERE idHabitacion = :idHabitacion", nativeQuery = true)
    void actualizarHabitacion(@Param("idHabitacion") int idHabitacion, @Param("capacidad") int capacidad, @Param("disponible") Boolean disponible, @Param("tipo") String tipo, @Param("dotacion") String dotacion, @Param("precioNoche") int precioNoche, @Param("nombreHotel") String nombreHotel);
    
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM habitaciones WHERE idHabitacion = :idHabitacion", nativeQuery = true)
    void eliminarHabitacion(@Param("idHabitacion") int idHabitacion);
    
}
