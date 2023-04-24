import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class YamlReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YamlReading ymlRead = new YamlReading();
		ymlRead. readingYml();
		

	}
	
	private  void readingYml() {

		Yaml yaml = new Yaml();
		InputStream inputStream = this.getClass()
				  .getClassLoader()
				  .getResourceAsStream("customer.yaml");
		Map<String, Object> obj =  (Map<String, Object>) yaml.load(inputStream);
		System.out.println(obj);
		
	}

}
