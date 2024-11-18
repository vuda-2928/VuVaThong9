package screen

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable

public class AccessibilityScreen {

	public void tapOnAccessibilityNodeQueryingBtn() {
		Mobile.tap(findTestObject('Android/Screen - Accessibility/Button - Accessibility Node Querying'), GlobalVariable.timeout)
	}
}
