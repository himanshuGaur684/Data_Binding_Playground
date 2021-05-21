package gaur.himanshu.august.databindingplayground.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Car(
    name: String,
    companyName: String,

    ) : BaseObservable() {


    @get:Bindable
    var name: String = name
        set(value) {
            field = value
            notifyChange()
        }

    @get:Bindable
    var companyName: String = companyName
        set(value) {
            field = value
            notifyChange()
        }

    override fun toString(): String {
        return " Car : ${name}  \n CompanyName : ${companyName}"
    }

}