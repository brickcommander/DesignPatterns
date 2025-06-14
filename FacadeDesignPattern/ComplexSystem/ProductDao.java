package FacadeDesignPattern.ComplexSystem;

import FacadeDesignPattern.model.Product;

public interface ProductDao {
    Product getProduct(int id);
}
