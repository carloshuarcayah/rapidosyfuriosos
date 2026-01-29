package pe.com.rapidosyfuriosos.service;

import pe.com.rapidosyfuriosos.entity.MarcaEntity;
import java.util.List;

public interface IMarcaService {
    List<MarcaEntity> findAll();
    List<MarcaEntity> findAllCustom();
    MarcaEntity findById(Long id);
    MarcaEntity add(MarcaEntity obj);
    MarcaEntity update(MarcaEntity obj, Long id);
    MarcaEntity delete(Long id);
    MarcaEntity enable(Long id);
}
