import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import screen.AccessibilityNodeQueryingScreen as AccessibilityNodeQueryingScreen
import screen.AccessibilityScreen as AccessibilityScreen
import screen.HomeScreen as HomeScreen
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//apps is started from TestListner
HomeScreen homeScreen = new HomeScreen()

AccessibilityScreen accessibilityScreen = new AccessibilityScreen()

AccessibilityNodeQueryingScreen accessibilityNodeQueryingScreen = new AccessibilityNodeQueryingScreen()

homeScreen.tapOnAccessibilityBtn()

accessibilityScreen.tapOnAccessibilityNodeQueryingBtn()

accessibilityNodeQueryingScreen.doubleTapOnConquerWorldCheckBox()

Mobile.verifyElementAttributeValue(findTestObject('Android/Screen - Accessibility Node Querying/Checkbox - Conquer World'), 
    'checked', 'false', 1)

