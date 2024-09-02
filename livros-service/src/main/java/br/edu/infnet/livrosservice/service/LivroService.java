package br.edu.infnet.livrosservice.service;

import br.edu.infnet.livrosservice.model.Livro;
import br.edu.infnet.livrosservice.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> getAll() {
        return livroRepository.findAll();
    }

    public Optional<Livro> getById(Long id) {
        return livroRepository.findById(id);
    }

    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }

    public void delete(Long id) {
        livroRepository.deleteById(id);
    }
}
