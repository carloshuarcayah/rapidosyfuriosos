package pe.com.rapidosyfuriosos.service;

import pe.com.rapidosyfuriosos.entity.VehiculoEntity;
import java.util.List;

public interface IVehiculoService {
    List<VehiculoEntity> findAll();
    List<VehiculoEntity> findAllCustom();
    VehiculoEntity findById(Long id);
    VehiculoEntity add(VehiculoEntity obj);
    VehiculoEntity update(VehiculoEntity obj, Long id);
    VehiculoEntity delete(Long id);
    VehiculoEntity enable(Long id);
}