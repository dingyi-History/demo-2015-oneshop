package conndb;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//读取数据库配置文件
public class ReadProperties {

	private String username;
	private String userpwd;
	private String dbtype;
	private String dburl;
	private String dbdriver;

	private static ReadProperties readproperties = null;

	//单例
	private ReadProperties() {

		readpropertiesfile();

	}

	//锁防止同时进入，只new一次，只读一次配置文件
public static synchronized ReadProperties instance(){
		
		if(readproperties==null)
		{
			readproperties = new ReadProperties();
		}
		return readproperties;
	}

	// 读取文件
	private void readpropertiesfile() {
		Properties properties = new Properties();
		try {
			// 获取配置文件的二进制流
			InputStream inStream = getClass().getResourceAsStream(
					"/db.properties");
			// 加载
			properties.load(inStream);
			// 依次读取
			username = properties.getProperty("username");
			userpwd = properties.getProperty("userpwd");
			dbtype = properties.getProperty("dbtype");
			dburl = properties.getProperty("dburl");
			dbdriver = properties.getProperty("dbdriver");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getDbtype() {
		return dbtype;
	}

	public void setDbtype(String dbtype) {
		this.dbtype = dbtype;
	}

	public String getDburl() {
		return dburl;
	}

	public void setDburl(String dburl) {
		this.dburl = dburl;
	}

	public String getDbdriver() {
		return dbdriver;
	}

	public void setDbdriver(String dbdriver) {
		this.dbdriver = dbdriver;
	}

	public static ReadProperties getReadproperties() {
		return readproperties;
	}

	public static void setReadproperties(ReadProperties readproperties) {
		ReadProperties.readproperties = readproperties;
	}
	
	
	
	

}
