package com.gg.ndkproject

/**
 *  Creator : GG
 *  Time    : 2017/11/6
 *  Mail    : gg.jin.yu@gmail.com
 *  Explain :
 */
class NativeHelper {

   companion object {
       init {
           System.loadLibrary("native-lib")
       }
   }
}