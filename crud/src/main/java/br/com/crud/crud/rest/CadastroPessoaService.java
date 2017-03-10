package br.com.crud.crud.rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless // faz a classe ejb ser controlada pelos cointainers
@Path("CadastroPessoa") //transformas a classe em um webServise rest 
@Produces(MediaType.APPLICATION_JSON)// informa os tipos de dados no webservice
@Consumes(MediaType.APPLICATION_JSON)
public class CadastroPessoaService {

	
	@PersistenceContext
	EntityManager em;
	
	@GET //método que faz a leitura dos dados
	public List<CadastroPessoa> buscarTodos(){
		return em.creatQuery("select cp from CadastroPessoa cp", CadastroPessoa.class).getResultList();
	}
    
	@POST // métodos que cria um registro 
    public CadastroPessoa Criar(CadastroPessoa cadastroPessoa){
    	em.persist(cadastroPessoa);
    	return cadastroPessoa;
    
	}
	 @PUT // método que atualiza um registro
	 public CadastroPessoa Alterar(CadastroPessoa cadastroPessoa){
		 return em.merge(cadastroPessoa);
	 }

	 @DELETE// método que deleta um registro 
	 @Path("/{id}")
	 public void  Deletar(@PathParam("id") Long id){
		CadastroPessoa cp = em.find(CadastroPessoa.class,id);
		em.remove(cp);
		 
	 }
}
