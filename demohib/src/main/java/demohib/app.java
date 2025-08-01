package demohib;


import java.util.Scanner;

import org.hibernate.cfg.Configuration;

public class app {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name: ");
			String name=sc.next();
			System.out.println("enter department:" );
			String dept=sc.next();
			
			//create employee obj
			employee e=new employee(name, dept);
			//step1
			Configuration conf=new Configuration();
			conf.configure("hibernate.cfg.xml");
			
			
			
	}

}
