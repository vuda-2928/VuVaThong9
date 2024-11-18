
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.model.FailureHandling


 /**
	 * Verify two images are matched or not
	 * @param expectedImgPath the location of expected image
	 * @param actualImgPath the location of actual image
	 * @return
	 */ 
def static "webdriver.screenshot.TakeScreenshot.takeScreenshot"(
    	String expectedFilename	
     , 	FailureHandling flowControl	) {
    (new webdriver.screenshot.TakeScreenshot()).takeScreenshot(
        	expectedFilename
         , 	flowControl)
}


def static "webdriver.screenshot.TakeScreenshot.takeScreenshot"(
    	String expectedFilename	) {
    (new webdriver.screenshot.TakeScreenshot()).takeScreenshot(
        	expectedFilename)
}

 /**
	 * Verify two images are matched or not
	 * @param expectedImgPath the location of expected image
	 * @param actualImgPath the location of actual image
	 * @return
	 */ 
def static "katalon.verifyImage.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	
     , 	FailureHandling flowControl	) {
    (new katalon.verifyImage.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath
         , 	flowControl)
}


def static "katalon.verifyImage.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	) {
    (new katalon.verifyImage.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath)
}
