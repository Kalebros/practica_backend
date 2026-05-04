package es.ediae.master.programacion.gestionusuario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ediae.master.programacion.gestionusuario.entity.DireccionEntity;
import es.ediae.master.programacion.gestionusuario.repository.DireccionRepository;
import es.ediae.master.programacion.gestionusuario.service.IDireccionService;

@Service
public class DireccionService implements IDireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public List<DireccionEntity> obtenerTodasLasDirecciones() {
        return direccionRepository.findAll();
    }

    @Override
    public DireccionEntity obtenerDireccionPorId(Integer id) {
        return direccionRepository.findById(id).orElse(null);
    }

    @Override
    public DireccionEntity crearDireccion(DireccionEntity direccion) {
        return direccionRepository.save(direccion);
    }

    @Override
    public DireccionEntity actualizarDireccion(Integer id, DireccionEntity direccion) {
        direccion.setId(id);
        return direccionRepository.save(direccion);
    }

    @Override
    public void eliminarDireccion(Integer id) {
        direccionRepository.deleteById(id);
    }

}
