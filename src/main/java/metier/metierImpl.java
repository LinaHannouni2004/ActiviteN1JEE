package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("metier")
@Service("metier")
public class metierImpl implements Imetier {

  private IDao dao ;

  //injection des dependance via un constructeur
    public metierImpl(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }



    @Override
    public double calcul() {
        double t=dao.getData();
        double res=t*23;
        return res;
    }


    //injection des dependance via un setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
