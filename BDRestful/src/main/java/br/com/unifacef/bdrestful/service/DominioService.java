package br.com.unifacef.bdrestful.service;

import br.com.unifacef.bdrestful.model.Dominio;
import br.com.unifacef.bdrestful.model.Questionario;
import br.com.unifacef.bdrestful.repository.DominioRepository;
import br.com.unifacef.bdrestful.repository.QuestionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DominioService {
    private DominioRepository dominioRepository;
    private QuestionarioRepository questionarioRepository;

    public DominioService(QuestionarioRepository questionarioRepository, DominioRepository dominioRepository){
        this.dominioRepository = dominioRepository;
        this.questionarioRepository = questionarioRepository;
    }

    public List<Dominio> getDominios(){
        return dominioRepository.findAll();
    }
    public Dominio addDominio(Dominio dominio){
        Questionario questionario =
        questionarioRepository.findById(dominio.getQuestionario().getId()).orElse(null);
        if (questionario != null){
            dominio.setQuestionario(questionario);
            return dominioRepository.save(dominio);
        }
        return null;
    }
}