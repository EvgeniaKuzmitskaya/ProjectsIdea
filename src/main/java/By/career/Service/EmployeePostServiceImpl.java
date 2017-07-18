package By.career.Service;

import By.career.Dao.EmployeepostDao;
import By.career.Model.Employeepost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Evgenia on 19.04.2017.
 */
@Service("employeepostService")
public class EmployeePostServiceImpl implements EmployeepostService {

    @Autowired
    private EmployeepostDao employeepostDao;

    public void setEmployeepostDao(EmployeepostDao employeepostDao) {

        this.employeepostDao = employeepostDao;
    }

    @Override
    @Transactional
    public List<String> getListWork() {

        return this.employeepostDao.getListWork();
    }

    @Override
    @Transactional
    public List<String> getListFired() {
        return this.employeepostDao.getListFired();
    }


}
