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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://flip.id/login')

WebUI.setText(findTestObject('Object Repository/Page_Login/Input Email'), 'm.fauzan.afianto@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/Input Password'), 'DckXWtD/9LOnxpHoHTUHFQ==')

WebUI.click(findTestObject('Object Repository/Page_Login/Button MASUK'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Beranda/Button Kirim Uang'))

WebUI.click(findTestObject('Object Repository/Page_Beranda/Button Kirim Uang'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kirim Uang/Title Kirim Uang Page'), 'Kirim Uang')

WebUI.click(findTestObject('Object Repository/Page_Kirim Uang/button_OK, DATA SUDAH BENAR'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Kirim Uang/div_Pilih rekening yang digunakan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Kirim Uang/div_Pilih rekening tujuan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Kirim Uang/div_Masukkan nomor rekening'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Kirim Uang/div_Minimal nominal Rp10.000'))

