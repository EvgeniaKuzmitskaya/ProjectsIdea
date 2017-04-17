package By.career.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Evgenia on 15.04.2017.
 */
@Entity
public class Typeorder {
    private int idTypeOrder;
    private String nameTypeOrder;

    @Id
    @Column(name = "id_typeOrder", nullable = false)
    public int getIdTypeOrder() {
        return idTypeOrder;
    }

    public void setIdTypeOrder(int idTypeOrder) {
        this.idTypeOrder = idTypeOrder;
    }

    @Basic
    @Column(name = "name_typeOrder", nullable = false, length = 45)
    public String getNameTypeOrder() {
        return nameTypeOrder;
    }

    public void setNameTypeOrder(String nameTypeOrder) {
        this.nameTypeOrder = nameTypeOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Typeorder typeorder = (Typeorder) o;

        if (idTypeOrder != typeorder.idTypeOrder) return false;
        if (nameTypeOrder != null ? !nameTypeOrder.equals(typeorder.nameTypeOrder) : typeorder.nameTypeOrder != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTypeOrder;
        result = 31 * result + (nameTypeOrder != null ? nameTypeOrder.hashCode() : 0);
        return result;
    }
}
