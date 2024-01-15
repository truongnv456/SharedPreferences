package navigationcomponentturtorialcom.example.sharedpreferences

import android.content.Context

class DataLocalManager() {
    companion object {
        private var instance: DataLocalManager? = null
        private const val PREF_FIRST_INSTALL = "PRE_FIRST_INSTALL"
        private const val PREF_NAME_USERS = "PREF_NAME_USERS"

        fun init(context: Context) {
            instance = DataLocalManager()
            instance?.mySharedPreferences = MySharedPreferences(context)
        }

        fun getInstance(): DataLocalManager {
            if (instance == null) {
                instance = DataLocalManager()
            }
            return instance!!
        }

        fun setFirstInstalled(isFirst: Boolean) {
            DataLocalManager.getInstance().mySharedPreferences?.putBooleanValue(
                PREF_FIRST_INSTALL,
                isFirst
            )
        }

        fun getFirstInstalled(): Boolean {
            return DataLocalManager.getInstance().mySharedPreferences!!.getBooleanValue(
                PREF_FIRST_INSTALL
            )
        }

        fun setNameUsers(nameUsers: MutableSet<String>) {
            DataLocalManager.getInstance().mySharedPreferences?.putStringSetValue(
                PREF_NAME_USERS,
                nameUsers
            )
        }

        fun getNameUsers(): MutableSet<String> {
            return DataLocalManager.getInstance().mySharedPreferences?.getStringSetValue(
                PREF_NAME_USERS
            )!!
        }
    }

    private var mySharedPreferences: MySharedPreferences? = null
}