package pe.com.rapidosyfuriosos.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.rapidosyfuriosos.entity.ServicioEntity;
import pe.com.rapidosyfuriosos.service.IServicioService;

import java.util.List;

@RestController
@RequestMapping("/servicio")
public class ServicioRestController {

    @Autowired
    private IServicioService servicio;

    @GetMapping
    public List<ServicioEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<ServicioEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public ServicioEntity findById(@PathVariable Long id){
        return servicio.findById(id);
    }

    @PostMapping
    public ServicioEntity add(@RequestBody ServicioEntity obj){
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public ServicioEntity update(@RequestBody ServicioEntity obj, @PathVariable Long id){
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public ServicioEntity delete(@PathVariable Long id){
        return servicio.delete(id);
    }

    @PutMapping("/enable/{id}")
    public ServicioEntity enable(@PathVariable Long id){
        return servicio.enable(id);
    }
}