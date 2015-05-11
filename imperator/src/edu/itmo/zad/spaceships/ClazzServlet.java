package edu.itmo.zad.spaceships;
import edu.itmo.zad.spaceships.*;


import java.io.IOException;

import javax.servlet.http.*;

//@SuppressWarnings("serial")
public class ClazzServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		int hp=0,  capcap=0;
		String cons=" ";
		Battleship eva = new Battleship();
		Battleship evaff = new Battleship();
		AntimatterEarner eva1 = new AntimatterEarner();
		AntimatterEarner eva1ff = new AntimatterEarner();
		LongRangeReconnaissance eva2 = new LongRangeReconnaissance();
		LongRangeReconnaissance eva2ff = new LongRangeReconnaissance();
		Shuttlecraft eva3 = new Shuttlecraft();
		Shuttlecraft eva3ff = new Shuttlecraft();
		int sh = Integer.parseInt(req.getParameter("sh"));
		
		
		if (sh==1){
			int pr = Integer.parseInt(req.getParameter("pr"));
			switch(pr){
			case 1:
				while (evaff.hp>0) {
				hp=eva.attackB(evaff);
				resp.getWriter().println("�������� "+(evaff.hp-hp)+" �����, �������� "+hp+" hp <br>");
				evaff.hp=hp;
				}
				resp.getWriter().println("������� ���������� ��������� <br> ��������! � ��� ��ƨ��� �����������!");
				break;
			case 2:
				while (eva2ff.hp>0) {
				hp=eva.attackL(eva2ff);
				resp.getWriter().println("�������� "+(eva2ff.hp-hp)+" �����, �������� "+hp+" hp <br>");
				eva2ff.hp=hp;
				}
				resp.getWriter().println("������� ���������� ��������� <br> ��������! � ��� ����������� ������� �������!");
				break;
			case 3:
				while (eva1ff.hp>0) {
				hp=eva.attackA(eva1ff);
				resp.getWriter().println("�������� "+(eva1ff.hp-hp)+" �����, �������� "+hp+" hp <br>");
				eva1ff.hp=hp;
				}
				resp.getWriter().println("������� ���������� ��������� <br> �������������� ����������� �������");
				break;
			case 4:
				while (eva3ff.hp>0) {
				hp=eva.attackS(eva3ff);
				resp.getWriter().println("�������� "+(eva3ff.hp-hp)+" �����, �������� "+hp+" hp <br>");
				eva3ff.hp=hp;
				}
				resp.getWriter().println("������� ���������� ��������� <br> �� ���������� ����������� ���������");
				break;
			case 5:
				resp.getWriter().println("���������� �����������");
				eva.hyperdriveOn();
				break;
			case 6:
				cons=eva.starDestroyer();
				resp.getWriter().println(cons);
				break;
		}
	}
			else if (sh==2){
				int pr = Integer.parseInt(req.getParameter("pr1"));
				switch(pr){
				case 7:
					while (evaff.hp>100000) {
					hp=eva2.attackB(evaff);
					resp.getWriter().println("�������� "+(evaff.hp-hp)+" �����, �������� "+hp+" hp <br>");
					evaff.hp=hp;
					}
					resp.getWriter().println("�� ������� <br> ��� ��� ���...");
					break;
				case 8:
					while (eva2ff.hp>0) {
					hp=eva2.attackL(eva2ff);
					resp.getWriter().println("�������� "+(eva2ff.hp-hp)+" �����, �������� "+hp+" hp <br>");
					eva2ff.hp=hp;
					}
					resp.getWriter().println("������� ���������� ��������� <br> ��������! � ��� ��ƨ��� �����������!");
					break;
				case 9:
					while (eva1ff.hp>0) {
					hp=eva2.attackA(eva1ff);
					resp.getWriter().println("�������� "+(eva1ff.hp-hp)+" �����, �������� "+hp+" hp <br>");
					eva1ff.hp=hp;
					}
					resp.getWriter().println("������� ���������� ��������� <br> ��������! � ��� ����������� ������� �������!");
					break;
				case 10:
					while (eva3ff.hp>0) {
					hp=eva2.attackS(eva3ff);
					resp.getWriter().println("�������� "+(eva3ff.hp-hp)+" �����, �������� "+hp+" hp <br>");
					eva3ff.hp=hp;
					}
					resp.getWriter().println("������� ���������� ��������� <br> �� ���������� ����������� ���������");
					break;
				case 11:
					resp.getWriter().println("���������� �����������");
					eva2.hyperdriveOn();
					break;
				case 12:
					resp.getWriter().println("����������� ������������");
					eva2.invisibilityOn();
					break;
			}
		
			}
			else if (sh==3){
				int pr = Integer.parseInt(req.getParameter("pr2"));
				switch(pr){
				case 1:
					resp.getWriter().println("������� ���������� ������ <br>");
					while (capcap<eva1.capacity){
					capcap=capcap+eva1.maincraft();
					if (capcap>eva1.capacity) capcap=eva1.capacity;
					resp.getWriter().println("���������  "+capcap+" �� "+eva1.capacity+" <br>");
					}
					resp.getWriter().println("������ ��������");
					break;
				case 2:
					resp.getWriter().println("������� ����� ... �������");
					break;
			}
		
			}
			else if (sh==4){
				int pr = Integer.parseInt(req.getParameter("pr3"));
				switch(pr){
				case 1:
					resp.getWriter().println("������������� <br> �� ������ "+eva3.mesto()+" �����");
					break;
				case 2:
					resp.getWriter().println("������� ����� ... �������");
					break;
			}
		
			}
			
		}	
	}
