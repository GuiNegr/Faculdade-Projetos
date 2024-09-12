package com.EstudoSpring.EstudoSpring.repository;

import com.EstudoSpring.EstudoSpring.model.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

    //o optional e tipo um boolean porem com um objeto
    //ele pode ou não retornar um objeto task no momento.
    //tem que haver outro tipo de tratamento ao pegar esse valor.

    //aqui voce só sobreescreve os metodos mais precisos. a propria interface do jpa
    //é inteligente o suficiente para aplicar as consultas padrões
    @Override
    Optional<Task> findById(Long aLong);

    Task findByTarefaNome(String tarefaNome);

}
