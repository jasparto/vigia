/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oasys.controller;


import com.oasys.dao.GeneralDAO;
import java.io.Serializable;

/**
 *
 * @author juliano
 */
public class GestorGeneral extends Gestor implements Serializable {


    public static String GESTOR_EVALUACION_COD_EVALUACION_SEQ = "gestor.evaluacion_cod_evaluacion_seq";

    public static boolean VALIDA_PK = true;
    public static boolean NO_VALIDA_PK = false;

    public GestorGeneral() throws Exception {
        super();
    }

    public Long nextval(String secuencia) throws Exception {
        try {
            this.abrirConexion();
            return new GeneralDAO(this.conexion).nextval(secuencia);
        } finally {
            this.cerrarConexion();
        }
    }

    public int siguienteCodigoEntidad(String campo, String entidad) throws Exception {
        try {
            this.abrirConexion();
            GeneralDAO generalDAO = new GeneralDAO(this.conexion);
            return generalDAO.siguienteCodigoEntidad(campo, entidad);
        } finally {
            this.cerrarConexion();
        }
    }


}
