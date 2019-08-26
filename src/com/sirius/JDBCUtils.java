package com.sirius;

import java.sql.*;

/**
 * @author Ymh_Sirius E-mail: ymh254089@163.com
 * @Title: JDBCUtils
 * @ProjectName IdeaDemo01
 * @Description
 * @date 2019/8/26 20:48
 */
class JDBCUtlTool {

    private static final String driver = "com.mysql.jdbc.Driver";
    //连接数据库的URL地址
    private static final String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&&serverTimezone=UTC";
    //数据库的用户名
    private static final String username="root";
    //数据库的密码
    private static final String password="root";

    private static Connection conn=null;

    //静态代码块负责加载驱动
    static
    {
        try
        {
            Class.forName(driver);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    //单例模式返回数据库连接对象
    public static Connection getConnection() throws Exception
    {
        if(conn==null)
        {
            conn = DriverManager.getConnection(url, username, password);
            return conn;
        }
        return conn;
    }

    public static void main(String[] args) {

        try
        {
            Connection conn =JDBCUtlTool.getConnection();
            if(conn!=null)
            {
                System.out.println("数据库连接成功！");
            }
            else
            {
                System.out.println("数据库连接失败！");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }

}