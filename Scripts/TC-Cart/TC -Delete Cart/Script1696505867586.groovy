import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log in (2)'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_loginusername (2)'), 'userinfo')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_Password_loginpassword (2)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Log in (2)'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Samsung galaxy s6 (1)'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart (1)'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart (1)'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Delete (1)'))

if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_STORE/td_Samsung galaxy s6'), 5))
	{
		KeywordUtil.markPassed("Berhasil delete cart")
	}
	else
	{
		KeywordUtil.markFailed("Tidak berhasil delete cart")
	}
	

