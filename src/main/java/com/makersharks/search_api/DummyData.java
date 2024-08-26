package com.makersharks.search_api;

public class DummyData {
  
    public static void createDummyData() {
      Supplier supplier1 = new Supplier();
      supplier1.setCompanyName("Acme Inc.");
      supplier1.setWebsite("https://acme.com");
      supplier1.setLocation("India");
      supplier1.setNatureOfBusiness("small_scale");
      supplier1.setManufacturingProcesses("3d_printing, moulding");
      
      Supplier supplier2 = new Supplier();
      supplier2.setCompanyName("Best Suppliers");
      supplier2.setWebsite("https://bestsuppliers.com");
      supplier2.setLocation("USA");
      supplier2.setNatureOfBusiness("medium_scale");
      supplier2.setManufacturingProcesses("casting, coating");
      
      Supplier supplier3 = new Supplier();
      supplier3.setCompanyName("Makersharks");
      supplier3.setWebsite("https://makersharks.com");
      supplier3.setLocation("India");
      supplier3.setNatureOfBusiness("large_scale");
      supplier3.setManufacturingProcesses("3d_printing, moulding, casting");
      
      // Add more suppliers as needed
      
      // Save the suppliers to the database
      // (we'll implement this later)
    }
  }
