package br.com.unifacef.bdrestful.service;

import br.com.unifacef.bdrestful.model.Dominio;
import br.com.unifacef.bdrestful.model.Questao;
import br.com.unifacef.bdrestful.repository.DominioRepository;
import br.com.unifacef.bdrestful.repository.QuestaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestaoService {
    private QuestaoRepository questaoRepository;
    private DominioRepository dominioRepository;

    public QuestaoService(QuestaoRepository questaoRepository, DominioRepository dominioRepository){
        this.questaoRepository = questaoRepository;
        this.dominioRepository = dominioRepository;
    }

    public List<Questao> getQuestoes(){
        return questaoRepository.findAll();
    }

    public Questao addQuestao(Questao questao){
        Dominio dominio =
        dominioRepository.findById(questao.getDominio().getId()).orElse(null);
        if (dominio != null){
            questao.setDominio(dominio);
            return questaoRepository.save(questao);
        }
        return null;
    }
}
