package com.iot.spring.common.aspect;

import java.io.IOException;

import javax.inject.Inject;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.iot.spring.dao.NaverTransDAO;



@Service
@Aspect
public class LogPrintAspect {
	private static final Logger logger = LoggerFactory.getLogger(LogPrintAspect.class);
	@Inject
	NaverTransDAO na;
	
	@Before("execution(* com.iot.spring.controller.*Controller.*(..))")//포인트키 url컨트롤러에있는 모든 메소드들을 가져다 쓸수있다
	public void beforeLog(JoinPoint jp) {
		logger.info("@Before=>{}",jp);
		
	}
	@Around("execution(* com.iot.spring.controller.*Controller.*(..))")
	public Object aroundLog(ProceedingJoinPoint pjp) throws IOException {
		logger.info("@Around begin");
		Object obj=null;
		long startTime=System.currentTimeMillis();
		try {
			obj=pjp.proceed();//실행시점
		}catch(Throwable e){
			logger.error("@Around error=>{}",e);
			ModelAndView mav=new ModelAndView("error/error");
			
			
			mav.addObject("errorMsg",na.getText(e.getMessage()));
			return mav;
		}
		logger.info("Around end,RunTime:{}ms",(System.currentTimeMillis()-startTime));
		return obj;
	}
	
	@After("execution(* com.iot.spring.controller.*Controller.*(..))")
	public void afterLog(JoinPoint jp) {
		logger.info("@after=>{}",jp);
		
	}
}
