package steps

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)


Given(~'^a glober who wants to know available tutorials$') { ->
}

When(~'^ask for the newest tutorials$') { ->
}

Then(~'^will see a tutorial for "TDD" by "fcayrol"') { ->
}

And(~'^will see tutorials for "Angular" by "mrolon"') { ->
}

And(~'^will see tutorials for "How to be a police" by "ppessolano"') { ->
}
