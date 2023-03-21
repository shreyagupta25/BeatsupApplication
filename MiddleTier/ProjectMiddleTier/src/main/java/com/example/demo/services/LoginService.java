package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.repositories.LoginRepository;


@Service
public class LoginService {

	@Autowired
	LoginRepository lrepo;
	
	public Login getLogin(String uid , String pwd)
	{
		//System.out.println(uid+" "+pwd);
		Login l;
		Optional<Login> ol =lrepo.getLogin(uid, pwd);
		try {
			l=ol.get();
		}
		catch(Exception e)
		{
			System.out.println("null");
			l=null;
		}
		return l;
	}
	
	public Login getById(int loginid)
	{
		return lrepo.findById(loginid).get();
	}
	
	public Login save(Login l)
	{
		return lrepo.save(l);
	}
	
	
	/*
	public List<Contact> getAll()
	{
		return crepo.findAll();
	}
	
	public Contact save(Contact c)
	{
		return crepo.save(c);
	}
	
	public Contact getOne(int cid)
	{
		//sure
		//crepo.getOne(null)
		
		//preferred - not sure
		Optional<Contact> opt = crepo.findById(cid);
		Contact c = null;
		try
		{
			c = opt.get();
		}
		catch(NoSuchElementException e)
		{
			c = null;
		}
		return c;
		
	}
	
	public List<Contact> getAllWithA()
	{
		return crepo.getAllWithA();
	}
	
	public List<Contact> getContacts(String mail, String cno)
	{
		return crepo.getContacts(mail,cno);
	}
	
	public int updateEmail(int id, String mail)
	{
		return crepo.updateEmail(id, mail);
	}
	
	*/
}
