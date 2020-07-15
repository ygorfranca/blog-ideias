package br.com.studyathome.blogideias.services;

import br.com.studyathome.blogideias.model.Post;

import java.util.List;

public interface BlogIdeiasService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
