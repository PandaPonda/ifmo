package edu.itmo.zad.zadanie6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opencsv.*;

@SuppressWarnings("serial")
public class ReadGreenf extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");

		String distr = req.getParameter("district");
		String greenUrl = "http://localhost:8888/csv/greenf.csv";
		String waterUrl = "http://localhost:8888/csv/waterf.csv";

	//	String greenUrl = "http://silenceponda.appspot.com/csv/greenf.csv";
	//	String waterUrl = "http://silenceponda.appspot.com/csv/waterf.csv";

		ArrayList<Green> greenf = new ArrayList<Green>();
		int i = 0;
		try {
			URL url = new URL(greenUrl);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					url.openStream(), "UTF-8"));

			@SuppressWarnings("resource")
			CSVReader csv = new CSVReader(reader);
			List<String[]> rows = csv.readAll();

			for (String[] row : rows) {
				if (i > 0) {
					Green green = new Green();
					green.setDistrict(row[0]);
					green.setNumber(row[1]);
					green.setName(row[2]);
					green.setArea(row[3]);
					green.setFoundation(row[4]);
					greenf.add(green);
				}
				i++;
			}
			reader.close();
		}

		catch (IOException e) {
			resp.getWriter().println("Не могу прочитать файл с zel.");
		}
		
		ArrayList<Water> waterf = new ArrayList<Water>();
		int j = 0;
		try {
			URL url = new URL(waterUrl);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					url.openStream(), "UTF-8"));

			CSVReader csv = new CSVReader(reader);
			List<String[]> rows = csv.readAll();

			for (String[] row : rows) {
				if (j > 0) {
					Water water = new Water();
					water.setType(row[2]);
					water.setName(row[3]);
					water.setDistrict(row[4]);
					waterf.add(water);
				}
				j++;
			}
			reader.close();
		}

		catch (IOException e) {
			resp.getWriter().println("Не могу прочитать файл с water.");
		}

		if (!greenf.isEmpty()||!waterf.isEmpty()) {
			resp.getWriter()
					.println(
							"<html><head>"
							+ "<title>Зеленушки</title>"
							+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"/>"
							+ "</head><body>"
							+ "<div class=\"wrapper\">"
							+  "<div class=\"main\">"
							+ "<p class=\"info\">открытые данные</a></p>");
			resp.getWriter()
			.println(
					"<table id=\"dann\"><tr><th>Наименование</th><th>Площадь(Га)</th><th>Основание</th>");
			resp.getWriter().println(
					"<p id=\"dist\"> Выбран район <b>" + distr
							+ "</b> в нём имеются следующие зеленые насаждения общего пользования: </p>");
			for (Green green : greenf) {
				if (distr.equals(green.getDistrict())) {
					resp.getWriter().println(
							"<tr>" + "<td class=\"hot1\">"
									+ green.getName() + "</td>" + "<td class=\"hot2\">"
									+ green.getArea() + "</td>" + "<td class=\"hot3\">"
									+ green.getFoundation() + "</td>" + "</tr>");
			}
		}
			resp.getWriter()
			.println( "</table><p> А также, район <b>" + distr
					+ "</b> распологает следующим переченем водных объектов : </p>"
					+ "<table id=\"dann1\"><tr><th>Наименование</th><th>Тип</th>");
			for (Water water : waterf) {
				if (distr.equals(water.getDistrict())) {
					resp.getWriter().println(
							"<tr>" + "<td class=\"hot1\">"
									+ water.getName() + "</td>" + "<td class=\"hot2\">"
									+ water.getType() + "</td>" + "</tr>");
			}
		}
			resp.getWriter().println("</table></div>"
			+ "<p class=\"credit\">follow me<a href=\"http://vk.com\" class=\"icon-vk\"></a> <a href=\"https://github.com/PandaPonda\" class=\"icon-github-circled\"></a> <a href=\"https://plus.google.com/u/0/100337247794451035450/posts\" class=\"icon-gplus\"></a></p>"
			+ "</div>"
			+ "</body>"
			+ "</html>");
	}
	}
}
