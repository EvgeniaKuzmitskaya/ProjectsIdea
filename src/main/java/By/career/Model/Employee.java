package By.career.Model;
import javax.persistence.*;
import java.sql.Date;
/**
 * Created by Evgenia on 15.04.2017.
 */
@Entity
@Table(name = "employee", schema = "staff")
public class Employee {
    private int idEmployee;
    private String name;
    private String surname;
    private String patronicname;
    private Date dateOfBirh;
    private String placeOfBirth;
    private String sex;
    private String numberPassport;
    private String datePassport;
    private String insurance;
    private String adress;
    private String phone;

    @Id
    @Column(name = "id_employee", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname", nullable = true, length = 50)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "patronicname", nullable = true, length = 50)
    public String getPatronicname() {
        return patronicname;
    }

    public void setPatronicname(String patronicname) {
        this.patronicname = patronicname;
    }

    @Basic
    @Column(name = "dateOfBirh", nullable = true)
    public Date getDateOfBirh() {
        return dateOfBirh;
    }

    public void setDateOfBirh(Date dateOfBirh) {
        this.dateOfBirh = dateOfBirh;
    }

    @Basic
    @Column(name = "placeOfBirth", nullable = true, length = 45)
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 15)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "number_passport", nullable = true, length = 45)
    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    @Basic
    @Column(name = "date_passport", nullable = true, length = 45)
    public String getDatePassport() {
        return datePassport;
    }

    public void setDatePassport(String datePassport) {
        this.datePassport = datePassport;
    }

    @Basic
    @Column(name = "insurance", nullable = true, length = 35)
    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    @Basic
    @Column(name = "adress", nullable = true, length = 95)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 45)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (idEmployee != employee.idEmployee) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (surname != null ? !surname.equals(employee.surname) : employee.surname != null) return false;
        if (patronicname != null ? !patronicname.equals(employee.patronicname) : employee.patronicname != null)
            return false;
        if (dateOfBirh != null ? !dateOfBirh.equals(employee.dateOfBirh) : employee.dateOfBirh != null) return false;
        if (placeOfBirth != null ? !placeOfBirth.equals(employee.placeOfBirth) : employee.placeOfBirth != null)
            return false;
        if (sex != null ? !sex.equals(employee.sex) : employee.sex != null) return false;
        if (numberPassport != null ? !numberPassport.equals(employee.numberPassport) : employee.numberPassport != null)
            return false;
        if (datePassport != null ? !datePassport.equals(employee.datePassport) : employee.datePassport != null)
            return false;
        if (insurance != null ? !insurance.equals(employee.insurance) : employee.insurance != null) return false;
        if (adress != null ? !adress.equals(employee.adress) : employee.adress != null) return false;
        if (phone != null ? !phone.equals(employee.phone) : employee.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmployee;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (patronicname != null ? patronicname.hashCode() : 0);
        result = 31 * result + (dateOfBirh != null ? dateOfBirh.hashCode() : 0);
        result = 31 * result + (placeOfBirth != null ? placeOfBirth.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (numberPassport != null ? numberPassport.hashCode() : 0);
        result = 31 * result + (datePassport != null ? datePassport.hashCode() : 0);
        result = 31 * result + (insurance != null ? insurance.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
