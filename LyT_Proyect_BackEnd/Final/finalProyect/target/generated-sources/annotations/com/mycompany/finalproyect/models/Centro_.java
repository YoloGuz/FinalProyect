package com.mycompany.finalproyect.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Centro.class)
public abstract class Centro_ {

	public static volatile SingularAttribute<Centro, Integer> idCentro;
	public static volatile SingularAttribute<Centro, Estado> estadoCentro;
	public static volatile SingularAttribute<Centro, String> nombreCentro;
	public static volatile ListAttribute<Centro, Curso> listCentro;

	public static final String ID_CENTRO = "idCentro";
	public static final String ESTADO_CENTRO = "estadoCentro";
	public static final String NOMBRE_CENTRO = "nombreCentro";
	public static final String LIST_CENTRO = "listCentro";

}

