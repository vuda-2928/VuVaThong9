package screen

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable

public class AccessibilityNodeQueryingScreen {

	public void doubleTapOnConquerWorldCheckBox() {
		Mobile.doubleTap(findTestObject('Android/Screen - Accessibility Node Querying/Checkbox - Conquer World'), GlobalVariable.timeout)
	}
}
