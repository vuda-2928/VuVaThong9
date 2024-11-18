package katalon.common

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil


class BaseKeyword {
	protected static info(String message){
		KeywordUtil.logInfo(message)
	}
	protected static handleError(String message, FailureHandling flowControl){
		ErrorHandler.handleError(message, flowControl)
	}

	protected static handleError(Exception ex, FailureHandling flowControl){
		ErrorHandler.handleError(ex, flowControl)
	}

	public void tap(String objPath, int timeout) {
		Mobile.tap(findTestObject(objPath), timeout)
	}
}
