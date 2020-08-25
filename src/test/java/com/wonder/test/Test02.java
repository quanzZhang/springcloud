package com.wonder.test;

import org.junit.Test;

import java.sql.*;

public class Test02 {
    @Test
    public void test(){
        Connection conn=null;
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/zhangqian?serverTimezone=UTC";
        String user="root";
        String password="980306";
        try {
            Class.forName(driver);

            conn=DriverManager.getConnection(url, user, password);
            Statement statement=conn.createStatement();
            String sql="select * from flower";
            ResultSet set=statement.executeQuery(sql);
            while (set.next()){
                String job=set.getString("name");
                System.out.println(job);
            }
            set.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
