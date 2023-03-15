package com.cpan228.warehouse;

import com.cpan228.warehouse.model.Clothing;
import com.cpan228.warehouse.repository.ClothingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Warehouse {

  public static void main(String[] args) {
    SpringApplication.run(Warehouse.class, args);
  }
  @Bean
  public CommandLineRunner loadData(ClothingRepository repository) {
    return args -> {
      Clothing c1 = Clothing.createClothing("Balenciaga", 2022, 10.0, Clothing.Branding.BALENCIAGA);
      Clothing c2 = Clothing.createClothing("StoneIsland", 2021, 5.0, Clothing.Branding.STONEISLAND);
      repository.save(c1);
      repository.save(c2);
    };
  }

}
