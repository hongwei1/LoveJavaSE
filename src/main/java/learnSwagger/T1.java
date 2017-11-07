package learnSwagger;
import io.swagger.parser.SwaggerParser;
import io.swagger.models.Swagger;
import io.swagger.parser.util.SwaggerDeserializationResult;
import io.swagger.util.Json;

import java.util.List;

// ... your code

// read a swagger description from the petstore
  
public class T1
{
	public static void main(String[] strings)
	{
		Swagger swagger = new SwaggerParser().read("/Users/zhanghongwei/Documents/workspaceScala/LoveJavaSE/src/main/resources/1.json");
//		Swagger swagger = new SwaggerParser().read("http://petstore.swagger.io/v2/swagger.json");

		System.out.println(Json.pretty(swagger));
		SwaggerDeserializationResult result=new SwaggerParser().readWithInfo(Json.pretty(swagger));
		List<String> message=result.getMessages();
			System.out.println("result : "+message.size());
		
	}

}