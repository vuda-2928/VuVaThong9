import org.openqa.selenium.remote.DesiredCapabilities

import com.katalon.KatalonHelper
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.mobile.driver.MobileDriverType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable


class TestListener {
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		KatalonHelper.updateInfo()
	}

	@BeforeTestCase
	def startApplication() {
		if (GlobalVariable.deviceName) {
			'start application in BrowserStack'
			String browserStackServerURL = "https://" + GlobalVariable.userName + ":" + GlobalVariable.accessKey + "@hub-cloud.browserstack.com/wd/hub"
			DesiredCapabilities capabilities = new DesiredCapabilities()
			HashMap<String, Object> bstackOptions = new HashMap<String, Object>()
			bstackOptions.put("userName", GlobalVariable.userName)
			bstackOptions.put("accessKey", GlobalVariable.accessKey)
			capabilities.setCapability("platformName", GlobalVariable.platformName)
			capabilities.setCapability("appium:platformVersion", GlobalVariable.platformVersion)
			capabilities.setCapability("appium:deviceName", GlobalVariable.deviceName)
			capabilities.setCapability("appium:app", GlobalVariable.appPath)
			capabilities.setCapability("bstack:options", bstackOptions)
			AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(browserStackServerURL))
		} else {
			'start application on real device'
			Mobile.startApplication(GlobalVariable.currentProjDir + GlobalVariable.appPath, true)
		}
	}

	@AfterTestCase
	def closeApplication() {
		Mobile.closeApplication()
	}
}
