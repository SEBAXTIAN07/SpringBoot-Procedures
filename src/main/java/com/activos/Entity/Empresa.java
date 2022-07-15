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
    private String TDC_TD;
    private Integer EMP_ND;
    private Integer EMP_DV;
    private String EMP_NOMBRE;
    private String ATE_CODIGO;




    public Empresa() {
    }

    public String getTDC_TD() {
        return TDC_TD;
    }

    public void setTDC_TD(String TDC_TD) {
        this.TDC_TD = TDC_TD;
    }

    public Integer getEMP_ND() {
        return EMP_ND;
    }

    public void setEMP_ND(Integer EMP_ND) {
        this.EMP_ND = EMP_ND;
    }

    public Integer getEMP_DV() {
        return EMP_DV;
    }

    public void setEMP_DV(Integer EMP_DV) {
        this.EMP_DV = EMP_DV;
    }

    public String getEMP_NOMBRE() {
        return EMP_NOMBRE;
    }

    public void setEMP_NOMBRE(String EMP_NOMBRE) {
        this.EMP_NOMBRE = EMP_NOMBRE;
    }

    public String getATE_CODIGO() {
        return ATE_CODIGO;
    }

    public void setATE_CODIGO(String ATE_CODIGO) {
        this.ATE_CODIGO = ATE_CODIGO;
    }
}
