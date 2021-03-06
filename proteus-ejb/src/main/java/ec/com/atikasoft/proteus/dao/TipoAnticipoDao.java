/*
 *  TipoAnticipoDao.java
 *  PROTEUS V 2.0 $Revision 1.0 $
 *
 *  Todos los derechos reservados. All rights reserved.
 *  This software is the confidential and proprietary information of AtikaSoft
 *  ("Confidential Information").  You shall not disclose such Confidential Information
 *  and shall use it only in accordance with the terms of the license agreement you entered into
 *  with AtikaSoft.
 *
 *
 *  AtikaSoft
 *  Quito - Ecuador
 *  http://www.atikasoft.com.ec/
 *
 *  02/12/2013
 *
 *  Copyright (C) 2013 AtikaSoft.
 */
package ec.com.atikasoft.proteus.dao;

import ec.com.atikasoft.proteus.excepciones.DaoException;
import ec.com.atikasoft.proteus.generico.GenericDAO;
import ec.com.atikasoft.proteus.modelo.TipoAnticipo;
import ec.com.atikasoft.proteus.util.UtilCadena;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Liliana Rodriguez <liliana.rodriguez@markasoft.ec>
 */
@LocalBean
@Stateless
public class TipoAnticipoDao extends GenericDAO<TipoAnticipo, Long> {

    /**
     * Logger de clases.
     */
    private static final Logger LOG = Logger.getLogger(TipoAnticipoDao.class.getCanonicalName());

    /**
     * Constructor sin argumentos.
     */
    public TipoAnticipoDao() {
        super(TipoAnticipo.class);
    }

    /**
     * Este metodo procesa la busqueda de todo por nombre.
     *
     * @param nombre String
     * @return List
     * @throws DaoException DaoException
     */
    public List<TipoAnticipo> buscarTodosPorNombre(final String nombre) throws DaoException {
        try {
            return buscarPorConsultaNombrada(TipoAnticipo.BUSCAR_POR_NOMBRE, UtilCadena.concatenar("%", nombre,
                    "%"));
        } catch (DaoException ex) {
            Logger.getLogger(TipoAnticipoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException(ex);
        }
    }
    
    /**
     * Este metodo procesa la busqueda de todo por codigo.
     *
     * @param codigo String
     * @return List de registros de TipoAnticipos
     * @throws DaoException DaoException
     */
    public List<TipoAnticipo> buscarTodosPorCodigo(final String codigo) throws DaoException {
        try {
            return buscarPorConsultaNombrada(TipoAnticipo.BUSCAR_POR_CODIGO, codigo);
        } catch (DaoException ex) {
            Logger.getLogger(TipoAnticipoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException(ex);
        }
    }

    /**
     * Metodo que se encarga de buscar un listado de TipoAnticipo que esten vigentes true.
     *
     * @return Listado TipoAnticipo
     * @throws DaoException En caso de error
     */
    public List<TipoAnticipo> buscarVigente() throws DaoException {
        try {
            return buscarPorConsultaNombrada(TipoAnticipo.BUSCAR_VIGENTES);
        } catch (DaoException ex) {
            Logger.getLogger(TipoAnticipoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException(ex);
        }
    }
        /**
     * Metodo que se encarga de buscar un listado de TipoAnticipo que esten vigentes true de un regimen laboral.
     * @param idRegimenLaboral Long id del regimen laboral
     * @return Listado TipoAnticipo
     * @throws DaoException En caso de error
     */
    public List<TipoAnticipo> buscarPorRegimenLaboral(final Long idRegimenLaboral) throws DaoException {
        try {
            return buscarPorConsultaNombrada(TipoAnticipo.BUSCAR_POR_REGIMEN, idRegimenLaboral);
        } catch (DaoException ex) {
            Logger.getLogger(TipoAnticipoDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new DaoException(ex);
        }
    }
}