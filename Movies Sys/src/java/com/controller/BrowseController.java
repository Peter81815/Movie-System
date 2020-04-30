/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.Dao;
import com.pojo.ID;
import com.pojo.MovieItem;
import com.validator.addValidator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author root
 */
public class BrowseController extends SimpleFormController {
    
    public BrowseController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(ID.class);
        setCommandName("search");
        setSuccessView("search-success");
//        setFormView("search");
//        setValidator(new addValidator());
    }
    
    @Override
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
         //ModelAndView mv = null;
         ModelAndView mv = new ModelAndView(getSuccessView());
         ID idobject = (ID) command;
         Dao dao = new Dao();
          String keyword=request.getParameter("keyword");
                int id = Integer.parseInt(keyword);
         //int id = idobject.getId();
         MovieItem movie = dao.getMovie(id);
          mv = new ModelAndView(getSuccessView(),"movie",movie);
//         MovieItem movie=new MovieItem();
//         movie.setActor(m.getActor());
//         movie.setActress(m.getActress());
//         movie.setTitle(m.getTitle());
//         movie.setGenre(m.getGenre());
//         movie.setYear(m.getYear());
//         HttpSession session = request.getSession();
//         String keyword=request.getParameter("keyword");
//                int id = Integer.parseInt(keyword);
//                Dao m = (Dao) getApplicationContext().getBean("movieDAO");
//                MovieItem movie=m.getMovie(id);
//                if(movie==null||keyword==""){
//                    mv = new ModelAndView("search-error");
//                }
//                else{
//                    mv = new ModelAndView(getSuccessView(),"movie",movie);
//                }
//                
        //Do something...
        return mv;
    }
     
}
