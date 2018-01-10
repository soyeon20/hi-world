package com.choice.food.controller.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.choice.food.model.common.ProductVO2;

@RestController
public class Common2Controller {
	private static final Logger logger = LoggerFactory.getLogger(Common2Controller.class);

	@ResponseBody
	@RequestMapping("sample/doF")
    public ProductVO2 doF(){
        // doF.jsp로 json 데이터가 리턴
        return new ProductVO2("스마트폰", 990000);
    }


}
