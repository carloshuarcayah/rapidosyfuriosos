package pe.com.rapidosyfuriosos.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.rapidosyfuriosos.entity.VehiculoEntity;
import pe.com.rapidosyfuriosos.service.VehiculoService;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoRestController {

    @Autowired
    private VehiculoService servicio;

    @GetMapping
    public List<VehiculoEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<VehiculoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public VehiculoEntity findById(@PathVariable Long id){
        return servicio.findById(id);
    }

    @PostMapping
    public VehiculoEntity add(@RequestBody VehiculoEntity obj){
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public VehiculoEntity update(@RequestBody VehiculoEntity obj, @PathVariable Long id){
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public VehiculoEntity delete(@PathVariable Long id){
        return servicio.delete(id);
    }

    @PutMapping("/enable/{id}")
    public VehiculoEntity enable(@PathVariable Long id){
        return servicio.enable(id);
    }
}