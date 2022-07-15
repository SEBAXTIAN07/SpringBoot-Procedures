package com.activos.Service;

import com.activos.Entity.Empresa;
import com.activos.Entity.Persona;
import com.activos.Repository.ReferenciaLaboralRepository;
import com.activos.Repository.ReferenciaLaboralRepositoryCursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReferenciaLaboralService {

    @Autowired
    ReferenciaLaboralRepository referenciaLaboralRepository;

    @Autowired
    ReferenciaLaboralRepositoryCursor referenciaLaboralRepositoryCursor;

    public Persona personas (){
        return referenciaLaboralRepository.listaProcedure();
    }

    public List<Empresa> getById(String id){
        return referenciaLaboralRepository.V_CCONSULTA(id);
    }

    public Persona getByPersona(String id){
        return referenciaLaboralRepositoryCursor.findCarsAfterYear(id);
    }


}
