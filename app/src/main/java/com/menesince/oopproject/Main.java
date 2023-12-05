package com.menesince.oopproject;

public class Main {
    public static void main(String[] args) {

//        Product product1 = new Product();
//
//        product1.setName("Delongi Coffee Machine");
//        product1.setDiscount(7);
//        product1.setUnitPrice(7500);
//        product1.setUnitInStock(3);
//        product1.setImageUrl("image1.jpg");
//
//        Product product2 = new Product();
//
//        product2.setName("kitchen aid Coffee Machine");
//        product2.setDiscount(7);
//        product2.setUnitPrice(7700);
//        product2.setUnitInStock(5);
//        product2.setImageUrl("image2.jpg");
//
//        Product product3 = new Product();
//
//        product3.setName("smeg Coffee Machine");
//        product3.setDiscount(7);
//        product3.setUnitPrice(7500);
//        product3.setUnitInStock(3);
//        product3.setImageUrl("image3.jpg");
//
//
//        Product[] products = {product1,product2,product3};
//        System.out.println("<ul>");
//        for (Product product : products ){
//            System.out.println( "<li>" + product.getName() + "</li>");
//        }
//        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0123478");
        individualCustomer.setFirstName("Menes");
        individualCustomer.setLastNAme("ince");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("0258963478");
        corporateCustomer.setTaxNumber("54321");
        System.out.println("Adı : " + individualCustomer.getFirstName());

        Customer[] customers = {individualCustomer,corporateCustomer};
        for (Customer customer:customers) {
            System.out.println(customer.getId());
        }

    }
}
