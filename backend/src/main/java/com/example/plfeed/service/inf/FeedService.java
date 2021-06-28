package com.example.plfeed.service.inf;

import java.util.List;
import com.example.plfeed.entity.Post;

public interface FeedService {

    List<Post> getFeed(String userId, int page);

    boolean createFeed(Post post);
}
