package pe.com.rapidosyfuriosos.service;

import pe.com.rapidosyfuriosos.entity.EmpleadoEntity;
import java.util.List;

public interface IEmpleadoService {
    List<EmpleadoEntity> findAll();
    List<EmpleadoEntity> findAllCustom();
    EmpleadoEntity findById(Long id);
    EmpleadoEntity add(EmpleadoEntity obj);
    EmpleadoEntity update(EmpleadoEntity obj, Long id);
    EmpleadoEntity delete(Long id);
    EmpleadoEntity enable(Long id);
}