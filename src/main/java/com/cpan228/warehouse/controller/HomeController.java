/*
 * Class below is the controller for the Home Page for the / route 
 */

package com.cpan228.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// annotation packages imported 

@Controller
@RequestMapping("/")
// annotate the class as a controller and set the route to /
public class HomeController {

  @RequestMapping
  // annotate this method in order for routing to function.
  public String home() {
    return "home";
  }

}
