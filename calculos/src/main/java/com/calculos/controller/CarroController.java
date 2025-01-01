package com.calculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculos.entity.Carro;
import com.calculos.service.CarroService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping("/save")
       public ResponseEntity<String> save(@RequestBody Carro carro){

       try {
       String mensagem =  this.carroService.save(carro);
        return new ResponseEntity<String>(mensagem, HttpStatus.OK);

       } catch (Exception e) {

        return new ResponseEntity<String>("Deu errado ao salvar!", HttpStatus.BAD_REQUEST);

       }

    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Carro> findById(@PathVariable Long id){

        try {
                Carro carro = this.carroService.findById(id);
                return new ResponseEntity(carro, HttpStatus.OK);
            
        } catch (Exception e) {

            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    


}
