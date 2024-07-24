package com.amigoscode.customer;

public record customerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
    Customer customer=Customer.builder()
            .firstName(request.firstName())
            .lastName(request.lastName())
            .email(request.email())
            .build();
    customerRepository.save(customer);
    }
}
