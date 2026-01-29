package pe.com.rapidosyfuriosos.service;

import pe.com.rapidosyfuriosos.entity.ServicioEntity;
import java.util.List;

public interface IServicioService {
    List<ServicioEntity> findAll();
    List<ServicioEntity> findAllCustom();
    ServicioEntity findById(Long id);
    ServicioEntity add(ServicioEntity obj);
    ServicioEntity update(ServicioEntity obj, Long id);
    ServicioEntity delete(Long id);
    ServicioEntity enable(Long id);
}