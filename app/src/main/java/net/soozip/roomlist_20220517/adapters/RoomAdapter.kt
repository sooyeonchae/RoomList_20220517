package net.soozip.roomlist_20220517.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import net.soozip.roomlist_20220517.R
import net.soozip.roomlist_20220517.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>) : ArrayAdapter<RoomData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!! //row가 리스트뷰의 한 줄에 해당하는 그림.(View 타입)

        //화면에 뿌려지기 전에, row내부를 수정하자.
        //데이터/반영UI태그 준비.
        val data = mList[position]
        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtDongnaeAndFloor = row.findViewById<TextView>(R.id.txtDongnaeAndFloor)
        val txtDesc = row.findViewById<TextView>(R.id.txtDesc)

        //실제 연결
        txtPrice.text = data.getPrice(data.price)
        txtDongnaeAndFloor.text = data.dongnea+", "+data.getFloor(data.floor)
        txtDesc.text = data.desc

        //만들어진 row의 그림이 리스트 뷰에 뿌려짐.


        return row
    }
}