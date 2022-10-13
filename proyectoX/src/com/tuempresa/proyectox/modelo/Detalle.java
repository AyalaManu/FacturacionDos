package com.tuempresa.proyectox.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter

public class Detalle {
	int cantidad;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	Producto producto;

}
