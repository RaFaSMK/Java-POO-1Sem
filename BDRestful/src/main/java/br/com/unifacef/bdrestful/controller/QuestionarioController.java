package br.com.unifacef.bdrestful.controller;

import br.com.unifacef.bdrestful.model.Questionario;
import br.com.unifacef.bdrestful.service.QuestionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questionario")
public class QuestionarioController {

    QuestionarioService questionarioService;
    public QuestionarioController(QuestionarioService questionarioService){
        this.questionarioService = questionarioService;
    }

    @GetMapping
    public List<Questionario> getQuestionarios(){
        return questionarioService.getQuestionarios();
    }

    @PostMapping
    public Questionario addQuestionario(@RequestBody Questionario questionario){
        return questionarioService.addQuestionario(questionario);
    }
}
