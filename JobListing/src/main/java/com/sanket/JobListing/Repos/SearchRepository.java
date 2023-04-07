package com.sanket.JobListing.Repos;

import java.util.List;

import com.sanket.JobListing.Model.Posts;

public interface SearchRepository {

	List<Posts> findByText(String text);
}
