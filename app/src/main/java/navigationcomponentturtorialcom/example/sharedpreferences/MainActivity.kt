package navigationcomponentturtorialcom.example.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (!DataLocalManager.getFirstInstalled()) {
//            Toast.makeText(this, "First installed app", Toast.LENGTH_LONG).show()
//            DataLocalManager.setFirstInstalled(true)
//        }

        var nameUsers: MutableSet<String> = HashSet<String>()
        nameUsers.add("Tin Coder")
        nameUsers.add("Chi Pheo")
        nameUsers.add("Thi No")

        DataLocalManager.setNameUsers(nameUsers)

        val btnNextScreen = findViewById<Button>(R.id.btn_next_screen)
        btnNextScreen.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}