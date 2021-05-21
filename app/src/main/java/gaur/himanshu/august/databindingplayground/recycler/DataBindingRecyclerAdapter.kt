package gaur.himanshu.august.databindingplayground.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import gaur.himanshu.august.databindingplayground.databinding.ViewHolderBinding

class DataBindingRecyclerAdapter : RecyclerView.Adapter<DataBindingRecyclerAdapter.MyViewHolder>() {


    var list = mutableListOf<String>()


    fun setContentList(list: MutableList<String>) {
        this.list = list
        notifyDataSetChanged()
    }


    inner class MyViewHolder(val viewDataBinding: ViewHolderBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DataBindingRecyclerAdapter.MyViewHolder {
        val binding = ViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return this.list.size
    }

    override fun onBindViewHolder(holder: DataBindingRecyclerAdapter.MyViewHolder, position: Int) {

        holder.viewDataBinding.text = this.list[position]

    }

}