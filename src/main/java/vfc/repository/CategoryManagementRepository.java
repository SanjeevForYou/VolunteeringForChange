package vfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vfc.domain.Category;

@Repository
public interface CategoryManagementRepository extends JpaRepository<Category,Long> {

}
