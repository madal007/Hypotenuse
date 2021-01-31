package th.ac.su.alongkorn.hypotenuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val A_val = findViewById<EditText>(R.id.Avalue)
        val B_val = findViewById<EditText>(R.id.Bvalue)
        val Solve = findViewById<Button>(R.id.SolveButt)
        val Result = findViewById<TextView>(R.id.Cresult)


        Solve.setOnClickListener(){

            var A:Double = A_val.text.toString().toDouble()
            var B:Double = B_val.text.toString().toDouble()
            var C:Double = 0.0

            C = (A*A) + (B*B);
            C = sqrt(C);

            C.toString()

            Result.text = "C = $C"

        }
    }
}