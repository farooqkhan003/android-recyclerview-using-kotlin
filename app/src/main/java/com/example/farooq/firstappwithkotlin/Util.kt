package com.example.farooq.firstappwithkotlin

import android.content.Context
import android.widget.Toast

/**
 * Created by Farooq on 9/11/2017.
 */
fun Context.myToast(message:String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
