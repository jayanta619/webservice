package com.crud1;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.PostDAOImpl;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
//public class MyResource {
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//        return "Got it!";
//        
//        @Path("MyResource")
        public class MyResource {

        	PostDAOImpl impl = new PostDAOImpl();
        	
        	@Path("posts/all")
        	@GET
        	@Produces(MediaType.APPLICATION_JSON)
        	public List<Post> getPosts() {
        		return impl.view();
        	}
        	
        	@Path("posts/add")
        	@POST
        	@Consumes(MediaType.APPLICATION_JSON)
        	@Produces(MediaType.APPLICATION_JSON)
        	public Post addPost(Post post) {
        		return impl.insert(post);
        	}
        	
        	@Path("posts/edit")
        	@PUT
        	@Consumes(MediaType.APPLICATION_JSON)
        	@Produces(MediaType.APPLICATION_JSON)
        	public Post editPost(Post post) {
        		return impl.update(post);
        	}
        	
        	
        	@Path("posts/delete/{id}")
        	@DELETE
        	@Produces(MediaType.APPLICATION_JSON)
        	public Status deletePost(@PathParam("id") int id) {
        		return impl.delete(new Post(id,"",""));
        	}
        	
        	
        	@Path("posts/search/{title}")
        	@GET
        	@Produces(MediaType.APPLICATION_JSON)
        	public List<Post> searchPosts(@PathParam("title") String title) {
        		return impl.searchposts(title);
        	
        	}  
              
        
    }
    
