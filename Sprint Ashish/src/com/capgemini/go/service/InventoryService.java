package com.capgemini.go.service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.go.bean.*;
import java.time.*
;public class InventoryService {
	List<InventoryBean> InventoryList = new ArrayList<InventoryBean>();
	private boolean add;
	
	public InventoryService() {
		super();
		setInventory();
	}

	public List<InventoryBean> showDetails(){
		return InventoryList;
 	}
	
	
	
	private void setInventory() {
	    
		InventoryList.add(new InventoryBean("1111","Rohan","Pen","pen_1234",LocalDateTime.of(2017,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000) ));
		InventoryList.add(new InventoryBean("1111","Rohan","Pencil","pencil_1324",LocalDateTime.of(2016,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1111","Rohan","Book","book_4234",LocalDateTime.of(2015,1,3,6,30,40,40000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1112","Mohan","Marker","marker_9134", LocalDateTime.of(2017,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1113","Sohan","Pen","pen-1234",LocalDateTime.of(2014,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1114","Ram","Pen","pen_1234",LocalDateTime.of(2016,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1115","Soham","Pen","pen_1234",LocalDateTime.of(2017,1,3,6,30,40,20000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1116","Rahul","Pencil","pencil_1324",LocalDateTime.of(2016,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1117","Rajat","Pen","pen_1234",LocalDateTime.of(2017,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1118","Amit","Pen","pen_1234",LocalDateTime.of(2016,1,3,6,30,40,30000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1118","Amit","Book","book_4234",LocalDateTime.of(2017,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1118","Amit","Marker","marker_9134",LocalDateTime.of(2013,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1119","Ajay","Pen","pen-1234",LocalDateTime.of(2016,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1111","Rohan","Pen","pen_1234",LocalDateTime.of(2017,1,3,6,30,40,10000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1112","Mohan","Pen","pen_1234",LocalDateTime.of(2012,1,3,6,30,40,50000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1113","Sohan","Pen","pen_124",LocalDateTime.of(2017,1,3,6,30,40,70000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		InventoryList.add(new InventoryBean("1112","Mohan","Pen","pen_1234",LocalDateTime.of(2017,1,3,6,30,40,90000),LocalDateTime.of(2018,1,3,6,30,40,50000)));
		
	
	}


	public void getInventory() {
		
	}
					
	public void receiveTime(InventoryBean inventory)
	{
		if(inventory!=null) {
			InventoryList.add(inventory);
			inventory.setRecievedate(LocalDateTime.now());
			System.out.println(InventoryList);
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void saleTime(String ProductUniqueId)
	{
	
		if(String.valueOf(InventoryList).contains(ProductUniqueId)); {
			InventoryList.remove(ProductUniqueId);
		//	System.out.println(InventoryList);
		//	showDetails();
		//	System.out.println(InventoryLt);
		}
	}

    static public void toexit() {
    	System.exit(0);
    }



}