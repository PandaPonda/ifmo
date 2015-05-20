package edu.itmo.zad;
import java.io.IOException;

import edu.itmo.zad.AnsQues;

import javax.servlet.http.*;

import java.text.ParseException;

//@SuppressWarnings("serial")
public class IsklServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		AnsQues[] voprosiki = new AnsQues[ 4 ];
		resp.setContentType("text/plain");
		AnsQues pervii= new AnsQues();
		voprosiki[0]=pervii;
		pervii.answer="трактор";
		pervii.question="что поросёнок Пётр украл из России?";
		AnsQues vtoroi= new AnsQues();
		voprosiki[1]=vtoroi;
		vtoroi.ansnumber=1000;
		vtoroi.question="сколько грамм в килограмме?";
		AnsQues tretii= new AnsQues();
		voprosiki[2]=tretii;
		tretii.ansdata="20.01.1994";
		tretii.question="когда мой день рождения?";
		AnsQues chetvertii= new AnsQues();
		voprosiki[3]=chetvertii;
		chetvertii.answer="брови";
		chetvertii.question="что Серёжа сбрил сыну?";
	
		resp.setCharacterEncoding("utf-8");
		if (req.getParameter("action").equals("check"))
		{	
		napisatVopros(voprosiki,resp);
		}
	else if (req.getParameter("action").equals("ans"))
		{
		try {
			proveritOtvet(voprosiki, req.getParameter("vopr"), req.getParameter("vopros"),resp);
			//исключение на сравнение строк
		} catch (MyExceptionClass e) {
			resp.getWriter().println(e.getMessage());
			//ислючение на ввод не числа, вместо числа
		} catch (NumberFormatException e){
			resp.getWriter().println("НЕПРАВИЛЬНЫЙ, ведь нужно ввести число!");	
			//исключение на ввод не даты, вместо даты
		} catch (ParseException e){
			resp.getWriter().println("НЕПРАВИЛЬНЫЙ, введите дату в формате дд.мм.гггг!");	
		}
		}
	}
		public static void napisatVopros(AnsQues[] a,HttpServletResponse resp) throws IOException {
		resp.getWriter().println("<h2>Внимание вопрос!</h2> <br>");
		int mst=(int)(Math.random()*4);
		resp.getWriter().println(a[mst].question+"<input  type=\"hidden\" id=\"trash\" value="+mst+">");
		
	}
		public static void proveritOtvet(AnsQues[] a, String b, String c,HttpServletResponse resp) throws IOException, MyExceptionClass, NumberFormatException, ParseException {
			resp.getWriter().println("<h2>смотрю на ответ и он:</h2> <br>");
				int mst=Integer.parseInt(c);
				int fffag = a[mst].checkString(b);
				if (fffag==1)resp.getWriter().println("ПРАВИЛЬНЫЙ!");
				else resp.getWriter().println("НЕВЕРНЫЙ!");
		}
}

