package com.controller;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.BookRestaurant;
import com.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("book") BookRestaurant book) {

		return "showpage";
	}

	@ModelAttribute("hallList")
	public Map<String, String> populateHallType() {

		Map<String, String> serviceMap = new HashMap<String, String>();
		serviceMap.put("AC", "AC");
		serviceMap.put("NonAC", "NonAC");
		return serviceMap;

	}

	@RequestMapping(value = "/billDesk", method = RequestMethod.POST)
	public String calculateTotalCost(@Valid @ModelAttribute("book") BookRestaurant book, BindingResult result,
			ModelMap model) {
		String view = "";

		if (result.hasErrors()) {
			view = "showpage";
		} else {
			double cost = bookService.calculateTotalCost(book);
			model.addAttribute("cost", cost);
			view = "billdesk";
		}
		return view;
	}

}
