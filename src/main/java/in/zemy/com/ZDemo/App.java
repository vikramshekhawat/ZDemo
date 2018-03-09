package in.zemy.com.ZDemo;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.zemy.com.daoImpl.CassandraCRUDImpl;
import in.zemy.com.daoImpl.GrabInfoFromMysqlDaoImpl;
import in.zemy.com.model.OrdersInfomodel;
import in.zemy.com.service.ResponseModel;
import in.zemy.com.serviceImpl.GetAllDataFromMagentoImpl;

public class App {

	static String baseurl = "";
	static Scanner scan = null;
	private static List<OrdersInfomodel> dataMagento;

	public static void main(String[] args) {

		List<ResponseModel> list = null;

		AbstractApplicationContext context = null;

		GrabInfoFromMysqlDaoImpl dao = null;
		GetAllDataFromMagentoImpl daoMagento = null;
		CassandraCRUDImpl daoCassendra = null;

		try {
			context = new ClassPathXmlApplicationContext("spring.xml");

			context.registerShutdownHook();

			dao = context.getBean("daoGrab", GrabInfoFromMysqlDaoImpl.class);
			daoMagento = context.getBean("daoMagento", GetAllDataFromMagentoImpl.class);
			daoCassendra = context.getBean("daoCassendra", CassandraCRUDImpl.class);

			if (args.length > 0 && args[0].equalsIgnoreCase("specificClientId")) {
				System.out.println("Enter the client id in order to obtain the information : ");
				scan = new Scanner(System.in);
				baseurl = scan.next();
			}

			if (args.length > 0 && args[0].equalsIgnoreCase("specificClientId")) {
				list = dao.GetSpecificInfoFromMysql(baseurl);
			} else {
				list = dao.GetAllInfoFromMysql();
			}
			
			

			for (int i = 0; i < list.size(); i++) {
				 dataMagento = daoMagento.getOrdersinformation(list.get(i));
				daoCassendra.writeDataToMagentoOrdersCassandra(dataMagento);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			daoCassendra.closeSessionAndCluster();
		}
	}

}
