package com.example.plfeed.service.impl;

import java.util.List;
import com.example.plfeed.entity.Post;
import com.example.plfeed.repository.PostRepository;
import com.example.plfeed.service.inf.FeedService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class FeedServiceImpl implements FeedService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private PostRepository postRepository;

	@Override
	public List<Post> getFeed(String userId, int page) {
		Pageable firstPageWithTwoElements = PageRequest.of(page, 10, Sort.by("lastModifiedDate"));
        List<Post> result = postRepository.findAllByUserId(userId, firstPageWithTwoElements);
		return result;
	}

	@Override
	public boolean createFeed(Post post) {
		// TODO Auto-generated method stub
		return false;
	}





}
