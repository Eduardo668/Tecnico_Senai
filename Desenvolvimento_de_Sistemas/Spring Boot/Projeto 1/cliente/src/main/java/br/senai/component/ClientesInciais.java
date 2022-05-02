package br.senai.component;

import br.senai.Model.Cliente;
import br.senai.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class ClientesInciais implements CommandLineRunner {

    @Autowired
    private ClienteServiceImpl clienteService;

    @Override
    public void run(String... args) throws Exception {
//        Cliente cliente1 = new Cliente();
//        cliente1.setNome("Joao");
//        cliente1.setEmail("joao@gmail.com");
//        cliente1.setCpf("132.323.123-87");
//        clienteService.save(cliente1);
//        Cliente cliente2 = new Cliente();
//        cliente2.setNome("Paulo");
//        cliente2.setEmail("paulo@gmail.com");
//        cliente2.setCpf("122.323.123-87");
//        clienteService.save(cliente2);
//        Cliente cliente3 = new Cliente();
//        cliente3.setNome("Felipe");
//        cliente3.setEmail("felipe@gmail.com");
//        cliente3.setCpf("112.323.123-87");
//        clienteService.save(cliente3);
    }
}
