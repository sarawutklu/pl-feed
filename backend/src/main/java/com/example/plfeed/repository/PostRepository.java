package com.example.plfeed.repository;



import java.util.List;
import com.example.plfeed.entity.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface PostRepository extends PagingAndSortingRepository<Post, String> {
    List<Post> findAllByUserId(String userId, Pageable pageable);
}
