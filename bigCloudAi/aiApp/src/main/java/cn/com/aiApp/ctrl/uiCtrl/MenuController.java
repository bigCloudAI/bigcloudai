package cn.com.aiApp.ctrl.uiCtrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 项目各个界面的请求地址
 *
 * @since 2017-03-28
 */
@RestController
@RequestMapping("/aiApp")
public class MenuController {

	/*@RequestMapping(value ="/index",method = RequestMethod.GET)
	public String index() {
		return "index";
	}*/
	@RequestMapping(value ="/index",method = RequestMethod.GET)
	 public ModelAndView login(){
	        ModelAndView mv = new ModelAndView("index");
	        return mv;
	    }
}
