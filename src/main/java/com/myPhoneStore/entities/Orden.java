package com.myPhoneStore.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordenes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Orden extends Base {

	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;

	private double total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany(mappedBy = "orden")
	private List<DetalleOrden> detalle;







	

}
