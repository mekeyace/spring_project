package shopbag;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class shop_controller {

		PrintWriter pw = null;
		
		@GetMapping("/shopbag/product_list.do")
		public String product_list(Model m, HttpServletResponse res) throws Exception{
			res.setContentType("text/html;charset=utf-8");
			String a = "hong";
			try {
				this.pw = res.getWriter();
				if(a.equals("hong")) {
					this.pw.print("<script>"
							+ "alert('로그인');"
							+ "</script>");
					this.pw.close();
				}
				else {
					m.addAttribute("a",a);
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			return "product_list";
		}
}
