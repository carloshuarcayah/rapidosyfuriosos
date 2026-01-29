package pe.com.rapidosyfuriosos.service;

import pe.com.rapidosyfuriosos.entity.TipoDocumentoEntity;

import java.util.List;

public interface ITipoDocumentoService {
    List<TipoDocumentoEntity> findAll();
    List<TipoDocumentoEntity> findAllCustom();
    TipoDocumentoEntity findById(Long id);
    TipoDocumentoEntity add(TipoDocumentoEntity obj);
    TipoDocumentoEntity update(TipoDocumentoEntity obj, Long id);
    TipoDocumentoEntity delete(Long id);
    TipoDocumentoEntity enable(Long id);
}
