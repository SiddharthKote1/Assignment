package org.kwala.assigment

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import org.kwala.assigment.R
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = { BottomBar() }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Image(
                painter = painterResource(R.drawable.backgroundimage),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                TopAppBar()
                Spacer(modifier=Modifier.padding(10.dp))
                TopCardsBar()
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(
                        top = 0.dp,
                        start = 12.dp,
                        end = 12.dp,
                        bottom = 16.dp
                    )
                ) {

                    item {
                        TopicSection(
                            "Most played topics",
                            listOf(
                                "Mammals" to R.drawable.mammals,
                                "Indian OTTs" to R.drawable.indianott,
                                "Spell Bee" to R.drawable.spellbee,
                                "Bollywood (IN)" to R.drawable.bollywood,
                                "Anime" to R.drawable.anime
                            )
                        )
                    }

                    item {
                        TopicSection(
                            "I dare you play these topics...",
                            listOf(
                                "Nature: Who am I" to R.drawable.nature,
                                "Death" to R.drawable.death,
                                "Phobias" to R.drawable.phob,
                                "Superstitions & Myths" to R.drawable.supert,
                                "Smallest" to R.drawable.smallest,
                                "-logies" to R.drawable.logies,
                                "Technology: Who am I" to R.drawable.technology,
                                "Psychology" to R.drawable.psychology,
                                "Longest,Biggest\nLargest" to R.drawable.longest,
                                "Geography: Where\nAm I?" to R.drawable.geog
                            )
                        )
                    }

                    item {
                        TopicSection(
                            "Language Zone",
                            listOf(
                                "Pronunciation Pitfalls" to R.drawable.pitfalls,
                                "Prepositions" to R.drawable.prepositions,
                                "Indian Corporate\nLingo" to R.drawable.lingo,
                                "Confusing\nHomophones" to R.drawable.homo,
                                "Spell bee" to R.drawable.bee,
                                "The Tharoor Connections" to R.drawable.connection
                            )
                        )
                    }
                    item {
                        TopicSection(
                            "States of India and how much do you know?",
                            listOf(
                                "Assam(IN)" to R.drawable.assam,
                                "Himachal Pradesh(IN)" to R.drawable.himachal,
                                "Tamil Nadu(IN)" to R.drawable.tamil,
                                "Tripura(IN)" to R.drawable.tripura,
                                "Rajasthan(IN)" to R.drawable.rajastan,
                                "Meghalaya" to R.drawable.meghalaya,
                                "Bihar & Jharkhand\n(IN)" to R.drawable.bihar,
                                "Mizoram(IN)" to R.drawable.mizoram,
                                "Odisha(IN)" to R.drawable.odisha,
                                "Jammu & Kashmir\n(IN)" to R.drawable.jk,
                                "Delhi(IN)" to R.drawable.delhi,
                                "Maharashtra(IN)" to R.drawable.maharashtra,
                                "Goa(IN)" to R.drawable.goa,
                                "Nagaland(IN)" to R.drawable.nagaland,
                                "Arunachal Pradesh(IN)" to R.drawable.arunachal,
                                "Andhra Pradesh &\nTelangana(IN)" to R.drawable.andrapradesh,
                                "Karnataka(IN)" to R.drawable.karnataka,
                                "Gujarat(IN)" to R.drawable.gujarat,
                                "Manipur(IN)" to R.drawable.manipur,
                                "Sikkim(IN" to R.drawable.sikkim,
                                "Haryana(IN)" to R.drawable.haryana,
                                "Punjab(IN)" to R.drawable.punjab,
                                "Uttarakhand & Uttar\nPradesh(IN)" to R.drawable.up,
                                "Madhya Pradesh(IN)" to R.drawable.madhya,
                                "Kerala(IN)" to R.drawable.kerala,
                                "West Bengal(IN)" to R.drawable.westbengal,
                                "Andaman & Nicobar\nIslands(IN)" to R.drawable.an,
                            )
                        )
                    }
                    item {
                        TopicSection(
                            "Nature: Breathe deep, appreciate the wild",
                            listOf(
                                "Aquatic Species" to R.drawable.aquatic,
                                "Birds" to R.drawable.birds,
                                "Mammals" to R.drawable.mammals,
                                "Nature" to R.drawable.nature,
                                "Animal kingdom" to R.drawable.animalkingdom
                            )
                        )
                    }
                    item {
                        TopicSection(
                            "Business World: Money talks, everyone listens",
                            listOf(
                                "Business(IN)" to R.drawable.business,
                                "Indian Unicorns" to R.drawable.unicorn,
                                "World of Startups" to R.drawable.startups,
                                "Finance World" to R.drawable.finance
                            )
                        )
                    }
                    item {
                        TopicSection(
                            "Science & Technology: Know the unknowns",
                            listOf(
                                "Innovations and\nInventions" to R.drawable.invention,
                                "General Chemistry" to R.drawable.generalchemistry,
                                "Human Body" to R.drawable.humanbody,
                                "Science and Technology" to R.drawable.startups,
                                "Computers & Internet" to R.drawable.computers,
                                "General Physics" to R.drawable.physics,
                                "Scientists & Inventors" to R.drawable.scientist,
                                "Universe" to R.drawable.universe,
                                "General Science" to R.drawable.science,
                                "Diseases" to R.drawable.diseases,
                            )
                        )
                    }
                    item {
                        TopicSection(
                            "India: Past & Present",
                            listOf(
                                "Literature(IN)" to R.drawable.literature,
                                "Historical Figures(IN)" to R.drawable.hisfigures,
                                "History(IN)" to R.drawable.indianhistory,
                                "Dance(IN)" to R.drawable.dance,
                                "Famous Personalities\n(IN)" to R.drawable.famperson,
                                "Historical Events(IN)" to R.drawable.hisevents,
                                "Authors & Poets" to R.drawable.authorspoets
                                )
                        )
                    }
                    item {
                        TopicSection(
                            "Entertainment..Entertainment..Entertainment",
                            listOf(
                                "Bollywood(IN)" to R.drawable.bollywood,
                                "Indian OTTs(IN)" to R.drawable.indianott,
                                "Regional film (IN)" to R.drawable.regfilms,
                                "Comics & Manga" to R.drawable.comics,
                                "Marvel Disney \nUniverse" to R.drawable.marvel,
                                "Actors(IN)" to R.drawable.actors,
                                "Films(IN)" to R.drawable.films,
                                "Anime" to R.drawable.anime,
                                "Global OTTs" to R.drawable.globalott
                            )
                        )
                    }
                    item {
                        TopicSection(
                            "Sports: Push limits, feel the thrill!",
                            listOf(
                                "Cricket" to R.drawable.cricket,
                                "Sports" to R.drawable.sports
                            )
                        )
                    }
                    item {
                        TopicSection(
                            "I Love My India!",
                            listOf(
                                "People & Culture(IN)" to R.drawable.peopleculture,
                                "Costumes(IN)" to R.drawable.costumes,
                                "Food & Beverages\n(IN)" to R.drawable.foodbeverage,
                                "Folks & Tribes(IN)" to R.drawable.tribe,
                                "Fascinating India" to R.drawable.fasindia,
                                "Forests,Sanctuaries, Flora(IN)" to R.drawable.forest,
                                "Festivals & Traditions\n(IN)" to R.drawable.festivalsindia,
                                "Mountains & Hills(IN)" to R.drawable.moutain,
                                "River, Lakes &\nOceans(IN)" to R.drawable.river,
                                "Places(IN)" to R.drawable.placesindia,
                                "Landmarks & Monuments\n(IN)" to R.drawable.landmarkmonu,
                                "Cities & Towns(IN)" to R.drawable.citytown,

                            )
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun TopAppBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .systemBarsPadding()
            .padding(start=8.dp,end=12.dp,top=12.dp,bottom=0.dp)
            .border(2.dp, Color(0xFFFFC107), RoundedCornerShape(14.dp))
            .background(
                Brush.linearGradient(
                    listOf(
                        Color(0xFF7A4A00),
                        Color(0xFF5A3600),
                        Color(0xFF3A2200)
                    )
                ),
                RoundedCornerShape(14.dp)
            )
            .padding(8.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(46.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFF0F3B3F))
                    .border(2.dp, Color(0xFF00E5FF), RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.avatarbg),
                    contentDescription = null,
                    modifier = Modifier.size(36.dp)
                )
            }

            // Stat cards
            StatCard("KP", "0", Modifier.weight(1f))
            StatCard("🪙", "5000", Modifier.weight(1f))
            StatCard("💎", "10", Modifier.weight(1f))
            Image(
                painter = painterResource(R.drawable.freebg),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
            Image(
                painter = painterResource(R.drawable.settingsfree),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}

@Composable
fun TopicCards(
    title: String,
    imageRes: Int,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .clickable { onClick() }
            .border(2.dp, Color(0xFF00E5FF), RoundedCornerShape(10.dp))
            .background(Color(0xFF0D2B4D))
            .padding(horizontal = 12.dp, vertical = 0.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Image(
                painter = painterResource(imageRes),
                contentDescription = null,
                modifier = Modifier.size(34.dp)
            )

            Text(
                text = title,
                color = Color.White,
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun TopCard(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .clickable { onClick() }
            .border(2.dp, Color(0xFF00E5FF), RoundedCornerShape(12.dp))
            .background(Color(0xFF0F3B3F), RoundedCornerShape(12.dp)),
        contentAlignment = Alignment.Center,
        content = content
    )
}

@Composable
fun StatCard(label: String, value: String, modifier: Modifier) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFF0F3B3F))
            .border(2.dp, Color(0xFF00E5FF), RoundedCornerShape(10.dp))
            .padding(vertical = 6.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(label, color = Color(0xFFFFC107))
        Text(value, color = Color.White, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun NeonActionCard(
    title: String,
    icon: Int
) {
    Box(
        modifier = Modifier
            .height(90.dp)
            .aspectRatio(1.4f)
            .clip(RoundedCornerShape(14.dp))
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF06143A),
                        Color(0xFF020A26)
                    )
                )
            )
            .border(
                width = 2.dp,
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF00E5FF),
                        Color(0xFF2979FF)
                    )
                ),
                shape = RoundedCornerShape(14.dp)
            )
            .padding(8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize()
        ) {

            // Top Icon
            Image(
                painter = painterResource(icon),
                contentDescription = null,
                modifier = Modifier.size(34.dp)
            )

            // Title
            Text(
                text = title,
                color = Color(0xFF00E5FF),
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                lineHeight = 14.sp
            )
        }
    }
}

