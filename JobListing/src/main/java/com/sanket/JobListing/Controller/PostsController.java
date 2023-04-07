package com.sanket.JobListing.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.JobListing.Model.Posts;
import com.sanket.JobListing.Repos.PostsRepository;
import com.sanket.JobListing.Repos.SearchRepository;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostsController {
	
	
	@Autowired
	PostsRepository postrepo;
	
	@Autowired
	SearchRepository searchrepo;
	
	//Home Page 
	@RequestMapping("/")
	@ApiIgnore
	public void redirect(HttpServletResponse respose) throws IOException {
		respose.sendRedirect("/swagger-ui.html");
	}
	
	//getting posts
	@GetMapping("/allPosts")
	@CrossOrigin
	public List<Posts> getposts(){
		return postrepo.findAll();
	}
	
	//Searching
	@GetMapping("/posts/{text}")
	@CrossOrigin
	public List<Posts> search(@PathVariable String text){
		return searchrepo.findByText(text);
	}
	
	//adding posts
	@PostMapping("/addposts")
	@CrossOrigin
	public Posts addpost(@RequestBody Posts post) {
		return postrepo.save(post);
	}
}
