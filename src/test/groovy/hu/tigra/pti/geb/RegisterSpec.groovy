package hu.tigra.pti.geb
import geb.module.Checkbox
import hu.tigra.pti.geb.page.LoginPage
import hu.tigra.pti.geb.page.RegisterPage
import java.awt.Checkbox
import geb.Module

class RegisterSpec extends BaseSpec {

    def 'Regisztráció'() {
        given: 'Bejelentkező felületre navigálok'
        def loginPage = to LoginPage

        when: 'Kitöltöm a "CREATE AN ACCOUNT" blokkban az "Email address" mezőt egy még nem regisztrált email címmel és a "Create an account" funkciógombra kattintok.'
        loginPage.registerEmailAddress = 'teszt@email.com'
        loginPage.registerButton.click()

        then: 'Megjelenik a "Create an account" űrlap.'
        def registerPage = waitFor { at RegisterPage }

        when: 'Kitöltöm a "Your personal information" blokkban az összes mezőt és a "Register" funkciógombra kattintok.'
        registerPage.gender.checked = 'Mr.'
        registerPage.firstName = 'Elek'
        registerPage.lastName = 'Teszt'
        registerPage.password = 'teszt123'
        registerPage.years = '1990'
        registerPage.months = 'May '
        registerPage.days = '11'
        registerPage.newsletter.check()
        registerPage.offers.check()
        registerPage.registerButton.click()
        then: '5 hibaüzenet jelenik meg'
        registerPage.errorMessages.values.size() == 5
        when: 'Kitöltöm a Your Adress blockban az összes mezőt majd Register gombra kattintok'
        registerPage.password = 'teszt123' //register gombra kattintás után üres lesz a mező

        registerPage.firstName2='first'
        registerPage.lastName2='last'
        registerPage.company='greatcompany'
        registerPage.address='address'
        //registerPage.address2='address2'
        registerPage.city='city-1'
        registerPage.state='Ohio'
        registerPage.postcode='33333'
        registerPage.country='United States'
        //registerPage.other='aaaaaaaaaaa'
        registerPage.phone='+36301111111'
        registerPage.phonem='+36301111111'
        registerPage.alias='sad'
        registerPage.registerButton.click()
        then: 'Megjelenik felhasználó adatai felület'
        waitFor { at MyAccountPage }
    }
}
