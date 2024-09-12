package com.EstudoSpring.EstudoSpring.controller;

import com.EstudoSpring.EstudoSpring.model.Task;
import com.EstudoSpring.EstudoSpring.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriBuilder;

import java.net.URI;

@RestController
@RequestMapping("/Task")
@Validated
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping("/{id}")
    public ResponseEntity<Task> buscarPeloId(@PathVariable Long id){
        Task taskNova = this.taskService.buscarPeloIdTarefa(id);
        return ResponseEntity.ok().body(taskNova);
    }

    @PostMapping
    public ResponseEntity<Void> criarTask(@RequestBody Task taskNova){
        this.taskService.criarTarefa(taskNova);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(taskNova.getIdTarefa()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateTask(@ResponseBody Task taskNova, @PathVariable Long id){
        taskNova.setIdTarefa(id);
        this.taskService.atualizar(taskNova);
        return ResponseEntity.noContent().build();

    }
}
