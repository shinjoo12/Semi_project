package com.ohgiraffers.semi_project;
package com.springframework.stereotype.Controller;

@Controller
public class MapController{

    @GetMapping("/map")
    public String showMap(Model model) {


        return "map";
    }
}