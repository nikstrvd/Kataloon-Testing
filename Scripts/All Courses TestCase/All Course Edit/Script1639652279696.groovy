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

WebUI.callTestCase(findTestCase('All Courses TestCase/All Courses'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Courses List - TMS/input_Search_form-control form-control-sm'), 'selenium')

WebUI.click(findTestObject('Object Repository/Page_Courses List - TMS/a_online_dropdown-toggle rounded-bdr'))

WebUI.click(findTestObject('Object Repository/Page_Courses List - TMS/a_Edit'))

WebUI.navigateToUrl('http://backend.tmsapp.2stallions.site/admin/coursemain/edit/2')

WebUI.click(findTestObject('Object Repository/Page_Edit Course - TMS/span_WSQ'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Course - TMS/input_Copyright  Designed  Developed by2021_1658af'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Edit Course - TMS/div_Reference Number                       _e83760'))

WebUI.click(findTestObject('Object Repository/Page_Edit Course - TMS/button_Update'))

WebUI.closeBrowser()

