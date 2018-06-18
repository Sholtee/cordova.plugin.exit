/********************************************************************************
*  Exit.java                                                                    *
*  Author: Denes Solti                                                          *
********************************************************************************/
package org.solti.cordova.plugin.exit;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.app.Activity;

public final class ExitPlugin extends CordovaPlugin {
	protected void pluginInitialize() {}

	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {		
		if (!action.equals("exit")) false;
		
		try {
			final Activity activity = this.cordova.getActivity();
			final Intent intent = new Intent();
			
			intent.putExtra("RetVal", args.getString(0));
			
			activity.setResult(Activity.RESULT_OK, intent);
			activity.finish();
			
			callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, 0));
		} catch (Exception e) {
			callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, 1));
		}
		
		return true;
	}
}