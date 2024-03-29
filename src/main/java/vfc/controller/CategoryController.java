package vfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vfc.domain.Category;
import vfc.service.CategoryManagementService;


@Controller
@RequestMapping("/admin/category")
public class CategoryController {
	
	@Autowired
	CategoryManagementService categoryManagementService;
	
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public String listCategory(Model model){
		List<Category> category= categoryManagementService.getAllCategories();
		model.addAttribute("categories",category);
		//System.out.println(category);
		return "listCategories";
	}

	@RequestMapping(value="/addCategory", method = RequestMethod.GET)
	public String addCategory(@ModelAttribute Category category){
		return "addCategory";
	}
	
	@RequestMapping(value="/addCategory", method=RequestMethod.POST)
	public String saveCategory(@ModelAttribute Category category){
		categoryManagementService.saveCategory(category);
		return "redirect:/admin/category/addCategory";
		
	}
	  
	@RequestMapping(value="/edit/{id}")
	public String editCategory(@PathVariable long id, Model model){
		Category category= categoryManagementService.findCategoryById(id);
		//System.out.println(category);
		model.addAttribute("category",category);
		//System.out.println(category);
		return "addCategory";
	}
	
	@RequestMapping(value="/delete/{id}")
	public String delete(@PathVariable long id){
		categoryManagementService.deleteCategory(id);
		return "redirect:/admin/category/all";
		
	}
	
	
}
