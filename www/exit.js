/********************************************************************************
*  exit.js                                                                      *
*  Author: Denes Solti                                                          *
********************************************************************************/
const exec = require('cordova/exec');

module.exports = {
  exit: function(retVal) {
    exec(null, null, 'Exit', 'exit', [retVal]);
  }
};
