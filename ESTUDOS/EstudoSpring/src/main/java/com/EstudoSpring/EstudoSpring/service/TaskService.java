package com.EstudoSpring.EstudoSpring.service;

import com.EstudoSpring.EstudoSpring.model.Task;
import com.EstudoSpring.EstudoSpring.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

// O SERVICE ELE FICA OCUPADO COM AS REGRAS DE NEGOCIO E OS PEDIDOS DE ACESSOS QUE O CONTROLLER
//FAZ PARA O CONTROLE DE REQUISIÇÕES DO BANCO DE DADOS

@AllArgsConstructor
@NoArgsConstructor
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public Task buscarPeloIdTarefa(Long id){
         Optional<Task> task = this.taskRepository.findById(id);
         return task.orElseThrow(() -> new RuntimeException(
                 "TASK NÃO ENCONTRADA OU INDISPONIVEL: "
         ));
    }

    //save é tanto para update como para create
    @Transactional
    public Task criarTarefa(Task task){
        task.setIdTarefa(null);
        task = this.taskRepository.save(task);
        return task;
    }

    @Transactional
    public Task atualizacaoStatus(Task task){
        Task taskBd = buscarPeloIdTarefa(task.getIdTarefa());
        taskBd.setStatusTarefa(task.getStatusTarefa());
        return this.taskRepository.save(taskBd);
    }

    @Transactional
    public Task atualizar(Task task){
        Task taskBd = buscarPeloIdTarefa(task.getIdTarefa());
        taskBd.setStatusTarefa(task.getStatusTarefa());
        taskBd.setTarefaDescricao(task.getTarefaDescricao());
        taskBd.setTarefaNome(task.getTarefaNome());
        return this.taskRepository.save(taskBd);
    }

    public void delete(Long id){
        buscarPeloIdTarefa(id);
        try {
            this.taskRepository.deleteById(id);
        }catch (RuntimeException e){
            throw new RuntimeException("Não é possivel excluir");
        }
    }
}
