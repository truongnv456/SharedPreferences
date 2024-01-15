package navigationcomponentturtorialcom.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvInfo = findViewById<TextView>(R.id.tv_info)

        var nameUsers: MutableSet<String> = DataLocalManager.getNameUsers()
        tvInfo.setText(nameUsers.toString())
    }
}