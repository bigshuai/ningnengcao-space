package net.ningmengcao.space.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.Properties;

/**
 * 全局常量定义
 * 
 * @author Vernon.Chen
 * @date 2012-11-22
 */
@SuppressWarnings("serial")
public class Constant implements Serializable {

	// ************************* 网站路径配置 *************************

	public static String DOMAIN = "http://www.ningmengcao.net";

	public static String JS_BASE_URL = DOMAIN + "/js";

	public static String CSS_BASE_URL = DOMAIN + "/css";

	public static String IMG_BASE_URL = DOMAIN + "/img";

	public static String PLUGIN_BASE_URL = DOMAIN + "/plugin";

	// ************************* 邮件配置 *************************

	private static Properties properties = new Properties();

	static {
		try {
			Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources("constant.properties");
			if (urls == null || !urls.hasMoreElements()) {
				System.out.println("no constant config find! please put constant.properties  in your classpath");
			}
			if (urls.hasMoreElements()) {
				String filepath = urls.nextElement().getFile();
				filepath = URLDecoder.decode(filepath, "utf-8");
				System.out.println("constant filepath:" + filepath);

				properties.load(new FileInputStream(new File(filepath)));

				if (properties.getProperty("DOMAIN") != null) {
					DOMAIN = properties.getProperty("DOMAIN");
					System.out.println("init constant.DOMAIN=" + DOMAIN);
				}

				if (properties.getProperty("JS_BASE_URL") != null) {
					JS_BASE_URL = properties.getProperty("JS_BASE_URL");
					System.out.println("init constant.JS_BASE_URL=" + JS_BASE_URL);
				}

				if (properties.getProperty("CSS_BASE_URL") != null) {
					CSS_BASE_URL = properties.getProperty("CSS_BASE_URL");
					System.out.println("init constant.CSS_BASE_URL=" + CSS_BASE_URL);
				}

				if (properties.getProperty("IMG_BASE_URL") != null) {
					IMG_BASE_URL = properties.getProperty("IMG_BASE_URL");
					System.out.println("init constant.IMG_BASE_URL=" + IMG_BASE_URL);
				}

				if (properties.getProperty("PLUGIN_BASE_URL") != null) {
					PLUGIN_BASE_URL = properties.getProperty("PLUGIN_BASE_URL");
					System.out.println("init constant.PLUGIN_BASE_URL=" + PLUGIN_BASE_URL);
				}

				System.out.println("constant init success!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 更具Key获取Value
	 * 
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {
		return getProperty(key, "");
	}

	/**
	 * 更具Key获取Value, 没有取到给默认值
	 * 
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static String getProperty(String key, String defaultValue) {
		return properties.getProperty(key, defaultValue);
	}

	public static void main(String[] args) {
		// Constant constant = new Constant();
	}
}
