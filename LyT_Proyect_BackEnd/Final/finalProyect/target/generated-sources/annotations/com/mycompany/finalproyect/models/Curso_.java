package com.mycompany.finalproyect.models;

import java.sql.Time;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Curso.class)
public abstract class Curso_ {

	public static volatile SingularAttribute<Curso, String> descripcion;
	public static volatile SingularAttribute<Curso, Centro> centroCurso;
	public static volatile SingularAttribute<Curso, Time> horaEntrada;
	public static volatile SingularAttribute<Curso, String> idCurso;
	public static volatile SetAttribute<Curso, Estudiante> estudianteSet;
	public static volatile SingularAttribute<Curso, Integer> dpi;

	public static final String DESCRIPCION = "descripcion";
	public static final String CENTRO_CURSO = "centroCurso";
	public static final String HORA_ENTRADA = "horaEntrada";
	public static final String ID_CURSO = "idCurso";
	public static final String ESTUDIANTE_SET = "estudianteSet";
	public static final String DPI = "dpi";

}

