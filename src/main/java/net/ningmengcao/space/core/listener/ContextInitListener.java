package net.ningmengcao.space.core.listener;

import net.ningmengcao.space.core.Constant;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * @author Vernon.Chen
 */
public class ContextInitListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent contServletContextEvent) {
        // TODO Auto-generated method stub

    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().setAttribute("DOMAIN", Constant.DOMAIN);
        servletContextEvent.getServletContext().setAttribute("JS_BASE_URL", Constant.JS_BASE_URL);
        servletContextEvent.getServletContext().setAttribute("CSS_BASE_URL", Constant.CSS_BASE_URL);
        servletContextEvent.getServletContext().setAttribute("IMG_BASE_URL", Constant.IMG_BASE_URL);
        servletContextEvent.getServletContext().setAttribute("PLUGIN_BASE_URL", Constant.PLUGIN_BASE_URL);
    }

}
