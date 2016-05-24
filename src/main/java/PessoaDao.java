
import java.io.Serializable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciana
 */
@Stateless
public class PessoaDao {

    @PersistenceContext(unitName = "pos-atividade")
    private EntityManager em;

    public PessoaDao() {
    }
    
    
    public boolean salvar(Pessoa pessoa){
        em.persist(pessoa);
        return true;
    }
    
    
    public boolean excluir(Pessoa pessoa){
        em.remove(pessoa);
        return true;
    }
}

