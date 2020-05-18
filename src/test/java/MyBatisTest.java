import com.wy.entity.User;
import com.wy.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: 王阳
 * Date:     2020/5/15 15:48
 * Description:
 */
public class MyBatisTest {

    public SqlSessionFactory getSqlSessionFactory(){
        SqlSessionFactory sf = null;
        try {
            /*加载配置文件*/
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            /*读取配置文件内容*/
            SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
             sf = sfb.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sf;
    }


    @Test
    public void getById(){
//         使用sqlSessionFactory创建sqlSession对象
        SqlSession sqlSession = this.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        User user = sqlSession.selectOne("mybatis.get",1);
        User user = userMapper.get(1);
        System.out.println(user);
        sqlSession.close();
    }
}
