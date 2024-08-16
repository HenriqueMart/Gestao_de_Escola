
package br.com.ifba.gestaoalunos.entity;

import br.com.ifba.infrastructure.entity.Pessoa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Entity
@Table(name = "alunos")
public class Alunos extends Pessoa{
    private String nomeSocial;
    private char Sexo;
    private String genero;
    
    @Column(unique = true)
    private String rg;
    
    private String orgaoExpedidor;
    private Date dataEmissao;
    
    @Column(unique = true)
    private String tituloEleitor;
    
    private PaisAluno pai;
    private PaisAluno mae;
}
