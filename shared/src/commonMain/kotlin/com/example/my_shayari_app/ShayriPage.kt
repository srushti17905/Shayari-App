package com.example.my_shayari_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen

val aankheinShayari = arrayOf(
    "तेरी आँखों की ये मस्तियाँ, दिल को छू लेने वाली हैं 💖\nइनकी झलक में बसी है, वो बात जो कह नहीं सकते।",
    "आँखों की चमक बता देती है, दिल की बात को ✨\nहर एक नजर में छुपा होता है, इश्क का राज़।",
    "तेरी आँखों की गहराई में, खो जाना चाहता हूँ 🌌\nतेरी नज़रों की जादूगरी, बस मैं खुद को तुझसे जोड़ना चाहता हूँ।",
    "आँखों के बिना ये दिल कुछ नहीं 😔\nतेरी आँखों में सुकून मिलता है, जैसे शाम की चाँदनी में चाँद।",
    "तेरे बिना ये पल जैसे अधूरे हैं, आँखों से जब तू दूर होती है 🕒\nतेरी यादें ही आँखों में बसे हैं, जो दिल को हर बार बहलाती हैं।",
    "तेरी आँखों की मस्ती ने, कर दिया है दिल को बेताब 🥰\nइनकी झलक में मिलती है, मुझे खुद से खास।",
    "आँखों के बिना ये दिल नहीं मानता 💔\nतेरे नयनों की बातों को, मेरे दिल ने सच्चा माना है।",
    "तेरे नयनों की यह दीवानगी, दिल को छू जाती है 🌟\nतू सामने हो, तो फिर आँखें खुद को भी नजर-अंदाज कर जाती हैं।",
    "तेरे आँखों के ख्वाबों में खो जाता हूँ 💭\nइनकी रौशनी में दिल को सुकून पा जाता हूँ।",
    "तेरी आँखें जब मुस्कुराती हैं 😍\nलगता है जैसे सारा जहाँ हंस रहा है, इनकी हँसी में खो जाने की, मेरे दिल की बस यही आस है।"
)

class ShayriPage(var shayri: String) : Screen {
    @Composable
    override fun Content() {

        Column(
            modifier = Modifier.fillMaxSize().background(color = star.purple)
        ) {
            Box(
                modifier = Modifier.fillMaxSize().background(color = star.purple).weight(1f)
            ) {
                Text(
                    text = "Aankhein Shayari", fontSize = 30.sp, color = Color.White
                )
            }

            LazyColumn(
                modifier = Modifier.fillMaxSize().weight(1f).background(color = star.purple).padding(30.dp)
            ) {
                    items(1) { i ->
                        Surface (modifier = Modifier.fillMaxSize()
                            .weight(1f)
                            .background(color = Color.White)
                            .padding(30.dp)
                        )
                        {
                            Text(text = aankheinShayari[2] , fontSize = 20.sp , color = Color.Black)
                        }
                    }
            }
        }
    }
}


/* Surface(modifier = Modifier.fillMaxSize(), color = star.purple)
 {
     Text(text = shayri, fontSize = 40.sp)

     Surface (modifier = Modifier.fillMaxSize())
     {
         Text(text = aankheinShayari[2] , fontSize = 30.sp )
     }
 }*/
