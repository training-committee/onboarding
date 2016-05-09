
# Onboarding App

## Requirements
 - JDK 8
 - Node 0.12.9 (if you have installed another version see [Configure the node version](#configure-the-node-version) )

## Commands

To run app

``./gradlew clean bootRun``

To run test

``./gradlew clean test``

To run cucumber specs

``./gradlew clean cucumber``


## Configure the node version 
The node version required for the project is 0.12.9. If you have another version installed you can use [nvm](https://github.com/creationix/nvm) to manage the node version.
For windows [install this](https://github.com/coreybutler/nvm-windows).

### How to use nvm?

Before to run the project set the corresponding node version

``nvm use 0.12.9``

If you dont have that version, install before and finally execute the above command.

``nvm install 0.12.9``