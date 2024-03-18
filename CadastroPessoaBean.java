/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import DAO.PessoaDAO;
/**
 *
 * @author Mayara
 */
@Named
@RequestScoped
public class CadastroPessoaBean {
   
    @Inject
private PessoaDAO pessoaDAO;
    
    public void salvarPessoa() {
    pessoaDAO.salvar(pessoa);
   
    pessoa = new Pessoa();
    
}
    
}