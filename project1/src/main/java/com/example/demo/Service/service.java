package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.moddetails;
import com.example.demo.Model.modlogin;
import com.example.demo.Repo.detailsrepo;
import com.example.demo.Repo.loginrepo;




@Service
public class service {
	
	@Autowired
	detailsrepo repository;
	
	@Autowired
	loginrepo repositoryL;
	
	public String addCustomer(moddetails customer)
	{
		repository.save(customer);
		return "Added successfully";
	}
	public List<moddetails> getCustomer()
	{
		return repository.findAll();
		
	}
	public Optional<moddetails> getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String updateCustomer(moddetails customer)
	{
		repository.save(customer);
		return "Updated successfully";
	}
	public String deleteById(int id)
	{
		repository.deleteById(id);
		return "Deleted successfully";
	}
	
	public List<moddetails> getProDetails(@RequestParam String field)
	{
		return repository.findAll(Sort.by(Direction.ASC,field));
	}

	public List<moddetails> getProwithPag(int offset, int pagesize)
	{
		Page<moddetails> page=repository.findAll(PageRequest.of(offset, pagesize));
		return page.getContent();
	}
	
	public String checkLogin(String uname,String pwd)
	{
		modlogin user=repositoryL.findByuname(uname);
		if(user==null)
		{
			return "Invalid Details";
		}
		else
		{
			if(user.getPwd().equals(pwd))
			{
				return "Login successful";
			}
			else
			{
				return "Login failed";
			}
		}
	}
	
	public modlogin addUser(modlogin mod)
	{
		return repositoryL.save(mod);
	}
	
	
	public List<modlogin> getUser()
	{
		return repositoryL.findAll();
	}

}