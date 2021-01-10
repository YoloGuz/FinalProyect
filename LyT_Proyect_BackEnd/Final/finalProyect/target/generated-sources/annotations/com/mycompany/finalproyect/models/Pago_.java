package com.mycompany.finalproyect.models;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pago.class)
public abstract class Pago_ {

	public static volatile SingularAttribute<Pago, TipoPago> tipoPagoC;
	public static volatile SetAttribute<Pago, Profesor> profesorSet;
	public static volatile SetAttribute<Pago, Estudiante> estudianteSet;
	public static volatile SingularAttribute<Pago, BigDecimal> cantidad;
	public static volatile SingularAttribute<Pago, Integer> noPago;
	public static volatile SingularAttribute<Pago, Mes> pagoMes;
	public static volatile SingularAttribute<Pago, Date> fechaPago;

	public static final String TIPO_PAGO_C = "tipoPagoC";
	public static final String PROFESOR_SET = "profesorSet";
	public static final String ESTUDIANTE_SET = "estudianteSet";
	public static final String CANTIDAD = "cantidad";
	public static final String NO_PAGO = "noPago";
	public static final String PAGO_MES = "pagoMes";
	public static final String FECHA_PAGO = "fechaPago";

}

