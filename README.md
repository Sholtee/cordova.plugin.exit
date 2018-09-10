# Exit (PhoneGap/Cordova Plugin)

This plugin lets you close your app programmatically by implementing `navigator.app.exit()` method. Unlike similar plugins here you can pass custom data on terminate.

### Platform Support

This plugin supports PhoneGap/Cordova apps running on Android.

## Installation

#### Automatic Installation using PhoneGap/Cordova CLI (Android)

`cordova plugin add @sholtee/cordova-plugin-exit`

## Usage
```js
const userData = {
  field: "kerekesfacapa"
};
navigator.app.exit(userData);
```