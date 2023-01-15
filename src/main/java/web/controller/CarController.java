package web.controller;

import Service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    private final CarServiceImpl carService = new CarServiceImpl();

    @RequestMapping(value = "/cars")
    public String printWelcome(@RequestParam(value="count", required=false, defaultValue="0") String count, ModelMap model) {
        model.addAttribute("cars", carService.getListByCount(Integer.parseInt(count)));
        return "cars";
    }
}
