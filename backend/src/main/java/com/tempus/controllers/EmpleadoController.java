package com.tempus.controllers;

import com.tempus.models.Empleado;
import com.tempus.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin(origins = "*") // Permite que React se conecte
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository repository;

    // GET: Para ver la lista en React
    @GetMapping
    public List<Empleado> listarTodos() {
        return repository.findAll();
    }

    // POST: Para registrar desde Postman
    @PostMapping
    public Empleado registrar(@RequestBody Empleado empleado) {
        return repository.save(empleado);
    }
}