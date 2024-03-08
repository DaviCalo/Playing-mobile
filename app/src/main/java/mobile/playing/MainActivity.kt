package mobile.playing

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import mobile.playing.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonsign.setOnClickListener(this)
        binding.buttonCad.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if(view.id == R.id.buttonsign){
            val intentE = Intent(this, MainActivity2::class.java)
            startActivity(intentE)
        }
    }


}