package br.org.generation.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.blogPessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	public List <Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	
	public Optional <Tema> findByDescricaoContainingIgnoreCase (String descricao);
	
	 public Tema findByDescricao(String descricao);

}
