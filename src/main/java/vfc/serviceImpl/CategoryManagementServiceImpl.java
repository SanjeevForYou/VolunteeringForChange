package vfc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vfc.domain.Category;
import vfc.repository.CategoryManagementRepository;
import vfc.service.CategoryManagementService;

@Service
@Transactional
public class CategoryManagementServiceImpl implements CategoryManagementService{
	
	@Autowired
	CategoryManagementRepository categoryManagementRepository;
	
	@Override
	public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		
		categoryManagementRepository.save(category);
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryManagementRepository.findAll();
	}

	@Override
	public void deleteCategory(long id) {
		
		categoryManagementRepository.delete(id);
		
	}

	@Override
	public void updateCategory(Category category) {
		categoryManagementRepository.save(category);
		
	}

	@Override
	public Category findCategoryById(long id) {
		return categoryManagementRepository.findOne(id);
	}

}
