package net.codejava.services;

import java.util.List;

import net.codejava.entity.Product;
import net.codejava.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private final ProductRepository repo;

	public ProductService(ProductRepository repo) {
		this.repo = repo;
	}

	public List<Product> listAll() {
		return repo.findAll();
	}
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public Product get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
