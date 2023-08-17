package br.edu.ifsp.dw2.exercicio03.serice;

import br.edu.ifsp.dw2.exercicio03.domain.Cliente;
import br.edu.ifsp.dw2.exercicio03.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public Optional<List<Cliente>> listar() {
        return Optional.of(clienteRepository.findAll());
    }

    public Optional<Optional<Cliente>> getById(Long id) {
        return Optional.of(clienteRepository.findById(id));
    }

    public Optional<Cliente> salvar(Cliente cliente) {
        return Optional.of(clienteRepository.save(cliente));
    }
}
