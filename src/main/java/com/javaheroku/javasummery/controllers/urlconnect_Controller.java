package com.javaheroku.javasummery.controllers;

import com.javaheroku.javasummery.controllers.week01.week01_coluction_function;
import com.javaheroku.javasummery.controllers.week01.week01_htmlrequest_getsides;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class urlconnect_Controller {
    
    @RequestMapping("/url_homePage")
    public String url_homePage(){
        return "url_homePage";
    }
    
    @GetMapping("/week01")
    public String Get_week01(Model model){
        week01_htmlrequest_getsides triangle_sides = new week01_htmlrequest_getsides();  //side_a,side_b,side_c
        model.addAttribute("triangle_sides", triangle_sides);
        return "week01";
    }

    @PostMapping("/week01")
    public String Post_week01(@ModelAttribute week01_htmlrequest_getsides triangle_sides, Model model) {
        
        week01_coluction_function ans = new week01_coluction_function();

        double side_a = triangle_sides.getSide_a();
        double side_b = triangle_sides.getSide_b();
        double side_c = triangle_sides.getSide_c();
        
        model.addAttribute("triangle_sides", triangle_sides);
        model.addAttribute("area", ans.main(side_a,side_b,side_c));
        
        return "week01";
    }

    

}
