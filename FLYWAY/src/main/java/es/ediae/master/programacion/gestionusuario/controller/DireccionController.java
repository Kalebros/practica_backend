package es.ediae.master.programacion.gestionusuario.controller;

import java.util.List;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ediae.master.programacion.gestionusuario.entity.DireccionEntity;
import es.ediae.master.programacion.gestionusuario.repository.DireccionRepository;
import es.ediae.master.programacion.gestionusuario.service.impl.DireccionService;

@RestController
@RequestMapping("/api/v1")
public class DireccionController {

    @Autowired
    private DireccionService direccionService;

    @GetMapping("/usuario/{usuarioId}/direcciones")
    public List<DireccionEntity> obtenerDireccionesPorUsuario(@PathVariable Integer usuarioId) {
        return direccionService.obtenerDireccionesPorUsuario(usuarioId);
    }

    @GetMapping("/direcciones")
    public List<DireccionEntity> obtenerTodasLasDirecciones() {
        return direccionService.obtenerTodasLasDirecciones();
    }

    @GetMapping("/direcciones/{id}")
    public DireccionEntity obtenerDireccionPorId(@PathVariable Integer id) {
        return direccionService.obtenerDireccionPorId(id);
    }




}
