package edu.itmo.zad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
//����� �������� � �������
//� �������� �������� ������
public class AnsQues {
	String answer = "-1";
	String question = "-1";
	String ansdata = "-1";
	int ansnumber = -1;
	int flag =1;
	
	public int checkString(String otv) throws MyExceptionClass, NumberFormatException, ParseException{
		//��� ������� � ������� �������
		if (!answer.equals("-1")){
			if (!answer.equals(otv)){
				//flag=0;
			throw new MyExceptionClass("��������!");
			}
		}
		//��� ������� � ������� ���� int
		if (ansnumber!=-1){
			if (ansnumber!=Integer.parseInt(otv)){
			flag=0;
			}
		}
		//��� ������� � ������� ���� ����
		if (!ansdata.equals("-1")){
			SimpleDateFormat formatdat = new SimpleDateFormat();
			formatdat.applyPattern("dd.MM.yyyy");
			Date docDate= formatdat.parse(otv);
			Date otvDate=formatdat.parse(ansdata);
			if (!otvDate.equals(docDate)) flag=0;
		}
			System.out.print(flag);
			return flag;
			
	}
}

