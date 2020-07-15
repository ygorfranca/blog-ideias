package br.com.studyathome.blogideias.services.impl;

import br.com.studyathome.blogideias.model.Post;
import br.com.studyathome.blogideias.repository.BlogIdeiasRepository;
import br.com.studyathome.blogideias.services.BlogIdeiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogIdeiasServiceImpl implements BlogIdeiasService{


    BlogIdeiasRepository repository;
    
    @Autowired
    public BlogIdeiasServiceImpl(BlogIdeiasRepository repository) {
		this.repository = repository;
	}

	@Override
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public Post findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return repository.save(post);
    }
}
