/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author root
 */
public class HomeController extends AbstractController {
    
    public HomeController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String page = request.getParameter("select");
        ModelAndView mv = null;
        if(page.equals("Add")){
            return new ModelAndView("transfer");
        }
        else if(page.equals("Browse")){
             return new ModelAndView("search");
        }
        else if(page.equals("transferSearch")){
            return new ModelAndView("transferSearch");
        }
        else{
            return new ModelAndView("index");
        }
    }
    
}
