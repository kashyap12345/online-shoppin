package net.kas.shopbackend.dao;

import java.util.List;

import net.kas.shopbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
