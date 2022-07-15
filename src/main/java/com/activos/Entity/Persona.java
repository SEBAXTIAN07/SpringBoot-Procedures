package com.activos.Entity;

import javax.persistence.*;


@Entity
@NamedStoredProcedureQuery(name = "obtenerEmpresa",
        procedureName = "RHU.QB_JRHU0049_CRUD.PL_OBTENER_EMPRESA", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "EMPRESA", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "VCMENSAJE_PROCESO", type = String.class)

})
public class Persona {
    @Id
    private String TDC_TD;
    private String EMP_ND;

    public Persona(String TDC_TD, String EMP_ND) {
        this.TDC_TD = TDC_TD;
        this.EMP_ND = EMP_ND;
    }

    public Persona() {
    }

    public String getNombre() {
        return TDC_TD;
    }

    public void setNombre(String TDC_TD) {
        this.TDC_TD = TDC_TD;
    }

    public String getId() {
        return EMP_ND;
    }

    public void setId(String EMP_ND) {
        this.EMP_ND = EMP_ND;
    }
}
