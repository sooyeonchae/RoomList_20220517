package net.soozip.roomlist_20220517.datas

import java.io.Serializable
import java.text.DecimalFormat

class RoomData(
    val price: Int,
    val dongnea: String,
    val floor: Int,
    val desc: String) : Serializable {


    fun getPrice(price: Int) : String {

        //방법2
        if (price < 10000){
            return "%,d".format(price)
        }else{
            val uk = this.price / 10000
            val rest = this.price % 10000

            if (rest == 0){
                return "${uk}억"
            }else{
                return "${uk}억 ${"%,d".format(rest)}"
            }

        }
    }

    fun getFloor(floor: Int) : String {
        if (floor <= -1 ){
            return "지하${floor*-1}층"
        }else if (floor > 10){
            return "${floor}층 이상"
        }else{
            return "${floor}층"
        }
    }
}