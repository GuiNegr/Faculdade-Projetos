package com.EstudoSpring.EstudoSpring.model;


import jakarta.persistence.*;
import lombok.*;

//add to string,hash,getter,setter tudo
@Getter
@Setter
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TaskListV2")
public class Task {
    @Id
    @Column(name ="id_Tarefa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarefa;

    @Column(name ="tarefa_nome")
    private String tarefaNome;

    @Column(name ="tarefaDescricao")
    private String tarefaDescricao;

    @Column(name ="statusTarefa")
    private String statusTarefa;
}
