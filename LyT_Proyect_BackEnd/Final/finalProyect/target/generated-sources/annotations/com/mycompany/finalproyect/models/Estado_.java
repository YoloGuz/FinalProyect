package com.mycompany.finalproyect.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Estado.class)
public abstract class Estado_ {

	public static volatile SingularAttribute<Estado, String> descripcionEstado;
	public static volatile ListAttribute<Estado, Estudiante> listEstudiante;
	public static volatile ListAttribute<Estado, Profesor> listProfesor;
	public static volatile SingularAttribute<Estado, Integer> codigoEstado;
	public static volatile ListAttribute<Estado, Centro> listCentro;
	public static volatile ListAttribute<Estado, Empleado> listEmpleado;

	public static final String DESCRIPCION_ESTADO = "descripcionEstado";
	public static final String LIST_ESTUDIANTE = "listEstudiante";
	public static final String LIST_PROFESOR = "listProfesor";
	public static final String CODIGO_ESTADO = "codigoEstado";
	public static final String LIST_CENTRO = "listCentro";
	public static final String LIST_EMPLEADO = "listEmpleado";

}

