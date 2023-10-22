package com.example.cursoandroid.doglist

import com.google.gson.annotations.SerializedName

data class DogsResponse(@SerializedName("status") var status:String,
         @SerializedName("images") var images:List<String>)
