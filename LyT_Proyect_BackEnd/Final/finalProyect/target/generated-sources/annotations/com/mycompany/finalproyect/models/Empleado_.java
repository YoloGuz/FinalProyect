package com.mycompany.finalproyect.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Empleado.class)
public abstract class Empleado_ {

	public static volatile SingularAttribute<Empleado, String> passwordEmpleado;
	public static volatile SingularAttribute<Empleado, Integer> codigoEmpleado;
	public static volatile SingularAttribute<Empleado, Estado> estadoEmpleado;
	public static volatile SingularAttribute<Empleado, String> correoEmpleado;
	public static volatile SingularAttribute<Empleado, String> nombreEmpleado;
	public static volatile SingularAttribute<Empleado, String> usuarioEmpleado;
	public static volatile SingularAttribute<Empleado, String> telefonoEmpleado;

	public static final String PASSWORD_EMPLEADO = "passwordEmpleado";
	public static final String CODIGO_EMPLEADO = "codigoEmpleado";
	public static final String ESTADO_EMPLEADO = "estadoEmpleado";
	public static final String CORREO_EMPLEADO = "correoEmpleado";
	public static final String NOMBRE_EMPLEADO = "nombreEmpleado";
	public static final String USUARIO_EMPLEADO = "usuarioEmpleado";
	public static final String TELEFONO_EMPLEADO = "telefonoEmpleado";

}

