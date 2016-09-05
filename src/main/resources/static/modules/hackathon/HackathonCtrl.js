// app.js
// create our angular app and inject ngAnimate and ui-router
// =============================================================================
angular.module('formApp', ['ngAnimate', 'ui.router'])

// configuring our routes
// =============================================================================
    .config(function($stateProvider, $urlRouterProvider) {

        $stateProvider

        // route to show our basic form (/form)
            .state('form', {
                url: '/gorrion',
                templateUrl: 'gorrion.tpl.html',
                controller: 'formController'
            })

            // nested states
            // each of these sections will have their own view
            // url will be nested (/form/profile)
            .state('form.paloma', {
                url: '/paloma',
                templateUrl: 'paloma.tpl.html'
            })

            // url will be /form/interests
            .state('form.aguila', {
                url: '/aguila',
                templateUrl: 'aguila.tpl.html'
            })

            // url will be /form/payment
            .state('form.payment', {
                url: '/payment',
                templateUrl: 'payment.tpl.html'
            });

        // catch all route
        // send users to the form page
        $urlRouterProvider.otherwise('/form/gorrion');
    })

    // our controller for the form
    // =============================================================================
    .controller('formController', function($scope) {

        // we will store all of our form data in this object
        $scope.formData = {};

        // function to process the form
        $scope.processForm = function() {
            alert('awesome!');
        };

    });

