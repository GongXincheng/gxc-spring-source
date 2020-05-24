//package com.gxc.spring.demo.web;
//
//import com.gxc.spring.demo.web.config.RootConfig;
//import com.gxc.spring.demo.web.config.WebConfig;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//import javax.servlet.MultipartConfigElement;
//import javax.servlet.ServletRegistration;
//
///**
// * @author GongXincheng
// * @date 2020/4/29 17:30
// */
//public class GxcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		return new Class[]{RootConfig.class};
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		return new Class[]{WebConfig.class};
//	}
//
//	/**
//	 * TODO：会将一个或多个路径映射到[DispatcherServlet]上
//	 */
//	@Override
//	protected String[] getServletMappings() {
//		return new String[]{"/"};
//	}
//
//	/**
//	 * 处理multipart请求和文件上传
//	 */
//	@Override
//	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//		registration.setLoadOnStartup(1);
//		registration.setInitParameter("", "");
//
//		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp/gxc/uploads");
//		registration.setMultipartConfig(multipartConfigElement);
//	}
//}
