package utility;
import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import reusable.WebUtils;


public class AppiumServer {
	
public static AppiumDriverLocalService service;

	public AppiumServer() {
		
		File appiumPath=new File("C:\\Users\\Praveen Kurra\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		File nodePath=new File("C:\\Program Files\\nodejs\\node.exe");
		 service=new AppiumServiceBuilder()
				.withAppiumJS(appiumPath)
				.usingDriverExecutable(nodePath)
				.usingPort(4723)
				.withLogFile(new File("./appiumLogs/"+WebUtils.getCurrentDateTimeFormat()+"/logs.txt")).build();
		 
		 service.start();
		
				
	}
	public void closeServer() {
		
		
		service.stop();
		
		
		
	}
	
	
}
