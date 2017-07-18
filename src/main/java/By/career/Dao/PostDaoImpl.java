package By.career.Dao;

import By.career.Model.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Evgenia on 17.04.2017.
 */
@Repository("postDao")
public class PostDaoImpl implements PostDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);


    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;
    }


    @Override
    public void addPost(Post post) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(post);
        session.flush();
        logger.info("Post succesfully updated. Details: " + post);
    }

    @Override
    public Post getPostById(int id) {
        return (Post) sessionFactory.getCurrentSession().get(
                Post.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Post> getAllPost() {
        return sessionFactory.getCurrentSession().createQuery("from Post").list();
    }
}
