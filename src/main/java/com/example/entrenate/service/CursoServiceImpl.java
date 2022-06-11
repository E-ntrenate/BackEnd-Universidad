package com.example.entrenate.service;

import com.example.entrenate.model.curso.Curso;
import com.example.entrenate.repository.CursoRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService{

    private final CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso getCursoById(Integer id) {
        return cursoRepository.findById(id).get();
    }

    @Override
    public Curso updateCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void deleteCursotById(Integer id) {
        cursoRepository.deleteById(id);
    }
    //me metio esta porqueria a la fuerza
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}