package com.referal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.referal.model.User;
import com.referal.service.EmailService;

@RestController
public class RefController {
	
	public static Map<Integer, User> userTable;
	
	{
		userTable.put(1, new User().setId(1).setBalance(0).setReferId(new ArrayList() {}));
		userTable.put(2, new User().setId(2).setBalance(0).setReferId(new ArrayList() {}));
		
	}
	
	@Autowired
	public EmailService emailService;
	
	@RequestMapping("/refer")
	  public String findById(@RequestParam("byreferid") String byreferid,
			  				 @RequestParam("toreferid") String toreferid,
			  				 @RequestParam("referCode") String referCode) {
	   
		for (Entry<Integer, User> entry : userTable.entrySet())  {
			
			if(byreferid.equals(entry.getKey())) {
				
				User user = entry.getValue();
				
				List<Integer> referId = user.getReferId();
				referId.add(Integer.parseInt(toreferid));
				user.setReferId(referId);
				
				Map<Integer, Integer> referalstatus = new HashMap<>();
				referalstatus.put(Integer.parseInt(toreferid), 0);
				
				user.setReferalstatus(referalstatus);
				
				
				
				
			}
			
		}
		
		
		
		
	    return "";
	  }
}
