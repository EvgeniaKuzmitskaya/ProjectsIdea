package By.career.Model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Evgenia on 15.04.2017.
 */
@Entity
public class Order {
    private int idOrder;
    private Date dateOrder;
    private String numberOrder;
    private String textOrder;
    private Employee employeeByIdEmployee;

    @Id
    @Column(name = "id_order", nullable = false)
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "date_order", nullable = false)
    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    @Basic
    @Column(name = "number_order", nullable = false, length = 25)
    public String getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    @Basic
    @Column(name = "text_order", nullable = false, length = -1)
    public String getTextOrder() {
        return textOrder;
    }

    public void setTextOrder(String textOrder) {
        this.textOrder = textOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (idOrder != order.idOrder) return false;
        if (dateOrder != null ? !dateOrder.equals(order.dateOrder) : order.dateOrder != null) return false;
        if (numberOrder != null ? !numberOrder.equals(order.numberOrder) : order.numberOrder != null) return false;
        if (textOrder != null ? !textOrder.equals(order.textOrder) : order.textOrder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrder;
        result = 31 * result + (dateOrder != null ? dateOrder.hashCode() : 0);
        result = 31 * result + (numberOrder != null ? numberOrder.hashCode() : 0);
        result = 31 * result + (textOrder != null ? textOrder.hashCode() : 0);
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
