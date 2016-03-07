package steps

import com.fede.ArabiConverter


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)


ArabiConverter arabiConverter = new ArabiConverter()
Integer numeroAConvertir
String numeroConvertido

Given(~'^Si tengo el numero ([^"]*)$') { Integer numeroArabigo ->
    numeroAConvertir = numeroArabigo
}

When(~'^lo convierto$') { ->
    numeroConvertido = arabiConverter.convert(numeroAConvertir)
}

Then(~'^deberia ver ([^"]*)') { String numeroArabigo ->
    assert numeroConvertido == numeroArabigo
}

