package com.dberekdar.runtimecompare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val runbutton = findViewById<Button>(R.id.runButton)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val arrayLength = findViewById<EditText>(R.id.arrayLengthInput)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val resultsTextView1 = findViewById<TextView>(R.id.resultTextview1)
        val resultsTextView2 = findViewById<TextView>(R.id.resultTextView2)

        runbutton.setOnClickListener {

            val randomInt = Random()
            //val array = IntArray(seekBar.progress * 1000)
            val array = IntArray(seekBar.progress * 1000 )
            for (i in array.indices) {
                array[i] = Math.abs(randomInt.nextInt()) % 100
            }


            resultsTextView.text =  "Insertion Sort: " + aCompare.insertionSort(array).toString()
            resultTextview1.text = "Bubble Sort: " + aCompare.bubbleSort(array).toString()
            resultTextView2.text = "Selection Sort: " + aCompare.selectionSort(array).toString()









        }
    }
}

