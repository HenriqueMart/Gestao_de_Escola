
package br.com.ifba.gestaoalunos.controller;

import br.com.ifba.gestaoalunos.entity.Alunos;
import java.util.List;

public interface GestaoAlunoIController{
    public abstract Alunos save(Alunos curso) throws RuntimeException;
    public abstract Alunos update(Alunos curso) throws RuntimeException;
    public abstract void delete(Alunos curso) throws RuntimeException;
    public abstract Alunos findById(Long id) throws RuntimeException;
    public List<Alunos> findByNome(String nome) throws RuntimeException;
    public List<Alunos> findAll() throws RuntimeException;
}
