/********************************************************************************
*  exit.js                                                                      *
*  Author: Denes Solti                                                          *
********************************************************************************/
var exec = require('cordova/exec');

module.exports = {
  exit: function() {
    exec(null, null, 'ExitPlugin', 'exit', Array.from(arguments));
  }
};
