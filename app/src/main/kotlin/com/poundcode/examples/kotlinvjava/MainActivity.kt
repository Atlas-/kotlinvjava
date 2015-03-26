package com.poundcode.examples.kotlinvjava

/**
 * this does all the view work for us
 */
import kotlinx.android.synthetic.activity_main.*;

public class MainActivity : android.support.v7.app.ActionBarActivity() {

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.poundcode.examples.kotlinvjava.R.layout.activity_main)
        this.clickToReverse.setOnClickListener { this.reverseString() }
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.poundcode.examples.kotlinvjava.R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: android.view.MenuItem?): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item!!.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == com.poundcode.examples.kotlinvjava.R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    fun MainActivity.reverseString() {
        val reversed = this.reverse.getText().toString().reverse()
        this.output.setText(reversed)
        this.reverse.setText("")
    }
}