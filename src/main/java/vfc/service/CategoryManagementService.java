package vfc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vfc.domain.Category;

@Service
public interface CategoryManagementService {
	//for Category
		public void saveCategory(Category category);
		public List<Category>getAllCategories();
		public void deleteCategory(long id);
		public void updateCategory(Category category);
		public Category findCategoryById(long id);

}
