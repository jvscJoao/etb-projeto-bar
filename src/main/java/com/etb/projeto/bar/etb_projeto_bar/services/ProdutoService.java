package com.etb.projeto.bar.etb_projeto_bar.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import com.etb.projeto.bar.etb_projeto_bar.model.Produto;
import com.etb.projeto.bar.etb_projeto_bar.repositories.ProdutoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {
    
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    
    public List<Produto> readAll() {
        return produtoRepository.findAll();
    }

    public Produto readById(Integer id) {
        Optional<Produto> obj = produtoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(id, "Objeto não encontrado"));
    }

    public Produto insert(Produto produto) {
        produto.setId(null);
        return produtoRepository.save(produto);
    }

    @Transactional
    public Produto update(Integer id, Produto produto) {
        Produto obj = readById(id);
        obj.setNome(produto.getNome());
        obj.setValor(produto.getValor());
        obj.setCategoria(produto.getCategoria());
        return produtoRepository.save(obj);
    }

    @Transactional
    public void delete(Integer id) {
        Produto obj = readById(id);
        produtoRepository.delete(obj);
    }
}
