package br.senai.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class EventosInicias implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

    }
}
