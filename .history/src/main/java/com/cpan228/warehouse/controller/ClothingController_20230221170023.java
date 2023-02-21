package com.cpan228.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")

public class ClothingController {

  @RequestMapping

  public String clothes() {
    return "clothes";
  }

}
