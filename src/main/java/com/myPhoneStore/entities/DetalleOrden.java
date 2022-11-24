package com.myPhoneStore.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "detalles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class DetalleOrden extends Base {

	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
	
	@ManyToOne
	private Orden orden;
	
	@ManyToOne
	private Producto producto;





}
