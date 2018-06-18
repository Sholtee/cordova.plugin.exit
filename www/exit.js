/********************************************************************************
*  exit.js                                                                      *
*  Author: Denes Solti                                                          *
********************************************************************************/
const exec = require('cordova/exec');

module.exports = {
  exit: function() {
    exec(null, null, 'Exit', 'exit', Array.from(arguments));
  }
};
