import com.hzit.dao.RoleinfoDao;
import com.hzit.entity.Roleinfo;
import com.hzit.util.SqlSessionHelper;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年08月04日 - 13:22
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestRoleinfoDao {
    public static void main(String[] args) {
        RoleinfoDao dao=SqlSessionHelper.getSqlSession().getMapper(RoleinfoDao.class);
        List<Roleinfo> list=dao.findAll();
        for (Roleinfo r:list){
            System.out.println(list);
        }
    }
}
