package com.activos.Repository;

import com.activos.Entity.Empresa;
import com.activos.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReferenciaLaboralRepository extends JpaRepository<Empresa, Long> {

    //@Query(value = "Select tdc_td,emp_nd from empresa where emp_nd = 891900280", nativeQuery = true)
    @Procedure(name = "Car.getTotalCardsbyModelEntity")
    Persona listaProcedure();

    @Query(value = "SELECT a.cto_numero ID,\n"
            + "FB_EPL_NOMBRES('CC',:CEDULA) NOMBRE, \n"
            + "        DECODE(ECT_SIGLA,'ACT','ACTIVO','RET','RETIRADO','PRL','RELIQUIDACION','PRE','PREACTIVO','INA','INACTIVO',ECT_SIGLA)  ESTADO_CONTRATO,\n"
            + "        TO_CHAR(CTO_FECING,'DD/MM/YYYY') FECHA_DE_INICIO,\n"
            + "        DECODE(ECT_SIGLA,'ACT','ACTUALMENTE LABORANDO','RET',NVL(TO_CHAR(CTO_FECRET,'DD/MM/YYYY'),'SIN FECHA DE RETIRO'),'PRL','EN PROCESO DE LIQUIDACION DE PRESTACIONES SOCUALES ','PRE','NUNCA LABORO','INA','NUNCA LABORO',NULL) FECHA_FINAL,\n"
            + "        FB_CARGO(CNO_CODIGO) CARGO,\n"
            + "        to_char(fb_sueldo(tdc_td,emp_nd,cto_numero,'M',SYSDATE),'$999,999,999') SALARIO,\n"
            + "a.* FROM CONTRATO A, CTODURACION B\n"
            + "             WHERE A.CTD_CODIGO = B.CTD_CODIGO              \n"
            + "               AND  CTO_NUMERO = :CODIGO --LO DIGITA EL  USUARIO\n"
            + "               AND EPL_ND = :CEDULA --LO DIGITA EL USUARIO\n"
            + "                ", nativeQuery = true)
    List<Empresa> V_CCONSULTA(@Param("CEDULA") String CEDULA, @Param("CODIGO") String CODIGO );

}
