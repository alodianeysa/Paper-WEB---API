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
import java.util.UUID as UUID

WebUI.click(findTestObject('Mitra/btn_mitra'))

WebUI.click(findTestObject('Mitra/Create/btn_mitra1'))

WebUI.click(findTestObject('Mitra/Create/btn_createMitra'))

WebUI.click(findTestObject('Mitra/Create/slc_tipeMitra'))

WebUI.click(findTestObject('Mitra/Create/slc_tipeClient'))

WebUI.click(findTestObject('Mitra/Create/slc_badanusaha'))

WebUI.click(findTestObject('Mitra/Create/slc_badanCV'))

def testData = [[('Mitra') : '', ('Name') : '', ('Email') : '', ('Phone') : ''], [('Mitra') : 'A001', ('Name') : 'Company'
        , ('Email') : 'alo.com', ('Phone') : '89966655'], [('Mitra') : '', ('Name') : 'Company', ('Email') : 'alo@mailcom'
        , ('Phone') : '56565655'], [('Mitra') : 'A001', ('Name') : 'Company', ('Email') : '', ('Phone') : '89966655']]

for (def data : testData) {
    def mitra = data['Mitra']

    def name = data['Name']

    def email = data['Email']

    def phone = data['Phone']

    WebUI.setText(findTestObject('Mitra/Create/txt_noMitra'), mitra)

    WebUI.setText(findTestObject('Mitra/Create/txt_name'), name)

    WebUI.setText(findTestObject('Mitra/Create/txt_email'), email)

    WebUI.setText(findTestObject('Mitra/Create/txt_phone'), phone)

    WebUI.click(findTestObject('Mitra/Create/btn_simpan'))

    WebUI.click(findTestObject('Mitra/Create/btn_simpan1'))
}

String randomString = UUID.randomUUID().toString().replaceAll('-', '').substring(0, 3)

def email_code = ('cks' + randomString) + '@gmail.com'

def namePartner =  ('PT ' + randomString)

def noPartner =  ('AA' + randomString)

WebUI.setText(findTestObject('Mitra/Create/txt_noMitra'), noPartner)

WebUI.setText(findTestObject('Mitra/Create/txt_name'), namePartner)

WebUI.setText(findTestObject('Mitra/Create/txt_email'), email_code)

WebUI.click(findTestObject('Mitra/Create/btn_simpan'))

WebUI.click(findTestObject('Mitra/Create/btn_simpan1'))

WebUI.click(findTestObject('Mitra/Create/btn_lanjut'))

WebUI.verifyElementVisible(findTestObject('Mitra/Create/verif_semuaMitra'))



