package com.mycompany.hostexpanse2.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Reserva implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idReserva;
    private String cedulaHuesped;
    private Integer numeroPersonas;
    private String nombreHuesped;
    private String apellidoHuesped;
    private String numeroHabitacion;
    private String numeroTelefono;
    private Integer nochePrecio;
    private Integer noches;
    private Integer precioReserva;
    private Integer precioTotal;
    
    public void calcularReserva(){
        this.precioReserva = 40000*this.numeroPersonas;
    }
    
    public void calcularTotal(){
        this.precioTotal = precioReserva + (nochePrecio * noches);
    }
}
