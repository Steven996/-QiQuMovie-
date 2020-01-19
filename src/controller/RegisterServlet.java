package controller;

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Map;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import dao.DBUtil;

public class RegisterServlet {
	@WebServlet("/RegisterServlet")
	public class registerServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	    public registerServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//设置相应的输出类型位文本网页，字符集GBK
//			response.setContentType("text/html;charset=GBK");
			//设置请求中文编码方式为GBK
			request.setCharacterEncoding("GBK");
//			PrintWriter out = response.getWriter();
			//读取请求参数的值
			String un = request.getParameter("username");
			String pw = request.getParameter("password");
			//用户名是否唯一
			String sql="select * from user where userName=?";
			String[] params=new String[] {un};
			Map<String,String> user=new dao.DBUtil_teacher().getMap(sql,params);
			response.setContentType("text/html:charset=GBK");
			PrintWriter out =response.getWriter();
			if(user == null) {
				sql="insert into user values(null,?,?)";
				params= new String[] {un,pw};
				int r = new dao.DBUtil_teacher().update(sql,params);
				if(r==1) {
					out.println("注册成功");
				}
				else {
					out.println("注册失败！");
				}
			}
			else {
				out.println("该用户名已被使用！");
				out.println("<a href=\"javascript:history.back()\">返回</a>");
			}
		}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}
	}
}
