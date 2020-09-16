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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Kirim Uang/select_-- Pilih Bank --MandiriBRIBNI  BNI S_783f60'), 
    'tabungan_pensiunan_nasional', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Kirim Uang/select_-- Pilih Bank --MandiriBRIBNI  BNI S_783f60_1'), 
    'tabungan_pensiunan_nasional', true)

WebUI.clearText(findTestObject('Object Repository/Page_Kirim Uang/input_REKENING TUJUAN_account_number'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Kirim Uang/input_REKENING TUJUAN_account_number'), '90011236271')

WebUI.click(findTestObject('Object Repository/Page_Kirim Uang/button_CEK NAMA'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Kirim Uang/input_REKENING TUJUAN_beneficiary_bank'), 
    'value', 'MUHAMMAD FAUZAN AFIANTO', 5)

WebUI.setText(findTestObject('Object Repository/Page_Kirim Uang/input_Rp_amount'), '10.000')

WebUI.click(findTestObject('Object Repository/Page_Kirim Uang/button_OK, DATA SUDAH BENAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kirim Uang/Konfirmasi No Rekening'), '90011236271')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kirim Uang/Konfirmasi Noiminal 1'), 'Rp10.000')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kirim Uang/Konfirmasi Noiminal 2'), 'Rp10.000')

WebUI.click(findTestObject('Object Repository/Page_Kirim Uang/a_LANJUT'))

WebUI.click(findTestObject('Object Repository/Page_Kirim Uang/a_SIAP, SAYA SETUJU'))

WebUI.click(findTestObject('Object Repository/Page_Konfirmasi Transaksi/span_Lihat'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Konfirmasi Transaksi/Konfirmasi 2 Rerekening Penerima'), 
    '90011236271')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Konfirmasi Transaksi/Konfirmasi 2 Nama Penerima'), 'MUHAMMAD FAUZAN AFIANTO')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Konfirmasi Transaksi/Konfirmasi 2 Nominal'), 'Rp10.000')

WebUI.click(findTestObject('Object Repository/Page_Konfirmasi Transaksi/button_BATALKAN TRANSAKSI'))

WebUI.click(findTestObject('Object Repository/Page_Konfirmasi Transaksi/button_YAKIN BANGET'))

