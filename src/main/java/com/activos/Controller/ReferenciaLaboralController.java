package com.activos.Controller;

import com.activos.Entity.Empresa;
import com.activos.Entity.Persona;
import com.activos.Entity.Request;
import com.activos.Service.ReferenciaLaboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/ReferenciaLaboral")
public class ReferenciaLaboralController {

    @Autowired
    ReferenciaLaboralService referenciaLaboralService;




    @GetMapping("/Certificado")
    public ResponseEntity<Persona> Persona(){
      Persona persona = referenciaLaboralService.personas();
      return new ResponseEntity(persona, HttpStatus.OK);
    }

    @GetMapping("/Empresa")
    public ResponseEntity<List<Empresa>> getEmpresa(@RequestBody Request request ){
        System.out.println(request);
        List<Empresa> empresa= referenciaLaboralService.getById(request);

        return new ResponseEntity(empresa, HttpStatus.OK);
    }


    @GetMapping("/Persona/{id}")
    public ResponseEntity<Persona> getEmpresav2(@PathVariable("id") String name ){
        System.out.println(name);
        Persona persona= referenciaLaboralService.getByPersona(name);
        System.out.println(persona);
        return new ResponseEntity(persona, HttpStatus.OK);
    }



}
