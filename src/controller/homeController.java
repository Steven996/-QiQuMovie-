package controller;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.startup.HomesUserDatabase;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.user;
import model.favorite;
import model.Movie;
import model.Movietype;

import service.HomeService;

@WebServlet(urlPatterns ={"/index.action","/movie.action","/session.action"
,"/show.action","/cartoon.action","/login.action","/register.action","/detail.action"
,"/find.action","/movieForMobile.action","/homeForMobile.action","/findingForMobile.action"

})
public class homeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getServletPath();
		request.setCharacterEncoding("UTF-8");
		if(url.equals("/index.action")){
			List<Map<String,String>> hmlist = HomeService.gethotmovielist();
		    request.setAttribute("hotmovielist", hmlist);
		    List<Map<String,String>> hslist = HomeService.gethotsessionlist();
		    request.setAttribute("hotsessionlist", hslist);
		    List<Map<String,String>> hotshowlist = HomeService.gethotshowlist();
		    request.setAttribute("hotshowlist", hotshowlist);
		    List<Map<String,String>> hotcartoonlist = HomeService.gethotcartoonlist();
		    request.setAttribute("hotcartoonlist", hotcartoonlist);
		    List<Map<String,String>> movieranklist = HomeService.getmovieranklist();
		    request.setAttribute("movieranklist", movieranklist);
		    List<Map<String,String>> sessionranklist = HomeService.getsessionranklist();
		    request.setAttribute("sessionranklist", sessionranklist);
		    List<Map<String,String>> showranklist = HomeService.getshowranklist();
		    request.setAttribute("showranklist", showranklist);
		    List<Map<String,String>> cartoonranklist = HomeService.getcartoonranklist();
		    request.setAttribute("cartoonranklist", cartoonranklist);
		    
		    request.getRequestDispatcher("/home.jsp").forward(request, response);
		}
		else if(url.equals("/movie.action")) {
			List<Map<String,String>> movielist = HomeService.getmovielist();
		    request.setAttribute("movielist", movielist);		

		    request.getRequestDispatcher("/movie.jsp").forward(request, response);
		}
		//电影移动端接口json	
		else if(url.equals("/movieForMobile.action")){
			response.setContentType("text/json; charset=utf-8");
			PrintWriter out = response.getWriter();
			List<Map<String,String>> movielist = HomeService.getmovielist();
		
			ObjectMapper mapper = new ObjectMapper(); 
	        String jsonlist = mapper.writeValueAsString(movielist);  
	        System.out.println(jsonlist);  
			out.print(jsonlist);
			out.flush();
			}
		//影院移动端接口json	
				else if(url.equals("/homeForMobile.action")){
//					System.out.println("aaaaaaaaaa");
					response.setContentType("text/json; charset=utf-8");
					PrintWriter out = response.getWriter();
					List<Map<String,String>> addresslist = HomeService.getaddresslist();
//					System.out.println(addresslist);
					ObjectMapper mapper = new ObjectMapper(); 
			        String jsonlist = mapper.writeValueAsString(addresslist);  
			        System.out.println(jsonlist);  
					out.print(jsonlist);
					out.flush();
					}
		//发现模块移动端接口json	
				else if(url.equals("/findingForMobile.action")){
					response.setContentType("text/json; charset=utf-8");
					PrintWriter out = response.getWriter();
					List<Map<String,String>> findinglist = HomeService.getfindinglist();
					
					ObjectMapper mapper = new ObjectMapper(); 
			        String jsonlist = mapper.writeValueAsString(findinglist);  
			        System.out.println(jsonlist);  
					out.print(jsonlist);
					out.flush();
					}
		else if(url.equals("/session.action")) {
			List<Map<String,String>> sessionlist = HomeService.getsessionlist();
		    request.setAttribute("sessionlist", sessionlist);		

		    request.getRequestDispatcher("/session.jsp").forward(request, response);
		}
		else if(url.equals("/cartoon.action")) {
			List<Map<String,String>> cartoonlist = HomeService.getcartoonlist();
		    request.setAttribute("cartoonlist", cartoonlist);		

		    request.getRequestDispatcher("/cartoon.jsp").forward(request, response);
		}
		else if(url.equals("/show.action")) {
			List<Map<String,String>> showlist = HomeService.getshowlist();
		    request.setAttribute("showlist", showlist);		
		    
		    request.getRequestDispatcher("/show.jsp").forward(request, response);
		}
		else if(url.equals("/login.action")) {
			 List<Map<String,String>> userlist = HomeService.usercompare();
			 request.setAttribute("userlist", userlist);
		     String un = request.getParameter("username");
		     String pw = request.getParameter("password");
		     int flag=0;
		     for(Map<String,String>map:userlist) {
		    	if(map.get("username").equals(un)&&map.get("password").equals(pw)) {
		    		flag=1;
		    	}
		    }
		    if(flag==1) {
		    	System.out.println("succeed");
		    	request.getRequestDispatcher("/index.action").forward(request, response);
		    }
		    else{
		    	System.out.println("failure");
		    	request.getRequestDispatcher("/fail.jsp").forward(request, response);
		    }
		}
		else if(url.equals("/register.action")) {
		
		    String rn = request.getParameter("registername");
		    String rp = request.getParameter("registerpassword");
		    HomeService.userregister(rn, rp);
		    request.getRequestDispatcher("/login.jsp").forward(request, response);

		}
		else if(url.equals("/detail.action")) {
			List<Map<String,String>> hotmoviedetaillist = HomeService.getdetail();
		    request.setAttribute("hotmoviedetaillist", hotmoviedetaillist);	
		    
	    	request.getRequestDispatcher("/detail.jsp").forward(request, response);

	
	
			}
		else if(url.equals("/find.action")) {
			String f = request.getParameter("search");
			List<Map<String,String>> findlist = HomeService.getfindlist(f);
		    request.setAttribute("findlist", findlist);
//			System.out.println(findlist);
//			System.out.println("aaaaaaaaaaa");
	    	request.getRequestDispatcher("/find.jsp").forward(request, response);

		}
	
			}
		
		
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		

	}

}
