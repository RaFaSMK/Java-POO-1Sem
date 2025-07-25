package br.com.unifacef.bdrestful.controller;

import br.com.unifacef.bdrestful.model.Questao;
import br.com.unifacef.bdrestful.service.QuestaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questao")
public class QuestaoController {

    QuestaoService questaoService;
    public QuestaoController(QuestaoService questaoService){
        this.questaoService = questaoService;
    }

    @GetMapping
    public List<Questao> getQuestaoService() {
        return questaoService.getQuestoes();
    }

    @PostMapping
    public Questao addQuestao(@RequestBody Questao questao){
        return questaoService.addQuestao(questao);
    }
}
