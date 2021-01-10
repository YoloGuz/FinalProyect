package com.mycompany.finalproyect.models;

import java.sql.Time;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HorarioPrimaryK.class)
public abstract class HorarioPrimaryK_ {

	public static volatile SingularAttribute<HorarioPrimaryK, Time> horaEntrada;
	public static volatile SingularAttribute<HorarioPrimaryK, String> dia;
	public static volatile SingularAttribute<HorarioPrimaryK, Time> horaSalida;

	public static final String HORA_ENTRADA = "horaEntrada";
	public static final String DIA = "dia";
	public static final String HORA_SALIDA = "horaSalida";

}

