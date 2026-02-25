package pe.com.rapidosyfuriosos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//Lombok--------------------------------------------------------------------
@NoArgsConstructor //metodo constructor sin paremetros
@AllArgsConstructor //metodo constructor con parametros
@Data //genera los GETTERs y SETTERs
@Builder //agrega el patron de diseño BUILDER
//--------------------------------------------------------------------------
//JAKARTA ------------------------------------------------------------------
@Entity(name="DistritoEntity") //define la entidad
@Table(name="distrito") //define la tabla con la cual se va a relacionar
//--------------------------------------------------------------------------
public class DistritoEntity implements Serializable {
    //CODIGO DE LA SERIALIZACION
    private static final long serialVersionUID = 1L;
    @Id//define la clave primaria
    @Column(name="coddis")//define la columna con la cual se relaciona
    @GeneratedValue(strategy = GenerationType.IDENTITY)//es para el autoincremento
    private Long codigo;
    @Column(name="nomdis", length = 50,nullable = false)
    private String nombre;
    @Column(name="estdis",nullable = false)
    private Boolean estado;
}
