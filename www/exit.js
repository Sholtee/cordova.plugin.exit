/********************************************************************************
*  exit.js                                                                      *
*  Author: Denes Solti                                                          *
********************************************************************************/
var exec = require('cordova/exec');

module.exports = {
  exit: function() {
    exec(null, null, 'Exit', 'exit', Array.from(arguments));
  }
};
