/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.Dao;
import com.pojo.MovieItem;
import com.validator.addValidator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.context.ApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author root
 */
public class AddController extends SimpleFormController {
    
    public AddController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(MovieItem.class);
        setCommandName("MovieItem");
        setSuccessView("add-success");
        setFormView("add");
        setValidator(new addValidator());
    }
    
//    @Override
//    protected void doSubmitAction(Object command) throws Exception {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
//    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
            MovieItem movie = (MovieItem) command;
            HttpSession session = request.getSession();
//            RequestDispatcher requestDispatcher;
//            String title="null";
//            String actor="null";
//	    String actress="null";
//	    String genre="null";
//	    String yearS="null" ;
//	    Integer year=0;
//            try{
//            title=request.getParameter("title");
//            actor = request.getParameter("actor");
//	    actress = request.getParameter("actress");
//	    genre = request.getParameter("genre");
//	    yearS = request.getParameter("year");
////            if(title==null&actor==null&actress==null&genre==null&year==0){
////                throw new Exception();
////            }
//	    year=Integer.parseInt(yearS);
//            }catch(Exception e){
//                requestDispatcher = request.getRequestDispatcher("error.html");
//                requestDispatcher.forward(request, response);
//            }

            ModelAndView mv = null;
            
//            ServletContext sc = request.getServletContext();
//
//            ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
            Dao m = new Dao();
            int addM=m.addMovie(movie);
            if(addM==1) {
//                    MovieItem movieItem=new MovieItem(title, actor, actress, genre, year);
//                    session.setAttribute("movieAtt",movieItem );
//                    requestDispatcher = request.getRequestDispatcher("addPage.jsp");
//                requestDispatcher.forward(request, response);
                    mv = new ModelAndView(getSuccessView(),"movie",movie);

            }
            else {
                    mv = new ModelAndView("add-error");
                }
            return mv;
            
    	
	}


    
     
}
