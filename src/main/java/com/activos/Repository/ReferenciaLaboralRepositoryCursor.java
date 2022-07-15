package com.activos.Repository;

import com.activos.Entity.Empresa;
import com.activos.Entity.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReferenciaLaboralRepositoryCursor extends CrudRepository<Persona, String> {
    @Procedure(name = "obtenerEmpresa")
    List<Empresa> V_CCONSULTA(@Param("EMPRESA") String myParamIn
    );

    @Procedure(name = "obtenerEmpresa")
    Persona findCarsAfterYear(@Param("EMPRESA") String EMPRESA);
}
