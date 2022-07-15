package com.activos.Service;

import com.activos.Entity.Empresa;
import com.activos.Entity.Persona;
import com.activos.Entity.Request;
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

    public List<Empresa> getById(Request request){
        return referenciaLaboralRepository.V_CCONSULTA(request.getCedula(),request.getCodigo());
    }

    public Persona getByPersona(String id){
        return referenciaLaboralRepositoryCursor.findCarsAfterYear(id);
    }


}
