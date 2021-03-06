package com.example.plfeed.controller;


import java.util.List;
import com.example.plfeed.entity.Post;
import com.example.plfeed.service.inf.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/feed")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FeedController {
	

    @Autowired
    private FeedService feedService;
    
   
    @GetMapping("{page}")
    public ResponseEntity<List<Post>> getFeed(@PathVariable("page") int page) {
        List<Post> result = feedService.getFeed("311e22e4-7138-4b14-a966-b6e1bfa69080", page);
        return new ResponseEntity<List<Post>>(result, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> createUser(@RequestBody Post post) {
        return new ResponseEntity<String>(HttpStatus.CREATED);
    }
   
}
