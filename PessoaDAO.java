package DAO;

import entidades.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PessoaDAO {
    @PersistenceContext(unitName = "CadastroPessoasPU")
    private EntityManager entityManager;

    public void salvar(Pessoa pessoa) {
        entityManager.persist(pessoa);
    }

    public void atualizar(Pessoa pessoa) {
        entityManager.merge(pessoa);
    }

    public void excluir(Pessoa pessoa) {
        pessoa = entityManager.find(Pessoa.class, pessoa.getId());
        entityManager.remove(pessoa);
    }

    public Pessoa buscarPorId(int id) {
        return entityManager.find(Pessoa.class, id);
    }

    public List<Pessoa> listarTodos() {
        return entityManager.createQuery("Selecione p para Pessoa p", Pessoa.class).getResultList();
    }
}