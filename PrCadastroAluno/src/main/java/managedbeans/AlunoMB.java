package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entidades.Aluno;
//import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class AlunoMB {
	private Aluno Aluno = new Aluno();
	private EntityManagerFactory emf;
	
	public AlunoMB() {
		emf = Persistence.createEntityManagerFactory("PrCadastroAluno");
	}
	
	public void salvar() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(Aluno);
		em.getTransaction().commit();
		em.close();
		Aluno = new Aluno();
	}
@SuppressWarnings("unchecked")
	public List<Aluno> getAlunos() {
		List <Aluno> lista;
		EntityManager em = emf.createEntityManager();
				lista = em.createQuery("Select p from Aluno p").getResultList();
				em.close();
				return lista;
	}

	public Aluno getAluno() {
		return Aluno;
	}

	public void setAluno(Aluno Aluno) {
		this.Aluno = Aluno;
	}

}
