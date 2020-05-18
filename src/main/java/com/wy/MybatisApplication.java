package com.wy;

import java.sql.*;

/**
 * @author: 王阳
 * Date:     2020/5/15 10:14
 * Description:
 */
public class MybatisApplication {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet ps = null;
        try {
            //1,加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //建立连接
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:WY","wy","root");
            //sql语句
            String sql = "select * from users where id=?";
            //创建PreparedStatement对象
            pst =  connection.prepareStatement(sql);
            //5设置参数
            pst.setInt(1,1);
            //5 执行
            ps = pst.executeQuery();
            //处理结果集
            while (ps.next()){
                System.out.println("id"+ps.getInt("id")+"用户"+ps.getString("name")+"密码"+ps.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
