/*
 *  EstadosTramiteEnum.java
 *  Proteus V 2.0 $Revision 1.0 $
 *
 *  Todos los derechos reservados. All rights reserved.
 *  This software is the confidential and proprietary information of Proteus
 *  ("Confidential Information").  You shall not disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the
 *  license agreement you entered into
 *  with Proteus.
 *
 *  Proteus
 *  Quito - Ecuador
 *  
 *
 *  05/11/2012
 *
 */
package ec.com.atikasoft.proteus.enums;

/**
 * Definicion de los tipo de horarios para licencias / permisos
 *
 * @author Henry Molina <hmolina@atikasoft.com.ec>
 */
public enum TipoHorarioEnum {

    /**
     * Licencia / permiso.
     */
    LICENCIA_PERMISO("L", "LICENCIA / PERMISO"),
    /**
     * Recuperacion.
     */
    RECUPERACION("R", "RECUPERACION");

    /**
     * Columna del campo ordenamiento.
     */
    private String codigo;

    /**
     * Descripcion del campo ordenamiento.
     */
    private String descripcion;

    /**
     * Constructor requerido.
     *
     * @param codigo String
     * @param descripcion String
     */
    private TipoHorarioEnum(final String codigo, final String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }
}
