package com.mycompany.finalproyect.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Profesor.class)
public abstract class Profesor_ {

	public static volatile SingularAttribute<Profesor, String> emailProfesor;
	public static volatile SingularAttribute<Profesor, Curso> curso;
	public static volatile SetAttribute<Profesor, Pago> pagoSet;
	public static volatile SingularAttribute<Profesor, String> nombreProfesor;
	public static volatile SingularAttribute<Profesor, String> apellidoProfesor;
	public static volatile SingularAttribute<Profesor, Estado> estadoProfesor;
	public static volatile SingularAttribute<Profesor, Integer> dpi;
	public static volatile SingularAttribute<Profesor, Integer> telefonoProfesor;

	public static final String EMAIL_PROFESOR = "emailProfesor";
	public static final String CURSO = "curso";
	public static final String PAGO_SET = "pagoSet";
	public static final String NOMBRE_PROFESOR = "nombreProfesor";
	public static final String APELLIDO_PROFESOR = "apellidoProfesor";
	public static final String ESTADO_PROFESOR = "estadoProfesor";
	public static final String DPI = "dpi";
	public static final String TELEFONO_PROFESOR = "telefonoProfesor";

}

