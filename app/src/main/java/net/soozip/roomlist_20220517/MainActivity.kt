package net.soozip.roomlist_20220517

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import net.soozip.roomlist_20220517.adapters.RoomAdapter
import net.soozip.roomlist_20220517.datas.RoomData

class MainActivity : AppCompatActivity() {
        val mRoomList = ArrayList<RoomData>()

        lateinit var mAdapter : RoomAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            mRoomList.add(RoomData(8000, "강서구 어딘가1",4,"방2,거실1,화장실1"))
            mRoomList.add(RoomData(15000,"강서구 어딘가2",12,"방2,거실1,화장실1"))
            mRoomList.add(RoomData(7000,"강서구 어딘가3",-4,"방3,거실1,화장실1"))
            mRoomList.add(RoomData(8000,"강서구 어딘가4",5,"방4,거실1,화장실1"))
            mRoomList.add(RoomData(5000,"강서구 어딘가5",-1,"방5,거실1,화장실1"))
            mRoomList.add(RoomData(2000,"강서구 어딘가6",61,"방6,거실1,화장실1"))
            mRoomList.add(RoomData(20000,"강서구 어딘가7",8,"방7,거실1,화장실1"))
            mRoomList.add(RoomData(900,"강서구 어딘가8",9,"방8,거실1,화장실1"))
            mRoomList.add(RoomData(18000,"강서구 어딘가9",7,"방9, 거실1,화장실1"))
            mAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
            roomListView.adapter = mAdapter


            roomListView.setOnItemClickListener{adapterView, view, position, l->

                val clickedItem = mRoomList[position]

                val myIntent = Intent(this, ViewRoomActivity::class.java)

                myIntent.putExtra("room", clickedItem)

                startActivity(myIntent)

            }

        }

    }