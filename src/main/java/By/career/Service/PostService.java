package By.career.Service;

import By.career.Model.Post;

import java.util.List;

/**
 * Created by Evgenia on 17.04.2017.
 */
public interface PostService {

    public void addPost(Post post);
    public Post getPostById(int id);
    public List<Post> getAllPost();
}
