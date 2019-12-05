package examples;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class HashMapEx {

	public static Map<String, Properties> propertiesHashMap = new HashMap<String, Properties>();
	public static Properties oProp;
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        System.out.println(getproperty("password"));
	}
	public static String getproperty(String propkey) throws Exception
	{
		oProp=getProperties(propkey);
		return oProp.getProperty(propkey);
	}
	
	public static Properties getProperties(String propKey) throws Exception{

		try {
			if(!propertiesHashMap.containsKey(propKey))
				loadPropertiesHashMap(propKey);

			return propertiesHashMap.get(propKey);
		}
		catch (Exception e){
			e.printStackTrace();
			return null;
		}

	}
	
	public static void loadPropertiesHashMap(String propFileName) throws Exception {

		Properties property;
		
		String directoryPath = System.getProperty("user.dir") + "/app.properties";
		property = new Properties();
		FileInputStream fis = new FileInputStream(directoryPath);
		property.load(fis);
		propertiesHashMap.put(propFileName,property);

	}

}
