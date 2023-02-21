package com.cpan228.warehouse.model;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class Clothing {
  private int id;
  private String name;
  private int yearCreated;
  private double price;
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
