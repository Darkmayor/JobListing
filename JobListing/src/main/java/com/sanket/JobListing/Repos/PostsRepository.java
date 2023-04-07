package com.sanket.JobListing.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sanket.JobListing.Model.Posts;

public interface PostsRepository extends MongoRepository<Posts, String>{

}
