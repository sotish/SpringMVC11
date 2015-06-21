package com.sat.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Hello {
	@RequestMapping(value="/hello2")

	public  String sayHello(Model model){

		return "hello from hello2 Controller";
	}

	/*@Value("${name}")
	private String name;

	@RequestMapping(value="/hello", method=RequestMethod.GET)

	public  String 	sayHello2(Model model){

		model.addAttribute("name");

		return "hello";
	}*/



		@RequestMapping( value="/well3", method=RequestMethod.GET )
		public String well(Model model) {
			   // let’s pass some variables to the view script
			   model.addAttribute("wisdom", "Goodbye XML");

			   // renders /WEB-INF/views/hello.jsp
			   return "well3";
			}

	@RequestMapping(value ="/hello3")

		public String wellPage(ModelAndView modelAndView) {

//model.mergeAttributes(model);
			return "hello3";
		}

		@RequestMapping("/well2")

		public ModelAndView wellPage2(ModelAndView modelAndView) {

			modelAndView.addObject("well2");


			return modelAndView;
		}

		@RequestMapping("/well1")

		public ModelAndView well1(ModelAndView modelAndView) {

			modelAndView.addObject("well1");


			return modelAndView;
		}


		   /* @RequestMapping(value="/WEB-INF/views/well3")

		    public ModelAndView wellPage3(ModelAndView modelAndView) {
				//ModelMap model = new ModelMap();
		    	//ModelAndView modelView= new ModelAndView("");
				//model.addAttribute("well, model);
				return modelAndView;
			}*/

	}



