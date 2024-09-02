package br.edu.infnet.livrosservice.repository;

import br.edu.infnet.livrosservice.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
