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
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object User
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object countryISOCode
     
    /**
     * <p></p>
     */
    public static Object userName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            URL = selectedVariables['URL']
            User = selectedVariables['User']
            Password = selectedVariables['Password']
            countryISOCode = selectedVariables['countryISOCode']
            userName = selectedVariables['userName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
