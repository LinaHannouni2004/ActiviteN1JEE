package dao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("dao")
@Repository("dao")

public class DaoImpl implements IDao {


    @Override
    public double getData() {
        System.out.println("version base de données");

        double temp = 25;

        return temp;
    }
}
