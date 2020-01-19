package service;
import java.awt.List;
import java.sql.*;
import java.util.*;
import dao.DBUtil;
public class HomeService {
	//获取热门电影信息
	public static java.util.List<Map<String, String>> gethotmovielist() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection con = null;
		try {
			con=DBUtil.getCon();
			String sql="SELECT * FROM movies where(movietype= '1'AND hits>1)";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			java.util.List<Map<String,String>> hmlist = new ArrayList<Map<String,String>>();
			while(rs.next()){
				Map map= new HashMap<>();
				map.put("movie_id",rs.getString("movie_id"));
				map.put("moviename",rs.getString("moviename"));
				map.put("picture", rs.getString("picture"));
				hmlist.add(map);
			}

			return hmlist;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		finally{
			DBUtil.close(rs, pstmt, con);
		}
	}
	//获取热门电视剧信息
	public static java.util.List<Map<String, String>> gethotsessionlist() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection con = null;
		try {
			con=DBUtil.getCon();
			String sql="SELECT * FROM movies where(movietype= '2'AND hits>1)";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			java.util.List<Map<String,String>> hslist = new ArrayList<Map<String,String>>();
			while(rs.next()){
				Map map= new HashMap<>();
				map.put("movie_id",rs.getString("movie_id"));
				map.put("moviename",rs.getString("moviename"));
				map.put("picture", rs.getString("picture"));
				hslist.add(map);
			}

			return hslist;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		finally{
			DBUtil.close(rs, pstmt, con);
		}
	}
	//获取热门综艺信息
		public static java.util.List<Map<String, String>> gethotshowlist() {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Connection con = null;
			try {
				con=DBUtil.getCon();
				String sql="SELECT * FROM movies where(movietype= '3'AND hits>1)";
				pstmt=con.prepareStatement(sql);
				rs=pstmt.executeQuery();
				java.util.List<Map<String,String>> hotshowlist = new ArrayList<Map<String,String>>();
				while(rs.next()){
					Map map= new HashMap<>();
					map.put("movie_id",rs.getString("movie_id"));
					map.put("moviename",rs.getString("moviename"));
					map.put("picture", rs.getString("picture"));
					hotshowlist.add(map);
				}

				return hotshowlist;
			}
			catch(Exception e){
				e.printStackTrace();
				return null;
			}
			finally{
				DBUtil.close(rs, pstmt, con);
			}
		}
		//获取热门动漫信息
				public static java.util.List<Map<String, String>> gethotcartoonlist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="SELECT * FROM movies where(movietype= '4'AND hits>1)";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> hclist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("movie_id",rs.getString("movie_id"));
							map.put("moviename",rs.getString("moviename"));
							map.put("picture", rs.getString("picture"));
							hclist.add(map);
						}

						return hclist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取电影排行榜信息
				public static java.util.List<Map<String, String>> getmovieranklist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="SELECT * FROM  movies WHERE (moviedate  BETWEEN '2018-07-04' AND  '2018-07-05' and movietype= 1)";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> mrlist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("movie_id",rs.getString("movie_id"));
							map.put("moviename",rs.getString("moviename"));
							map.put("picture", rs.getString("picture"));
							mrlist.add(map);
						}

						return mrlist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取电视剧排行榜信息
				public static java.util.List<Map<String, String>> getsessionranklist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="SELECT * FROM  movies WHERE (moviedate  BETWEEN '2018-06-2' AND  '2018-06-4' and movietype=2)";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> srlist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("movie_id",rs.getString("movie_id"));
							map.put("moviename",rs.getString("moviename"));
							map.put("picture", rs.getString("picture"));
							srlist.add(map);
						}

						return srlist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取综艺排行榜信息
				public static java.util.List<Map<String, String>> getshowranklist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="SELECT * FROM  movies WHERE (moviedate  BETWEEN '2018-05-01' AND  '2018-06-3' and movietype=3)";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> srlist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("movie_id",rs.getString("movie_id"));
							map.put("moviename",rs.getString("moviename"));
							map.put("picture", rs.getString("picture"));
							srlist.add(map);
						}

						return srlist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取动漫排行榜信息
				public static java.util.List<Map<String, String>> getcartoonranklist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="SELECT * FROM  movies WHERE (moviedate  BETWEEN '2018-01-01' AND  '2018-03-30' and movietype=4)";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> crlist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("movie_id",rs.getString("movie_id"));
							map.put("picture", rs.getString("picture"));
							map.put("moviename",rs.getString("moviename"));
							crlist.add(map);
						}

						return crlist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取所有电影信息
				public static java.util.List<Map<String, String>> getmovielist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="select*from movies where movietype = 1";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> movielist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("movie_id",rs.getString("movie_id"));
							map.put("picture", rs.getString("picture"));
							map.put("moviename",rs.getString("moviename"));
							map.put("detail",rs.getString("detail"));
							map.put("hits",rs.getString("hits"));
							map.put("moviedate",rs.getString("moviedate"));
							movielist.add(map);
						}
						return movielist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取所有连续剧信息
				public static java.util.List<Map<String, String>> getsessionlist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="select*from movies where movietype = 2";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> sessionlist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("movie_id",rs.getString("movie_id"));
							map.put("picture", rs.getString("picture"));
							map.put("moviename",rs.getString("moviename"));
							sessionlist.add(map);
						}
						return sessionlist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取所有综艺信息
				public static java.util.List<Map<String, String>> getshowlist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="select*from movies where movietype = 3";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> showlist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("movie_id",rs.getString("movie_id"));
							map.put("picture", rs.getString("picture"));
							map.put("moviename",rs.getString("moviename"));
							showlist.add(map);
						}
						return showlist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取所有动漫信息
				public static java.util.List<Map<String, String>> getcartoonlist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="select*from movies where movietype = 4";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> cartoonlist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("movie_id",rs.getString("movie_id"));
							map.put("picture", rs.getString("picture"));
							map.put("moviename",rs.getString("moviename"));
							cartoonlist.add(map);
						}
						return cartoonlist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
					//用户对比
				public static java.util.List<Map<String, String>> usercompare() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql=" select username,password from user";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> userlist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("password", rs.getString("password"));
							map.put("username",rs.getString("username"));
							userlist.add(map);
						}
						return userlist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取视频具体信息
				public static java.util.List<Map<String, String>> getdetail() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="SELECT * FROM movies where mov_id =1";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> hotmoviedetaillist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("detail",rs.getString("detail"));
							map.put("video", rs.getString("video"));
							hotmoviedetaillist.add(map);
						}      
						return hotmoviedetaillist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取搜索信息
				public static java.util.List<Map<String, String>> getfindlist(String a) {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="select * from movies where moviename like ?";
						pstmt=con.prepareStatement(sql);
//						System.out.println("bbbbbbbb"+a);
						pstmt.setString(1,"%"+a+"%");
						rs=pstmt.executeQuery();
						
						java.util.List<Map<String,String>> findlist = new ArrayList<Map<String,String>>();
						while(rs.next()){
//							System.out.println("aadddddd");
							Map map= new HashMap<>();
							map.put("movie_id",rs.getString("movie_id"));
							map.put("moviename",rs.getString("moviename"));
							map.put("picture", rs.getString("picture"));
							findlist.add(map);
						}

						return findlist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取影院地址信息
				public static java.util.List<Map<String, String>> getaddresslist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="select*from address";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> addresslist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("homename",rs.getString("homename"));
							map.put("detail", rs.getString("detail"));
							addresslist.add(map);
						}
						return addresslist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				//获取发现模块中的信息
				public static java.util.List<Map<String, String>> getfindinglist() {
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="select*from finding";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						java.util.List<Map<String,String>> findinglist = new ArrayList<Map<String,String>>();
						while(rs.next()){
							Map map= new HashMap<>();
							map.put("findname",rs.getString("findname"));
							map.put("details", rs.getString("details"));
							map.put("photo", rs.getString("photo"));
							findinglist.add(map);
						}
						return findinglist;
					}
					catch(Exception e){
						e.printStackTrace();
						return null;
					}
					finally{
						DBUtil.close(rs, pstmt, con);
					}
				}
				
//				注册用户
				public static void userregister(String a,String b) {
					PreparedStatement pstmt = null;
				
					Connection con = null;
					try {
						con=DBUtil.getCon();
						String sql="INSERT into user (username,password) values(?,?)";
						pstmt=con.prepareStatement(sql);
						pstmt.setString(1, a);
						pstmt.setString(2, b);
						int i=pstmt.executeUpdate();
						System.out.println("=========="+i);
						
					}
					catch(Exception e){
						e.printStackTrace();
					}
					finally{
						DBUtil.close(null, pstmt, con);
					}
				}
}