package By.career.Model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Evgenia on 15.04.2017.
 */
@Entity
@Table(name = "employeepost", schema = "staff")
public class Employeepost {
    private int idEmployeePost;
    private Date dateBegin;
    private Date dateEnd;
    private Employee employeeByIdEmployee;

    @Id
    @Column(name = "id_employeePost", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getIdEmployeePost() {
        return idEmployeePost;
    }

    public void setIdEmployeePost(int idEmployeePost) {
        this.idEmployeePost = idEmployeePost;
    }

    @Basic
    @Column(name = "date_Begin", nullable = false)
    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    @Basic
    @Column(name = "date_End", nullable = false)
    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "Employeepost{" +
                "idEmployeePost=" + idEmployeePost +
                ", dateBegin=" + dateBegin +
                ", dateEnd=" + dateEnd +
                ", employeeByIdEmployee=" + employeeByIdEmployee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employeepost that = (Employeepost) o;

        if (idEmployeePost != that.idEmployeePost) return false;
        if (dateBegin != null ? !dateBegin.equals(that.dateBegin) : that.dateBegin != null) return false;
        if (dateEnd != null ? !dateEnd.equals(that.dateEnd) : that.dateEnd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmployeePost;
        result = 31 * result + (dateBegin != null ? dateBegin.hashCode() : 0);
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "id_employee", nullable = false)
    public Employee getEmployeeByIdEmployee() {
        return employeeByIdEmployee;
    }

    public void setEmployeeByIdEmployee(Employee employeeByIdEmployee) {
        this.employeeByIdEmployee = employeeByIdEmployee;
    }
}
