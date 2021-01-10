package com.mycompany.finalproyect.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Estudiante.class)
public abstract class Estudiante_ {

	public static volatile SingularAttribute<Estudiante, Date> fechaIngreso;
	public static volatile SingularAttribute<Estudiante, String> apellidoEstudiante;
	public static volatile SetAttribute<Estudiante, Pago> pagoSet;
	public static volatile SetAttribute<Estudiante, Curso> cursoSet;
	public static volatile SingularAttribute<Estudiante, String> nombreEstudiante;
	public static volatile SingularAttribute<Estudiante, Integer> noCarnet;
	public static volatile SingularAttribute<Estudiante, String> emailEstudiante;
	public static volatile SingularAttribute<Estudiante, Estado> estadoEstudiante;
	public static volatile SingularAttribute<Estudiante, Integer> telefonoEstudiante;

	public static final String FECHA_INGRESO = "fechaIngreso";
	public static final String APELLIDO_ESTUDIANTE = "apellidoEstudiante";
	public static final String PAGO_SET = "pagoSet";
	public static final String CURSO_SET = "cursoSet";
	public static final String NOMBRE_ESTUDIANTE = "nombreEstudiante";
	public static final String NO_CARNET = "noCarnet";
	public static final String EMAIL_ESTUDIANTE = "emailEstudiante";
	public static final String ESTADO_ESTUDIANTE = "estadoEstudiante";
	public static final String TELEFONO_ESTUDIANTE = "telefonoEstudiante";

}

