
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

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
@Local(PessoaService.class)
public class PessoaServiceImpl implements Serializable, PessoaService{
    @EJB
    private PessoaDao pessoaDao;

    public PessoaServiceImpl() {
    }
    
       
    @Override
    public boolean salvar(Pessoa pessoa) {
    return pessoaDao.salvar(pessoa);
    }

    @Override
    public boolean excluir(Pessoa pessoa) {
        return pessoaDao.excluir(pessoa);
    }
    
}
