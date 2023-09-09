package lab.webpost.services;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lab.webpost.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
    
    List<Post> findByTitle(String title); 

    List<Post> findByAuthor(String author); 

    List<Post> findByCategory(String category); 

}

