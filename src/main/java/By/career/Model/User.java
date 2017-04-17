package By.career.Model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Evgenia on 15.04.2017.
 */
@Entity
@Table(name = "user", schema = "staff")
@SuppressWarnings("serial")
public class User implements Serializable {
    private int idUser;
    private String login;
    private String password;

    @Id
    @Column(name = "id_user", nullable = false)
    @GeneratedValue
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "login", nullable = false, length = 45)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 15)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (idUser != user.idUser) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
