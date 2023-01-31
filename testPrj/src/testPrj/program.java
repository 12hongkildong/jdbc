package testPrj;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.newlecture.web.entity.Menu;

public class program {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {

//		Class.forName("com.newlecture.web.entity.Menu");
		
		
		
		Menu menu = new Menu();
		menu.setName("아메리카노");
		System.out.println(menu);
		
		FileInputStream fis = new FileInputStream("res/setting.txt");
		Scanner scan = new Scanner(fis);
		
		String clsName = scan.nextLine();
		
		// clsName -> "com.newlecture.web.entity.Menu";
		
		//		Menu menul = new clsName(); 불가능
		//		Menu menul = new "com.newlecture.web.entity.Menu\";
		
		Menu menul = (Menu)Class.forName(clsName).newInstance();
		menul.setName("카페라떼");
		System.out.println(menul);
		
		scan.close();
		fis.close();
		
	}

}