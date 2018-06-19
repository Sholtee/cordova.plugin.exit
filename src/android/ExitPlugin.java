/********************************************************************************
*  ExitPlugin.java                                                              *
*  Author: Denes Solti                                                          *
********************************************************************************/
package org.solti.cordova.plugin.exit;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;

public final class ExitPlugin extends CordovaPlugin {
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {		
		if (!action.equals("exit")) return false;
		
		try {
			final Activity activity = this.cordova.getActivity();
	
			if (args.length() > 0) {
				final Intent intent = new Intent();
				
				intent.putExtra("RetVal", args.getString(0));
				activity.setResult(Activity.RESULT_OK, intent);
			}
			
			activity.finish();		
			callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, 0));
		} catch (Exception e) {
			callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, 1));
		}
		
		return true;
	}
}