@Composable
fun TopCards(title: String, icon: Int) {

    Box(
        modifier = Modifier.width(120.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(start = 22.dp) 
                .border(
                    2.dp,
                    Color(0xFF00E5FF),
                )
                .background(
                    Color(0xFF0A1B3D),
                ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                color = Color(0xFF00E5FF),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                lineHeight = 16.sp
            )
        }

        Image(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .align(Alignment.CenterStart)
                .offset(x = (-10).dp)
        )
    }
}
@Composable
fun TopCardsBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        TopCards("Daily\nQuiz", R.drawable.epicbg)
        TopCards("Today's\nTopic", R.drawable.quizbg)
        TopCards("Kwala\nExpress", R.drawable.expressbg)
    }
}

@Composable
fun TopicCard(title: String, image: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(end = 8.dp)
    ) {
        Card(
            modifier = Modifier.size(80.dp, 80.dp),
            border = BorderStroke(1.dp, Color(0xFF00E5FF)),
            shape = RectangleShape
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = title,
            color = Color.White,
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            minLines = 2,
            maxLines = 2,
            lineHeight = 14.sp,
            modifier = Modifier.width(80.dp)
        )
    }
}

@Composable
fun TopicSection(
    title: String,
    topics: List<Pair<String, Int>>
) {
    Column(modifier = Modifier.padding(top = 16.dp)) {

        Text(
            text = title,
            color = Color.Yellow,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        LazyRow(
            contentPadding = PaddingValues(start = 8.dp)
        ) {
            items(topics) { topic ->
                TopicCard(topic.first, topic.second)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}