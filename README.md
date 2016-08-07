
# Onboarding App

## Requirements
 - JDK 8
 - Node

## Commands

### To run app
1. First install node modules dependencies (on the package json there is a postinstall task to install bower dependencies)

``npm install``

2. Run grunt tasks to generate css files

``node_modules/grunt-cli/bin/grunt build``

3. Finally run the app

``./gradlew clean bootRun``

If you will be working updating 
### To run test

``./gradlew clean test``

### To run cucumber specs

``./gradlew clean cucumber``

## UI 

The css file needs to be generated to see the page with the corresponding design. There is a grunt task to build it.
``node_modules/grunt-cli/bin/grunt build``

If you are working and do you need to update any style. The file to change is _src/main/resources/scss/styles.css_

### UI commands

#### Build the css
``node_modules/grunt-cli/bin/grunt build``

#### Watch
This task watch the files localized in _src/main/resources/scss/_, if any of those change, the the build css task is executed, and css are generated.

To run this task open a new console and do: 

``node_modules/grunt-cli/bin/grunt watch``

### To run karma tests

``node_modules/.bin/karma start --single-run``

### Build Docker image

``./gradlew clean npmInstall buildDocker``
