package net.kas.onlineshoppin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kas.shopbackend.dao.CategoryDAO;
import net.kas.shopbackend.dto.Category;

@Controller
public class PageController {

	
	@Autowired
	private CategoryDAO categoryDAO1;
	
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		
		//passing list of categories
		mv.addObject("categories", categoryDAO1.list());
		mv.addObject("userClickHome","true");
		return mv;
			
	}
	
	@RequestMapping(value={"/about"})
	public ModelAndView about(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout","true");
		return mv;
			
	}
	
	@RequestMapping(value={"/contact"})
	public ModelAndView contactt(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact","true");
		return mv;
			
	}
	
	@RequestMapping(value={"/show/all/products"})
	public ModelAndView showAllProducts(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");
		
		//passing list of categories
		mv.addObject("categories", categoryDAO1.list());
		mv.addObject("userClickAllProducts","true");
		return mv;
			
	}
	
	@RequestMapping(value={"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id){
		ModelAndView mv=new ModelAndView("page");
		//categoryDAO to fetch single category
		Category c=null;
		c=categoryDAO1.get(id);
		
		mv.addObject("title",c.getName());
		
		//passing list of categories
		mv.addObject("categories", categoryDAO1.list());
		
		//passing single category
		mv.addObject("category", c);
			
		mv.addObject("userClickCategoryProducts","true");
		
		
		
		return mv;
			
	}
	
	
	
}
