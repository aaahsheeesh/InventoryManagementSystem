package com.capgemini.go.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.capgemini.go.bean.InventoryBean;
import com.capgemini.go.service.InventoryService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.util.*;
import java.time.LocalDateTime;

public class MainClass {

	static Scanner sc = new Scanner(System.in);
//	MainClass mObject=new MainClass();

	public static void main(String args[]) {

		List<InventoryBean> InventoryList = new ArrayList<InventoryBean>();
		InventoryBean iobj = new InventoryBean();
		InventoryService sobj = new InventoryService();
		int counter1=0;
		String productname="";
		Scanner in = new Scanner(System.in);
		Set<String> hash_Set = new HashSet<String>();
		boolean y = true;
		do {
			System.out.print("----------------Retailer Inventory Managemnet System ----------------\n");
			System.out.println(
					" 1.View All Inventory\n 2. View Inventory by RetailerId \n 3. Update Receive Time \n 4.Update Sale Time \n 5 Count total number of each product \n 6. Exit");
			System.out.println("Enter your choice :");

			int day = in.nextInt();

			Object total;
			switch (day) {
			case 1:
				System.out.println("View of All Inventory ::");
				InventoryList = sobj.showDetails();
				if (InventoryList != null) {

					InventoryList.forEach((inventory) -> {
						System.out.println(inventory);
					});
				} else {
					System.out.println("No inventory is found yet");
				}
				break;

			case 2:
				System.out.println("View Inventory by provided by particular Retailer ::");
				System.out.println("Please provide RetailerID");
				String id = sc.next();

				for (InventoryBean i : InventoryList) {
					if (i.getRetailerId().equals(id)) {
						System.out.println(i.getRetailerId() + "\t" + i.getRetailerName() + "\t" + i.getProductName()
								+ "\t" + i.getProductUniqueId());
					}

				}
				// mObject.getInventory(list);
				break;

			case 3:
				System.out.println("Please provide product details :");
				System.out.println("Retailer Id");
				iobj.setRetailerId(in.next());
				System.out.println("Retailer Name");
				iobj.setRetailerName(in.next());
				System.out.println("Product Name");
				iobj.setProductName(in.next());
				System.out.println("Product UniqueId");
				iobj.setProductUniqueId(in.next());

				sobj.receiveTime(iobj);

				System.out.println("Receive time of product is : ");
				/*
				 * SimpleDateFormat receiveformatter = new
				 * SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); Date receivedate = new Date();
				 * System.out.println(receiveformatter.format(receivedate)); Date receivedate =
				 * new Date(); System.out.println(receivedate);
				 */
				LocalDateTime receive_date = LocalDateTime.now();
				System.out.println(receive_date);
				break;

			case 4:
				System.out.println("Please provide product details :");
//				System.out.println("Retailer Id");
//				iobj.setRetailerId(in.next());
				System.out.println("Product UniqueId");
//				iobj.setProductUniqueId(in.next());

			//	sobj.saleTime(iobj);
				String ProductUniqueId = sc.next();
				sobj.saleTime(ProductUniqueId);

				System.out.println("Sale time of product is : ");
				/*
				 * SimpleDateFormat saleformatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				 * Date saledate = new Date();
				 * System.out.println(saleformatter.format(saledate));
				 */
				LocalDateTime sale_date = LocalDateTime.now();
				System.out.println(sale_date);

				break;

			case 5:
				System.out.println("Total number of each product are");
				for (InventoryBean j : InventoryList) {
					int counter = 0;
					
					productname = j.getProductName();
					for (InventoryBean i : InventoryList) {

						if (i.getProductName().equals(productname)) {
							counter += 1;
						}
					}
					counter1 = counter;
					 
			        hash_Set.add(productname+" "+counter1);
				}
				System.out.println(hash_Set);
				break;

			case 6:

				System.out.println(" Exit");
				sobj.toexit();
				break;

			default:
				System.out.println("Invalid input");
				break;
			}

			System.out.println("want to process more? y/n");
			String x = in.next();
			char ch = x.charAt(0);
			if (ch == 'n')
				y = false;

		} while (y != false);
		in.close();

	}

}
