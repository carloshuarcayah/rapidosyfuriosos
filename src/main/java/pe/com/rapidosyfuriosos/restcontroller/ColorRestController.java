package pe.com.rapidosyfuriosos.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.rapidosyfuriosos.entity.ColorEntity;
import pe.com.rapidosyfuriosos.service.IColorService;

import java.util.List;

@RestController
@RequestMapping("/color")
public class ColorRestController {

    @Autowired
    private IColorService servicio;

    @GetMapping
    public List<ColorEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<ColorEntity> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public ColorEntity findById(@PathVariable Long id){
        return servicio.findById(id);
    }

    @PostMapping
    public ColorEntity add(@RequestBody ColorEntity obj){
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public ColorEntity update(@RequestBody ColorEntity obj, @PathVariable Long id){
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public ColorEntity delete(@PathVariable Long id){
        return servicio.delete(id);
    }

    @PutMapping("/enable/{id}")
    public ColorEntity enable(@PathVariable Long id){
        return servicio.enable(id);
    }
}