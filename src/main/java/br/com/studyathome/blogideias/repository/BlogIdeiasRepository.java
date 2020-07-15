package br.com.studyathome.blogideias.repository;

import br.com.studyathome.blogideias.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogIdeiasRepository extends JpaRepository<Post,Long> {

}
