package com.calculos.service;

import org.springframework.stereotype.Service;

import com.calculos.controller.Resultado;
import com.calculos.entity.Entrada;

@Service
public class CalculosService {
    
    public Resultado somar(Entrada entrada) {

        Resultado resultado = new Resultado();
        Integer soma = 0;

        if(entrada.getLista() != null){
            for(int i = 0; i < entrada.getLista().size(); i++){
                soma = soma + entrada.getLista().get(i);
            }
        }
        resultado.setSoma(soma);
        Double media = (double) (soma/entrada.getLista().size());
        resultado.setMedia(media);
        return resultado;
    }




}
