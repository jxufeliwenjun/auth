import com.hzit.dao.UserinfoDao;
import com.hzit.entity.Userinfo;
import com.hzit.util.SqlSessionHelper;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年08月04日 - 12:46
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestUserinfoDao {
    public static void main(String[] args) {
        UserinfoDao dao= SqlSessionHelper.getSqlSession().getMapper(UserinfoDao.class);
        List<Userinfo> list=dao.findUser();
        for (Userinfo u:list){
            System.out.println(u);
        }

        /*Userinfo user=dao.findUserByNameAndPwd("1","2");
        System.out.println(user);*/
    }
}
