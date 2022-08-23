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

WebUI.openBrowser("$GlobalVariable.url")

for (def index : (0..GlobalVariable.loops)) {
    WebUI.waitForElementClickable(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Katalon Shop'), GlobalVariable.timeout)

    WebUI.verifyElementText(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Katalon Shop'), 'Katalon Shop')

    WebUI.click(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Katalon Shop'))

    WebUI.waitForElementClickable(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Cart'), GlobalVariable.timeout)

    WebUI.verifyElementText(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Cart'), 'CART')

    WebUI.click(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Cart'))

    WebUI.waitForElementClickable(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Checkout'), GlobalVariable.timeout)

    WebUI.verifyElementText(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Checkout'), 'CHECKOUT')

    WebUI.click(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Checkout'))

    WebUI.waitForElementClickable(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_My account'), GlobalVariable.timeout)

    WebUI.verifyElementText(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_My account'), 'MY ACCOUNT')

    WebUI.click(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_My account'))

    WebUI.waitForElementClickable(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Sample Page'), GlobalVariable.timeout)

    WebUI.verifyElementText(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Sample Page'), 'SAMPLE PAGE')

    WebUI.click(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Sample Page'))

    WebUI.waitForElementClickable(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Shop'), GlobalVariable.timeout)

    WebUI.verifyElementText(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Shop'), 'SHOP')

    WebUI.click(findTestObject('Page_Katalon Shop  Katalon Ecommerce/a_Shop'))
}

WebUI.closeBrowser()

