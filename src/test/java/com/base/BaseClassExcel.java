package com.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BaseClassExcel {
	public static void main(String[] args) throws IOException {
		Base b = new Base();
		b.getDriver();

		b.geturl("http://adactinhotelapp.com/");

		b.maximize();
		b.implicityWaits();

		WebElement findElementById = b.findElementById("username");
		// b.txtKeys(findElementById, "sarath1278");
		String data = b.getData("Sheet1", 1, 0);
		b.txtKeys(findElementById, data);

		WebElement findElementById2 = b.findElementById("password");
		// b.txtKeys(findElementById2, "7WA386");
		String data2 = b.getData("Sheet1", 1, 1);
		b.txtKeys(findElementById2, data2);

		WebElement findElementById3 = b.findElementById("login");
		b.btnClick(findElementById3);
		// b.getData("Sheet1", rownum, cellnum)
		WebElement loc = b.findElementById("location");
		String data3 = b.getData("Sheet1", 1, 2);
		b.txtKeys(loc, data3);

		WebElement hotel = b.findElementById("hotels");
		String data4 = b.getData("Sheet1", 1, 3);
		b.txtKeys(hotel, data4);

		WebElement roomtype = b.findElementById("room_type");
		String data5 = b.getData("Sheet1", 1, 4);
		b.txtKeys(roomtype, data5);

		WebElement rno = b.findElementById("room_nos");
		String data6 = b.getData("Sheet1", 1, 5);
		b.txtKeys(rno, data6);

		WebElement din = b.findElementById("datepick_in");
		b.erase(din);
		String data7 = b.getData("Sheet1", 1, 6);

		b.txtKeys(din, data7);

		WebElement dout = b.findElementById("datepick_out");
		b.erase(dout);
		String data8 = b.getData("Sheet1", 1, 7);
		b.txtKeys(dout, data8);

		WebElement adult = b.findElementById("adult_room");
		String data9 = b.getData("Sheet1", 1, 8);
		b.txtKeys(adult, data9);

		WebElement child = b.findElementById("child_room");
		String data10 = b.getData("Sheet1", 1, 9);
		b.txtKeys(child, data10);

		WebElement cli = b.findElementById("Submit");
		b.btnClick(cli);

		WebElement radio = b.findElementById("radiobutton_0");
		b.btnClick(radio);

		WebElement con = b.findElementById("continue");
		b.btnClick(con);

		WebElement firstName = b.findElementById("first_name");
		String data11 = b.getData("Sheet1", 1, 10);
		b.txtKeys(firstName, data11);

		WebElement last = b.findElementById("last_name");
		String data12 = b.getData("Sheet1", 1, 11);
		b.txtKeys(last, data12);

		WebElement adds = b.findElementById("address");
		String data13 = b.getData("Sheet1", 1, 12);
		b.txtKeys(adds, data13);

		WebElement cc = b.findElementById("cc_num");
		String data14 = b.getData("Sheet1", 1, 13);
		b.txtKeys(cc, data14);

		WebElement cctype = b.findElementById("cc_type");
		String data15 = b.getData("Sheet1", 1, 14);
		b.txtKeys(cctype, data15);

		WebElement expMth = b.findElementById("cc_exp_month");
		String data16 = b.getData("Sheet1", 1, 15);
		b.txtKeys(expMth, data16);

		WebElement expYear = b.findElementById("cc_exp_year");
		String data17 = b.getData("Sheet1", 1, 16);
		b.txtKeys(expYear, data17);

		WebElement cvv = b.findElementById("cc_cvv");
		String data18 = b.getData("Sheet1", 1, 17);
		b.txtKeys(cvv, data18);

		WebElement book = b.findElementById("book_now");
		b.btnClick(book);
		
		

		WebElement orderId = b.findElementById("order_no");
		b.getAttributeValue("value", orderId);

	}

}
