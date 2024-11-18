package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object timeout
     
    /**
     * <p></p>
     */
    public static Object shortTimeout
     
    /**
     * <p></p>
     */
    public static Object userName
     
    /**
     * <p></p>
     */
    public static Object accessKey
     
    /**
     * <p></p>
     */
    public static Object platformName
     
    /**
     * <p></p>
     */
    public static Object platformVersion
     
    /**
     * <p></p>
     */
    public static Object deviceName
     
    /**
     * <p></p>
     */
    public static Object appPath
     
    /**
     * <p></p>
     */
    public static Object currentProjDir
     
    /**
     * <p></p>
     */
    public static Object appId
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            timeout = selectedVariables['timeout']
            shortTimeout = selectedVariables['shortTimeout']
            userName = selectedVariables['userName']
            accessKey = selectedVariables['accessKey']
            platformName = selectedVariables['platformName']
            platformVersion = selectedVariables['platformVersion']
            deviceName = selectedVariables['deviceName']
            appPath = selectedVariables['appPath']
            currentProjDir = selectedVariables['currentProjDir']
            appId = selectedVariables['appId']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
