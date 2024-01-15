package navigationcomponentturtorialcom.example.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class MySharedPreferences(private var mContext: Context) {
    companion object {
        private const val MY_SHARED_PREFERENCES = "MY_SHARE_PREFERENCES"
    }

    fun putBooleanValue(key: String, value: Boolean) {
        val sharedPreferences: SharedPreferences = mContext.getSharedPreferences(
            MY_SHARED_PREFERENCES, Context.MODE_PRIVATE
        )
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }

    fun getBooleanValue(key: String): Boolean {
        val sharedPreferences: SharedPreferences = mContext.getSharedPreferences(
            MY_SHARED_PREFERENCES, Context.MODE_PRIVATE
        )
        return sharedPreferences.getBoolean(key, false)
    }

    fun putStringValue(key: String, value: String) {
        val sharedPreferences: SharedPreferences = mContext.getSharedPreferences(
            MY_SHARED_PREFERENCES, Context.MODE_PRIVATE
        )
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun getStringValue(key: String): String? {
        val sharedPreferences: SharedPreferences = mContext.getSharedPreferences(
            MY_SHARED_PREFERENCES, Context.MODE_PRIVATE
        )
        return sharedPreferences.getString(key, "")
    }

    fun putStringSetValue(key: String, values: MutableSet<String>) {
        val sharedPreferences: SharedPreferences = mContext.getSharedPreferences(
            MY_SHARED_PREFERENCES, Context.MODE_PRIVATE
        )
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putStringSet(key, values)
        editor.apply()
    }

    fun getStringSetValue(key: String): MutableSet<String> {
        val sharedPreferences: SharedPreferences = mContext.getSharedPreferences(
            MY_SHARED_PREFERENCES, Context.MODE_PRIVATE
        )
        var valueDefault: MutableSet<String> = HashSet()
        return sharedPreferences.getStringSet(key, valueDefault)!!
    }
}