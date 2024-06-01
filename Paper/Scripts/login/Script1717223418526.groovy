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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()



def testData = [[('Email') : ''],
	[('Email') : 'alo.com'],
	[('Email') : 'alo@mail.com'],
	[('Email') : 'kandidat@paper.id']]

for (def data : testData) {
def email = data['Email']


WebUI.setText(findTestObject('login/txt_email'), email)

WebUI.click(findTestObject('login/btn_selanjutnya'))
}


def testData1 = [[('Password') : ''],
	[('Password') : 'paperid'],
	[('Password') : 'paper.id']]

for (def data : testData1) {
def password = data['Password']


WebUI.setText(findTestObject('login/txt_password'), password)

WebUI.click(findTestObject('login/btn_masuk'))


}

WebUI.verifyElementVisible(findTestObject('login/verif_success'))

