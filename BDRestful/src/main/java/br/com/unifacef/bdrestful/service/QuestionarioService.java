package br.com.unifacef.bdrestful.service;

import br.com.unifacef.bdrestful.model.Formulario;
import br.com.unifacef.bdrestful.model.Questionario;
import br.com.unifacef.bdrestful.repository.FormularioRepository;
import br.com.unifacef.bdrestful.repository.QuestionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionarioService {
    private QuestionarioRepository questionarioRepository;
    private FormularioRepository formularioRepository;

    public QuestionarioService(QuestionarioRepository questionarioRepository, FormularioRepository formularioRepository){
        this.questionarioRepository = questionarioRepository;
        this.formularioRepository = formularioRepository;
    }
    public List<Questionario> getQuestionarios(){
        return questionarioRepository.findAll();
    }
    public Questionario addQuestionario(Questionario questionario){
        Formulario formulario =
        formularioRepository.findById(questionario.getFormulario().getId()).orElse(null);
        if (formulario != null){
            questionario.setFormulario(formulario);
            return questionarioRepository.save(questionario);
        }
        return null;
    }
}
