package net.soozip.roomlist_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room.*
import net.soozip.roomlist_20220517.datas.RoomData

class ViewRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room)

        val roomData = intent.getSerializableExtra("room") as RoomData

        txtPrice.text = roomData.getPrice(roomData.price)
        txtDesc.text = roomData.desc
        txtDongnae.text = roomData.dongnea
        txtFloor.text = roomData.floor.toString()


    }
}