package ou.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ouyang on 2014/9/26.
 */
@Controller
@RequestMapping("demo")
public class DemoController {

    private static final Logger LOGGER =  LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView Greeting(@RequestParam(value = "name",required = false) String name){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","你好，"+name);
        mv.setViewName("index");

        LOGGER.debug(mv.getModel().get("msg").toString());

        return mv;
    }

    @RequestMapping(value = "/index2/{name}",method = RequestMethod.GET)
    public ModelAndView Greeting2(@PathVariable("name") String name){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","你好，"+name);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    //public Response
}