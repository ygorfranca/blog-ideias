package br.com.studyathome.blogideias.util;

import br.com.studyathome.blogideias.model.Post;
import br.com.studyathome.blogideias.repository.BlogIdeiasRepository;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {


    BlogIdeiasRepository repository;

    @Autowired
    public DummyData(BlogIdeiasRepository repository) {
        this.repository = repository;
    }

    //@PostConstruct
    public void savePosts(){

        List<Post> listaPost = new ArrayList<>();

        Post p1 = new Post();
        p1.setAuthor("Ygor França");
        p1.setTitle("Java");
        p1.setDate(LocalDate.now());
        p1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent malesuada at ante at consequat. Pellentesque in tellus et metus ullamcorper elementum. Mauris ac congue justo. Morbi a ullamcorper risus. Aliquam erat volutpat. Nulla a rhoncus libero, non cursus orci. Vestibulum consequat porta felis, in euismod enim laoreet nec. Nam et lacus vel risus finibus auctor ut in augue. Aenean sagittis ligula nec scelerisque auctor. Nulla facilisi.");
        listaPost.add(p1);

        Post p2 = new Post();
        p2.setAuthor("Ygor França");
        p2.setTitle("IntelliJ");
        p2.setDate(LocalDate.now());
        p2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent malesuada at ante at consequat. Pellentesque in tellus et metus ullamcorper elementum. Mauris ac congue justo. Morbi a ullamcorper risus. Aliquam erat volutpat. Nulla a rhoncus libero, non cursus orci. Vestibulum consequat porta felis, in euismod enim laoreet nec. Nam et lacus vel risus finibus auctor ut in augue. Aenean sagittis ligula nec scelerisque auctor. Nulla facilisi.");
        listaPost.add(p2);

        for (Post p: listaPost) {
            Post postSaved = repository.save(p);
            System.out.println(postSaved.getId());
        }


    }


}
