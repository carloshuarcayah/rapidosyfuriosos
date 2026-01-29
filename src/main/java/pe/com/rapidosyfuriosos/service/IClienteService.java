package pe.com.rapidosyfuriosos.service;

import pe.com.rapidosyfuriosos.entity.ClienteEntity;

import java.util.List;

public interface IClienteService {
    List<ClienteEntity> findAll();
    List<ClienteEntity> findAllCustom();
    ClienteEntity findById(Long id);
    ClienteEntity add(ClienteEntity obj);
    ClienteEntity update(ClienteEntity obj, Long id);
    ClienteEntity delete(Long id);
    ClienteEntity enable(Long id);
}
