    //Declarations
    private lateinit var  tvTitle : TextView
    private lateinit var btnAddItem : Button
    private lateinit var btnScreenTwo : Button
    private lateinit var btnExit : Button
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class AddPackaging : AppCompatActivity() {

    val packingList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_packaging)

        val btnAddItem = findViewById<Button>(R.id.btnAddItem)
        val btnScreenTwo = findViewById<Button>(R.id.btnScreenTwo)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnAddItem.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Add to Packing List")

            val input = EditText(this)
            input.hint = "Enter item name"
            builder.setView(input)

            builder.setPositiveButton("Add") { dialog, _ ->
                val item = input.text.toString()
                packingList.add(item)
            }

            builder.setNegativeButton("Cancel") { dialog, _ ->
                dialog.cancel()
            }

            builder.show()
        }

        btnScreenTwo.setOnClickListener {
            val intent = Intent(this, ScreenTwo::class.java)
            startActivity(intent)
        }

        btnExit.setOnClickListener {
            finish()
        }
    }
}