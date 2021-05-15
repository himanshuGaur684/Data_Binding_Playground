package gaur.himanshu.august.databindingplayground

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


@BindingAdapter(value = ["urlImage", "placeHolder", "error"], requireAll = false)
fun urlToImage(view: ImageView, url: String, placeHolder: Int, error: Int) {
    val requestOptions = RequestOptions().placeholder(placeHolder).error(error)
    Glide.with(view).setDefaultRequestOptions(requestOptions).load(url).into(view)
}