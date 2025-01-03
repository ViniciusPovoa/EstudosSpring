package app.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.app.entity.Carro;
import app.app.repository.CarroRepository;

@Service
public class CarroService {
    
    @Autowired
    private CarroRepository carroRepository;


 public String save(Carro carro){
    this.carroRepository.save(carro);
    return "Carro salvo com sucesso";
 }

 public String update(Carro carro, long id){
    carro.setId(id);
    this.carroRepository.save(carro);
    return "Carro atualizado.";
 }

 public String delete (long id){
    this.carroRepository.deleteById(id);
    return "Carro deletado.";
 }

 public List<Carro> findAll(){
    List<Carro> lista = this.carroRepository.findAll();
    return lista;
 }

 public Carro findById(long id){
    Carro carro = this.carroRepository.findById(id).get();
    return carro;
 }


}
