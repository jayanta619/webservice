package dao;
import java.util.List;

import com.crud1.Post;
import com.crud1.Status;
public interface PostDAO {
	
	Post insert(Post post);
	Post update(Post post);
	Status delete(Post post);
	List<Post> view();

}
