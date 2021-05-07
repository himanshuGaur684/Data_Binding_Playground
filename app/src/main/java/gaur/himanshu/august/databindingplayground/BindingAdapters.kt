package gaur.himanshu.august.databindingplayground

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("urlImage")
fun urlToImage(view: ImageView, url: String) {

    Glide.with(view).load(url).into(view)

}