package br.com.quartetom.todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/primeiraRota")
// http://localhost:8080/primeiraRota
public class MinhaPrimeiraController {

    @GetMapping("/primeiraMensagem")
    public String primeiraMensagem() {
        return "funcionou";
    }
}
