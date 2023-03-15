package com.cpan228.warehouse.model;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "clothes") 
@Data

@Builder
public class Clothing {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "name")
  private String name;
  @Column(name = "year_produced")
  private int yearCreated;
  @Column(name = "price")
  private double price;
  @Enumerated(EnumType.STRING)
  @Column(name = "brand")
  private Branding brand;

  public static Clothing createClothing(String name, int yearCreated, double price, Branding brand)
   {
     
    return Clothing.builder()
      .name(name)

      .yearCreated(yearCreated)

      .price(price)

      .brand(brand)

      .build();
  }

  public enum Branding {
    BALENCIAGA("Balenciaga"), STONEISLAND("Stone Island"), MONCLER("Moncler"), CANADAGOOSE("Canada Goose"), PRADA("Prada"), LOUISVUITTON("Louie Vuitton");

    private String title;

    Branding(String title) { this.title = title; }

    public String getTitle() { return title; }
  }
}
