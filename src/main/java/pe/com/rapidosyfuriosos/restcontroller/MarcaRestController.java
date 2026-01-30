package pe.com.rapidosyfuriosos.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.rapidosyfuriosos.entity.MarcaEntity;
import pe.com.rapidosyfuriosos.service.IMarcaService;

import java.util.List;

@RestController
@RequestMapping("/marca")
public class MarcaRestController {

    @Autowired
    private IMarcaService servicio;

    @GetMapping
    public List<MarcaEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<MarcaEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public MarcaEntity findById(@PathVariable Long id){
        return servicio.findById(id);
    }

    @PostMapping
    public MarcaEntity add(@RequestBody MarcaEntity obj){
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public MarcaEntity update(@RequestBody MarcaEntity obj, @PathVariable Long id){
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public MarcaEntity delete(@PathVariable Long id){
        return servicio.delete(id);
    }

    @PutMapping("/enable/{id}")
    public MarcaEntity enable(@PathVariable Long id){
        return servicio.enable(id);
    }
}