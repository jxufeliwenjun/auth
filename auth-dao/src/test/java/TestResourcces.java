import com.hzit.dao.ResourccesDao;
import com.hzit.util.SqlSessionHelper;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月03日 - 19:38
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestResourcces {
    public static void main(String[] args)  {
        ResourccesDao dao=SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);
        dao.findResourcces(1);




    }
}
