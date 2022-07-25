package com.shady.recycleviewapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import bi.group.nsi_app.R
import bi.group.nsi_app.model.Order

class UserRecycleViewAdapter(private val userList: List<Order>) : RecyclerView.Adapter<UserAdapter>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycle_view_item, parent,false)
        return UserAdapter(view)
    }
    override fun onBindViewHolder(holder: UserAdapter, position: Int) {
        val user = userList[position]
        holder.creation_date_view.text = user.creation_date
        holder.order_id_view.text = user.order_id
        holder.user_1c_view.text = user.user_1c
        holder.db_name_view.text = user.db_name
        holder.order_name_view.text = user.order_name
        holder.type_view.text = user.type
        holder.status_value_view.text = user.status_value
        holder.responce_value_view.text = user.responce_value
    }
    override fun getItemCount(): Int {
        return userList.size
    }
}

class UserAdapter(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
    val order_id_view: TextView = itemView.findViewById(R.id.tv_order_id)
    val creation_date_view: TextView = itemView.findViewById(R.id.tv_creation_date)
    val user_1c_view: TextView = itemView.findViewById(R.id.tv_user_1c)
    val db_name_view: TextView = itemView.findViewById(R.id.tv_db_name)
    val order_name_view: TextView = itemView.findViewById(R.id.tv_order_name)
    val type_view: TextView = itemView.findViewById(R.id.tv_type)
    val status_value_view: TextView = itemView.findViewById(R.id.tv_status_value)
    val responce_value_view: TextView = itemView.findViewById(R.id.tv_responce_value)
    init {
        itemView.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        Log.e("swd", "test");
        //Toast.makeText(itemView.context, "${idTextView.text} clicked", Toast.LENGTH_SHORT).show()
    }
}

