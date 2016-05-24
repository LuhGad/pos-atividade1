
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciana
 */

@Named
@RequestScoped
public class PessoaControlador implements Serializable{
    
    @EJB
    private PessoaService pessoaService;
    
    private Pessoa pessoa;

    public PessoaControlador() {
        this.pessoa = new Pessoa();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public String salvar(){
        pessoaService.salvar(this.pessoa);
        return "sucesso.xhtml";
    }
    
    
    
}
