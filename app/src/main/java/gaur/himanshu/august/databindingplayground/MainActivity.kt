package gaur.himanshu.august.databindingplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import gaur.himanshu.august.databindingplayground.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.placeholder = R.drawable.ic_placeholder
        binding.error = R.drawable.ic_error

        binding.url =
            "http://1.bp.blogspot.com/-B0WT_f1kqL8/Ub0pQUt9h7I/AAAAAAAAAn8/byzZbyzOyQ8/s1600/nexussamsungkindlefire.jpg"


        // image url using in this video are
        // http://3.bp.blogspot.com/-7-KmADvPxkY/UgitVrQvgiI/AAAAAAAAASo/lgZiaL6RfnY/s1600/Android+OS+for+Smartphone+Download+Free.jpg
        // https://bgr.com/wp-content/uploads/2021/05/google-entertainment-space-android-tablets.jpg?resize=300  ( for showing the placrholder images )
        // http://1.bp.blogspot.com/-B0WT_f1kqL8/Ub0pQUt9h7I/AAAAAAAAAn8/byzZbyzOyQ8/s1600/nexussamsungkindlefire.jpg ( for showing the error image )

    }
}