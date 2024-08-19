
package br.com.ifba.prg03_scedu.usuario.controller;


import br.com.ifba.prg03_scedu.usuario.entity.Usuario;
import java.util.List;

public interface UsuarioIController {
    List<Usuario> findAll();
    Usuario findById(Long id);
    void save(Usuario usuario);
    void update(Usuario usuario);
    void delete(Long id);
    boolean existsByEmail(String email);
}
