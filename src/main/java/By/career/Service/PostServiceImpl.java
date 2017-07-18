package By.career.Service;

import By.career.Dao.PostDao;
import By.career.Model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Evgenia on 17.04.2017.
 */
@Service("postService")
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao postDao;

    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    @Transactional
    public void addPost(Post post) {
        this.postDao.addPost(post);
    }

    @Override
    public Post getPostById(int id) {
        return this.postDao.getPostById(id);
    }

    @Override
    public List<Post> getAllPost() {
        return this.postDao.getAllPost();
    }
}
