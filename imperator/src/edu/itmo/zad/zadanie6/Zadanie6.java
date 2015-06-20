package edu.itmo.zad.zadanie6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import javax.servlet.http.*;

import com.opencsv.CSVReader;

public class Zadanie6 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		String districtsUrl = "http://localhost:8888/csv/districts.csv";
		//String districtsUrl = "http://silenceponda.appspot.com/csv/districts.csv";
		try {
			URL url = new URL(districtsUrl);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					url.openStream(), "UTF-8"));
			String line;
			resp.getWriter().println("<h1>Выберите район</h1>");
			resp.getWriter().println("<table><tr>");
			int k = 0;
			for (int i = 0; (line = reader.readLine()) != null; i++) {
				if (i > 0) {
					String[] values = line.split(",");
					resp.getWriter().println("<td>"
					+"<div class=\"grid\">"
				    +"<figure class=\"effect-lily\">"
				        +"<img src=\"images/"+values[1]+".jpg\" alt=\"img01\"/>"
				        +"<figcaption>"
				        +"<div>"
				            +"<h2>+<span>"+values[0]+"</span></h2>"
				            +"<p>район Санкт-Петербурга</p>"
				            +"</div>"
				            +"<a href=\"#\" onclick=\"location.href='readGreenf?district="+values[0]+"'\"></a>"
				        +"</figcaption>"
				    +"</figure>"
				+"</div>"
				+"</td>");
					
					k++;
					if (k == 3) {
						resp.getWriter().println("</tr><tr>");
						k = 0;
					}
				}
			}
			reader.close();
			resp.getWriter().println("</tr></table>");
		}

		catch (IOException e) {
			resp.getWriter().println("Не могу прочитать файл.");
		}
	}
}
