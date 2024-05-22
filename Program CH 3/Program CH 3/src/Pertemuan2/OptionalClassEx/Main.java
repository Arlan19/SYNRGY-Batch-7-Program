package Pertemuan2.OptionalClassEx;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Membuat objek kategori
        CategoryType categoryType = new CategoryType("Iphone");
        Category category = new Category("Electronics", Optional.of(categoryType));
        // Membuat objek detail produk dengan kategori
        DetailProduct detailProduct = new DetailProduct("Smartphone", Optional.of(category));
        // Membuat objek produk dengan detail produk
        Product product = new Product("iPhone", Optional.of(detailProduct));

        // Mendapatkan nama produk
        String productName = product.getName();
        System.out.println("Product Name: " + productName);

        // Mendapatkan deskripsi produk
        String productDescription = product.getDetailProduct()
                .map(DetailProduct::getDescription)
                .orElse("No description available");
        System.out.println("Product Description: " + productDescription);

        // Mendapatkan nama kategori (jika tersedia)
        String categoryName = product.getDetailProduct()
                .flatMap(DetailProduct::getCategory)
                .map(Category::getName)
                .orElse("No category available");
        System.out.println("Category Name: " + categoryName);
    }

}
