package webservices1.webservices1;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.PostDAOImpl;
import model.Post;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource 
{

	PostDAOImpl impl = new PostDAOImpl();


	@Path("add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Post insert(Post newPost) {
		impl.insert(newPost);
		return newPost;
	}
	
//	
//	
//	@Path("get")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public 	ArrayList<Post> getAll(){
//	ArrayList<Post> list=(ArrayList<Post>)impl.view();
//	
//		return list;
//		}
	

	
	
	
		

}
//@Path("post")
//@POST
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
//public  Message postIt(Message newMsg) {
//newMsg.setMsg(newMsg.getMsg().toUpperCase());
//return newMsg;
//}

//@Path("put")
//@PUT
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
//public  Message putIt(Message editedMsg) {
//editedMsg.setMsg(editedMsg.getMsg().concat(",edited"));
//return editedMsg;
//}
//}
//@Path("delete/{id}")
//@DELETE
//@Produces(MediaType.APPLICATION_JSON)
//
//public List<Message> list=new ArrayList<>();
//list.add(new Message)
//@Path("post")
//@POST
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
//public List<Post>editPost(Post editedPost){
//	Object[] arr=posts.toArray();
//	for(int i=0;i<arr.length;i++) {
//		if(((post)arr[i]).getId()==editedPost.getId()) {
//			posts.set(i,editedPost);
//			break;
//			}
//	return posts;
//	
//	
//	}
//	@Path("delete/{id}")
//	@DELETE
//	@Produces(MediaType.APPLICATION_JSON)
//
//public List<Post>editPost(Post editedPost){
//		Object[] arr=posts.toArray();
//		for(int i=0;i<arr.length;i++) {
//			if(((post)arr[i]).getId()==editedPost.getId()) {
//				posts.remove(arr[i]);
//				break;
//}
//return posts;
//}
