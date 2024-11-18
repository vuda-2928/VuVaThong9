package screen

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable
import katalon.common.BaseKeyword


public class HomeScreen extends BaseKeyword{

	public void tapOnAccessibilityBtn() {
		//		Mobile.tap(findTestObject('Android/Screen - Home/Button - Accessibility'), GlobalVariable.timeout)

		// gọi từ BaseKeyWord
		tap('Android/Screen - Home/Button - Accessibility', 1)
	}
}
