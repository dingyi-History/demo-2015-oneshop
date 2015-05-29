package conndb;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//��ȡ���ݿ������ļ�
public class ReadProperties {

	private String username;
	private String userpwd;
	private String dbtype;
	private String dburl;
	private String dbdriver;

	private static ReadProperties readproperties = null;

	//����
	private ReadProperties() {

		readpropertiesfile();

	}

	//����ֹͬʱ���룬ֻnewһ�Σ�ֻ��һ�������ļ�
public static synchronized ReadProperties instance(){
		
		if(readproperties==null)
		{
			readproperties = new ReadProperties();
		}
		return readproperties;
	}

	// ��ȡ�ļ�
	private void readpropertiesfile() {
		Properties properties = new Properties();
		try {
			// ��ȡ�����ļ��Ķ�������
			InputStream inStream = getClass().getResourceAsStream(
					"/db.properties");
			// ����
			properties.load(inStream);
			// ���ζ�ȡ
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
