package hu.tigra.pti.geb.page

import geb.Page
import geb.module.Checkbox
import geb.module.RadioButtons
import hu.tigra.pti.geb.module.Date
import hu.tigra.pti.geb.module.ErrorMessages


class RegisterPage extends Page {

    static url = 'index.php?controller=authentication&back=my-account#account-creation'

    static at = { header.text() == 'CREATE AN ACCOUNT' }

    static content = {
        header { $('h1[class="page-heading"]') }
        gender { $('input[type="radio"][name="id_gender"]').module(RadioButtons) }
        firstName { $('input[id="customer_firstname"]') }
        lastName { $('input[id="customer_lastname"]') }
        password { $('input[id="passwd"]') }
        days { $('select[id="days"]') }
        months { $('select[id="months"]')}
        years { $('select[id="years"]')}
        newsletter { $('input[id="newsletter"]').module(Checkbox)}
        offers { $('input[id="optin"]').module(Checkbox)}
        registerButton { $('button[id="submitAccount"]')}
        errorMessages(required: false) { $('div[class="alert alert-danger"]:first-of-type').module ErrorMessages }
        firstName2 { $('input[id="firstname"]')}
        lastName2 { $('input[id="lastname"]')}
        company {$('input[id="company"]')}
        address {$('input[id="address1"]')}
        address2 {$('input[id="address2"]')}
        city {$('input[id="city"]')}
        state {$('select[id="id_state"]')}
        postcode {$('input[id="postcode"]')}
        country { $('select[id="id_country"]')}
        other {$('input[id="other"]')}
        phone {$('input[id="phone"]')}
        phonem {$('input[id="phone_mobile"]')}
        alias {$('input[id="alias"]')}
    }
}
