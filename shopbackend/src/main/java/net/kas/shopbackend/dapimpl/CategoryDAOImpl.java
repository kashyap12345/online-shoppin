package net.kas.shopbackend.dapimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kas.shopbackend.dao.CategoryDAO;
import net.kas.shopbackend.dto.Category;

@Repository("catego")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories=new ArrayList<>();
	static{
		
		Category c=new Category();
		
		//adding first category
		c.setId(1);
		c.setName("Television");
		c.setDescription("This is TV");
		c.setImageURL("CAT_1.png");
		categories.add(c);
		
		
Category c1=new Category();
		
		//adding 2nd category
		c1.setId(2);
		c1.setName("Mobile");
		c1.setDescription("This is Mobile");
		c1.setImageURL("CAT_2.png");
		categories.add(c1);
	
	
	Category c3=new Category();
	
	//adding 3rd category
	c3.setId(3);
	c3.setName("Laptop");
	c3.setDescription("This is Laptop");
	c3.setImageURL("CAT_3.png");
	categories.add(c3);

	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		
		
		//enhanced for loop
		for(Category c:categories){
			if(c.getId()==id) return c;
			
			
		}
		
		return null;
	}

}
