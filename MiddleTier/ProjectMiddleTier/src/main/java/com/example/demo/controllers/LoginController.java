package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.entities.Login;
import com.example.demo.entities.LoginCheck;
import com.example.demo.entities.PassBasedEnc;
import com.example.demo.entities.SaltValue;
import com.example.demo.services.LoginService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController {

	@Autowired
	LoginService lservice;
	
	@Autowired
	SaltValue saltValue;
	
	@PostMapping("/checkLogin")
	public Login checkLogin(@RequestBody LoginCheck lcheck)
	{
		System.out.println(lcheck.getEmail()+","+lcheck.getPassword());
		String encrypted = PassBasedEnc.generateSecurePassword(lcheck.getPassword(), saltValue.getSalt());
		return lservice.getLogin(lcheck.getEmail(),encrypted);
		//return lservice.getLogin("arj@gmail.com","arj123");
	}
	
/*	
	@GetMapping("/all")
	public List<Contact> getAll()
	{
		return cservice.getAll();
	}
	
	@PostMapping("/save")
	public Contact save(@RequestBody Contact c)
	{
		return cservice.save(c);
	}
	
	@GetMapping("/getone")    //http://localhost:8080/getone?cid=4
	public Contact getOne(@RequestParam("cid") int cid)
	{
		return cservice.getOne(cid);
	}
	
	@GetMapping("/getfrompath/{id}") //http://localhost:8080/getfrompath/1/bakul
	public Contact getFromPath(@PathVariable("id")int cid)
	{
		return cservice.getOne(cid);
	}
	
	//get all contacts having 'a' in fname
	@GetMapping("/getwitha")
	public List<Contact> getAllhavinga()
	{
		return cservice.getAllWithA();
	}
	
	@GetMapping("/getAllwithor")
	public List<Contact> getContacts(@RequestParam("email") String mail,@RequestParam("contactno") String cno)
	{
		return cservice.getContacts(mail, cno);
	}
	
	@PutMapping("/updatemail")
	public int updateEmail(@RequestParam("cid") int id,@RequestParam("email") String mail)
	{
		return cservice.updateEmail(id, mail);
	}
	*/
}
