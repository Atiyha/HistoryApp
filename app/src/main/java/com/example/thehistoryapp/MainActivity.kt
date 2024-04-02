package com.example.thehistoryapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private fun resetApp(){ //declaration of a private function
        val intent = Intent(this, MainActivity :: class.java) //creating an intent object
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK) //adding flags to intent
        startActivity(intent) //start activity specified in intent
        finish() //finishes the current activity
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnGen = findViewById<Button>(R.id.btnGen) //declaration of btnGen, Button
        val viewDisplay = findViewById<TextView>(R.id.viewDisplay) //declaration of TextView
        val edtAge: EditText = findViewById(R.id.edtAge) //declaration of EditText
        var people: String = " " //creating a variable as a string
        val btnClear = findViewById<Button>(R.id.btnClear) //declaration of btnClear, Button

        btnClear.setOnClickListener { resetApp() } //creating a new intent, and reset button

        btnGen.setOnClickListener {
            val edtAgeText = edtAge.text.toString() //declaration of variable as a string

            if (edtAgeText.isNotEmpty()) { //if statement if edtAge is empty
                val age = edtAgeText.toIntOrNull() //creating a variable to store edtAge
                if (age != null && age in 21..99) { //start of if for edtAge being in range or not being a whole number
                    if (age in 21..25) { //if statement for age being more than equal to 21 and less than equal to 25
                        people = "You entered the age ${edtAge.text}, which is around the age Aaliyah was when she passed away. Aaliyah was an actress and singer. Better known as the Princess of R&B."
                    } else { // start of else for age being out of 20 - 25 range
                        // Handle other age cases if needed
                        if (age in 26..29) { // if statement for age being more than equal to 26 and less than equal to 29
                            people =
                                "You entered the age ${edtAge.text}, which is around the age Avicii was when he passed away. Avicii was a record producer, Dj and song writer in the genres EDM, Progressive house and electro house."
                        } else { // start of else for age being out of 26 - 29 range
                            if (age in 30..35) { // if statement for age being more than equal to 30 and less than equal to 35
                                people =
                                    "You entered the age ${edtAge.text}, which is around the age as Princess Diana of Whales when she passed away. Princess Diana was a member of the British Royal family, and was the first wife of King Charles III."
                            } else { // start of else for age being out of 30 - 35 range
                                if (age in 36..39) { // if statement for age being more than equal 36 and less then equal to 39
                                    people =
                                        "You entered the age ${edtAge.text}, which is around the age Vincent Van Gogh was when he passed away. Vincent Van Gogh was a Dutch post-impressionist painter. Famous for his paintings of The Starry Night, Sunflowers and The Potato Eaters."
                                } else { // start of else for age being out of 36 - 39 range
                                    if (age in 40..45) { // if statement for age being more than equal to 40 and less than equal to 45
                                        people =
                                            "You entered the age ${edtAge.text}, which is around the age Chadwick Boseman was when he passed away. Chadwick was an American actor, famously known for his role in Marvel's Black Panther."
                                    } else { // start of else for age being out of 40 - 45 range
                                        if (age in 46..49) { // if statement for age being more than equal to 46 and less then equal to 49
                                            people =
                                                "You entered the age ${edtAge.text}, which is around the age John F Kennedy was when he passed away. JFK was the 35th President of the United States. He was the youngest American President to die."
                                        } else { // start of else for age being out of 46 - 49 range
                                            if (age in 50..55) { // if statement for age being more than equal to 50 and less than equal to 55
                                                people =
                                                    "You entered the age ${edtAge.text}, which is around the age Michael Jackson, better known as The King of Pop, was when he passed away. He is the most iconic musician of the 20th century."
                                            } else { // start of else for age being out of 50 - 55 range
                                                if (age in 56..59) { // if statement for age being more than equal to 56 and less than equal to 59
                                                    people =
                                                        "You entered the age ${edtAge.text}, which is around the age Abraham Lincoln was when he passed away. He was the 16th President of the United States. "
                                                } else { // start of else for age being out of 56 - 59 range
                                                    if (age in 60..65) { // if statement for age being more than equal to 60 and less than equal to 65
                                                        people =
                                                            "You entered the age ${edtAge.text}, which is around the age Theodore Roosevelt was when he passed away. He was the 26th President of the United States. "
                                                    } else { // start of else for age being out of 60 - 65 range
                                                        if (age in 66..69) { // if statement for age being more than equal to 66 and less than equal to 69
                                                            people =
                                                                "You entered the age ${edtAge.text}, which is around the age Akira Toriyama was when he passed away. Akira was a Japanese manga artist and character designer. Mainly known for his creation of Dragon Ball and Dr. Slump."
                                                        } else { // start of else for age being out of 66 - 69 range
                                                            if (age in 70..75) { // if statement for age being more than equal 70 and less than equal 75
                                                                people =
                                                                    "You entered the age ${edtAge.text}, which is around the age Louis Vuitton was when he passed away. He was a French fashion designer, businessman, and founder of the famous brand of leather goods."
                                                            } else { // start of else for age being out of 70 - 75 range
                                                                if (age in 76..79) { // if statement for age being more than equal 76 and less than equal 79
                                                                    people =
                                                                        "You entered the age ${edtAge.text}, which is around the age Albert Einstein was when he passed away. Einstein was a German-born theoretical physicist, known for developing the theory of relativity and his assistance in quantum mechanics."
                                                                } else { // start of else for age being out of 76 - 79 range
                                                                    if (age in 80..85) { // if statement for age being more than equal 80 and less than equal 85
                                                                        people =
                                                                            "You entered the age ${edtAge.text}, which is around the age P. T. Barnem was when he passed away. He was an American Showman, businessman and politician, remembered for founding the Barnem and Bailey Circus."
                                                                    } else { // start of else for age being out of 80 - 85 range
                                                                        if (age in 86..89) { // if statement for age being more than equal 86 and less than equal 89
                                                                            people =
                                                                                "You entered the age ${edtAge.text}, which is around the age Dr. Seuss was when he passed away. Dr. Seuss was an American children's author and cartoonist, most commonly known for his books, The Cat in The Hat, The Lorax and How the Grinch Stole Christmas."
                                                                        } else { // start of else for age being out of 86 - 89 range
                                                                            if (age in 90..95) { // if statement for age being more than equal 90 and less than equal 95
                                                                                people =
                                                                                    "You entered the age ${edtAge.text}, which is around the age Pablo Picasso was when he passed away. Picasso was a Spanish multi-media artist. He is one of the influential artists of the 20th century. "
                                                                            } else { // start of else for age being out of 90 - 95 range
                                                                                if (age in 96..99) { // if statement for age being more than equal 96 and less than equal to 99
                                                                                    people =
                                                                                        "You entered the age ${edtAge.text}, which is around the age former Queen, Elizabeth II was when she passed away. She was the Queen of the United Kingdom. Her reign over 70 years is the longest of any British Monarch."
                                                                                } //end of if statement for age being more than equal to 96 and less than equal to 99
                                                                            } // end of else for age being out of 90 - 95 range
                                                                        } // end of else for age being out of 85 - 89 range
                                                                    } // end of else for age being out of 80 - 85 range
                                                                } // end of else for age being out of 76 - 79 range
                                                            } // end of else for age being out of 70 - 75 range
                                                        } // end of else for age being out of 66 - 69 range
                                                    } // end of else for age being out of 60 - 65 range
                                                } // end of else for age being out of 56 - 59 range
                                            } // end of else for age being out of 50 - 55 range
                                        } // end of else for age being out of 46 - 49 range
                                    } // end of else for age being out of 40 - 45 range
                                } // end of else for age being out of 36 - 39 range
                            } // end of else for age being out of 30 - 35 range
                        } // end of else for age being out of 26 - 29 range
                    } // end of else for age being out of 20 - 25 range
                } else { //start of else for edtAge being out of range or not being a whole number
                    Toast.makeText(this@MainActivity, "Please enter an age between 20 and 100 ensuring it's an integer", Toast.LENGTH_LONG).show()
                } //end of else for edtAge being out of range or not being a whole number
            } else { //start of else for edtAge being empty
                Toast.makeText(this@MainActivity, "Please enter a age", Toast.LENGTH_LONG).show()
            } //end of else for edtAge being empty

            viewDisplay.text = people //display whatever is stored in variable people
        } // end of button

    }
}


