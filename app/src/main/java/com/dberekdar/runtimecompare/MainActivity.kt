package com.dberekdar.runtimecompare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.sql.Types.INTEGER
import java.util.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val runbutton = findViewById<Button>(R.id.runButton)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val arrayLengthinput = findViewById<EditText>(R.id.arrayLengthInput)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val resultsTextView1 = findViewById<TextView>(R.id.resultTextview1)
        val resultsTextView2 = findViewById<TextView>(R.id.resultTextView2)
        val resultsTextView3 = findViewById<TextView>(R.id.resultTextView3)

        runbutton.setOnClickListener {
        val content = arrayLengthinput.getText().toString()
            textView.setText(content)

            val randomInt = Random()

            if (arrayLengthinput != null){
                val array = IntArray(content.toInt())
                for (i in array.indices) {
                    array[i] = Math.abs(randomInt.nextInt()) % 100
                }
                resultsTextView.text = "Insertion Sort O(n²): " + aCompare.insertionSort(array).toString()
                resultTextview1.text = "Bubble Sort O(n²): " + aCompare.bubbleSort(array).toString()
                resultTextView2.text = "Selection Sort O(n²):  " + aCompare.selectionSort(array).toString()
                resultTextView3.text = "Merge Sort O(nLog(n)): " + aCompare.mergeSort(array, 0, array.size - 1).toString()

            } else {
                val array = IntArray(seekBar.progress * 100)
                for (i in array.indices) {
                    array[i] = Math.abs(randomInt.nextInt()) % 100
                }

                resultsTextView.text = "Insertion Sort O(n²): " + aCompare.insertionSort(array).toString()
                resultTextview1.text = "Bubble Sort O(n²): " + aCompare.bubbleSort(array).toString()
                resultTextView2.text = "Selection Sort O(n²):  " + aCompare.selectionSort(array).toString()
                resultTextView3.text = "Merge Sort O(nLog(n)): " + aCompare.mergeSort(array, 0, array.size - 1).toString()

            }









        }
    }
}

