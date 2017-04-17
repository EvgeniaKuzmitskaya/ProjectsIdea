package By.career.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Evgenia on 15.04.2017.
 */
@Entity
public class Post {
    private int idPost;
    private String namePost;

    @Id
    @Column(name = "id_post", nullable = false)
    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    @Basic
    @Column(name = "name_post", nullable = false, length = 45)
    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (idPost != post.idPost) return false;
        if (namePost != null ? !namePost.equals(post.namePost) : post.namePost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPost;
        result = 31 * result + (namePost != null ? namePost.hashCode() : 0);
        return result;
    }
}
