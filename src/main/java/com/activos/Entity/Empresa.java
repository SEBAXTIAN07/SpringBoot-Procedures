package com.activos.Entity;

import javax.persistence.*;
import java.awt.*;

@Entity
@NamedStoredProcedureQuery(name = "Car.getTotalCardsbyModelEntity",
        procedureName = "RHU.QB_JRHU0049_CRUD.PL_OBTENER_EMPRESA", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "EMPRESA", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "VCMENSAJE_PROCESO", type = String.class)

})
public class Empresa {

    @Id
    private String ID;
    
    private String NOMBRE;
    private String ESTADO_CONTRATO;
    private String FECHA_DE_INICIO;
    private String FECHA_FINAL;
    private String CARGO;
    private String SALARIO;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getESTADO_CONTRATO() {
        return ESTADO_CONTRATO;
    }

    public void setESTADO_CONTRATO(String ESTADO_CONTRATO) {
        this.ESTADO_CONTRATO = ESTADO_CONTRATO;
    }

    public String getFECHA_DE_INICIO() {
        return FECHA_DE_INICIO;
    }

    public void setFECHA_DE_INICIO(String FECHA_DE_INICIO) {
        this.FECHA_DE_INICIO = FECHA_DE_INICIO;
    }

    public String getFECHA_FINAL() {
        return FECHA_FINAL;
    }

    public void setFECHA_FINAL(String FECHA_FINAL) {
        this.FECHA_FINAL = FECHA_FINAL;
    }

    public String getCARGO() {
        return CARGO;
    }

    public void setCARGO(String CARGO) {
        this.CARGO = CARGO;
    }

    public String getSALARIO() {
        return SALARIO;
    }

    public void setSALARIO(String SALARIO) {
        this.SALARIO = SALARIO;
    }

    public Empresa() {
    }
}