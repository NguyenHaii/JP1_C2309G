package Controller;


import Entity.Product;
import ExceptionValidation.InvalidProducCodeException;
import ExceptionValidation.InvalidProducNameException;
import ExceptionValidation.InvalidProducQuantityException;
import Service.ProductService;
import Validation.Validation;

public class ProductController {
    private ProductService productService;
    public ProductController (){;}

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void add(Product product){
        boolean isCodeValid = Validation.isProductCode(product.getCode());
        boolean isNameValid = Validation.isProductName(product.getName());
        boolean isQuantityValid = Validation.isNumberInteger(String.valueOf(product.getQuantity()));

        if (isCodeValid && isNameValid && isQuantityValid) {
            productService.add(product);



        } else {
            if (!isCodeValid) {
                throw new InvalidProducCodeException("Sai Code");
            }
            }
            if (!isNameValid) {
                throw new InvalidProducQuantityException("Sai Quantity");
            }
            if (!isQuantityValid) {
                throw new InvalidProducNameException("Sai Name");
            }
        }


}
