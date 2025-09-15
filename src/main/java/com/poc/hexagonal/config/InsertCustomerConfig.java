package com.poc.hexagonal.config;

import com.poc.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.poc.hexagonal.adapters.out.InsertCostumerAdapter;
import com.poc.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCostumerAdapter insertCustomerAdapter
    ) {
        return new InsertCustomerUseCase(
                findAddressByZipCodeAdapter,
                insertCustomerAdapter
        );
    }

}
