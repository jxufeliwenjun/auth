import com.hzit.dao.ResourccesDao;
import com.hzit.entity.Resourcces;
import com.hzit.util.SqlSessionHelper;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月03日 - 19:38
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestResourcces {
    public static void main(String[] args) {
        ResourccesDao dao = SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);

        List<Resourcces> list= dao.findAll();
        for (Resourcces rs : list){
            System.out.println(rs.getRname());
        }
    }
}
