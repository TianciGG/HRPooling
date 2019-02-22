package com.iss.DBUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;



public class DBUtil {
	//声明属性
	private Connection conn;
	private PreparedStatement prep;
	
	//构造方法中：导入驱动，并且给conn赋值

	public  DBUtil(){
		//0.读取配置文件
		Properties pp=new Properties();		  //加载配置文件
		
		try {
			pp.load(DBUtil.class.getResourceAsStream("db.properties"));
			
//			System.out.println(pp.getProperty("driver"));
			//1.加载驱动
			Class.forName(pp.getProperty("db.driverClassName"));
			//System.out.println("驱动加成功");
			///2.创建链接
			conn=DriverManager.getConnection(pp.getProperty("db.url"),
					pp.getProperty("db.username"),
					pp.getProperty("db.password"));
			//System.out.println("连接数据库成功");
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//执行增删改的方法
	public int update(String sql){
		//1.建立接收结果的容器
		 int temp=-1;		
		try {
			//2.实例化执行sql语句的对象
			prep=conn.prepareStatement(sql);
			//3.执行sql语句并接收结果
			temp=prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	   }		
		//4.抛出结果
		return temp;
	}	
	
	//动态参数的增删改方法     Object ... arr-->可变参数
	public int update(String sql,Object ... arr){
		//1. 定义接收结果的容器
		  int temp=-1;	
		 try {
				//2. 实例化执行sql语句的对象
			prep=conn.prepareStatement(sql);
			//3. 给问号赋值
			for(int i=0;i<arr.length;i++){
				prep.setObject(i+1, arr[i]);
			}
			//4.执行sql语句并接收结果
			temp=prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//5.抛出结果
		  return temp;
	}
	
	
	//执行查询的方法
	public ResultSet query(String sql){
		//1.定义接收结果的容器
		ResultSet rs=null;	
		try {
			//2. 实例化执行sql语句的对象
			prep=conn.prepareStatement(sql);
			//3.执行并接收结果
			rs=prep.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//4.抛出结果
		return rs;
	}
	//测试的方法
		/*public static void main(String [] args){
					String sql="select * from user_login where userName=? and userPwd=md5(?)";
					DBUtil db=new DBUtil();
					ResultSet rs=db.query(sql,"admin","11");
					try {
						while(rs.next()){
							System.out.print(rs.getString(1)+"\t");
							System.out.print(rs.getString(2)+"\t");
							System.out.print(rs.getString(3)+"\t");
							System.out.println(rs.getString(4));
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//关闭
					db.close();
				}*/

   //绑定动态参数的查询方法
	public ResultSet query(String sql,Object ... arr){
		//1. 容器
		  ResultSet rs=null;		
		  try {
			//2. 实例化
			prep=conn.prepareStatement(sql);
			//3.给问号赋值
			for(int i=0;i<arr.length;i++){
				prep.setObject(i+1, arr[i]);
			}
			//4。执行
			rs=prep.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//5.抛出结果
		  return rs;}
	
	
	
	
	//关闭的方法
	public void close(){
		//先关闭prep
		try {
			if(prep!=null && !prep.isClosed()){
				prep.close();
			}
			//再关闭conn
			if(conn!=null && !conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
