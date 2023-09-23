package com.back.api.Repository;

// Importações necessárias para funcionar a repository dividamente.
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.back.api.Model.Usuario;


@Repository // Usando a repository como uma API REST.
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> { 
} // Fazendo a comunicação do back com o banco de dados.
