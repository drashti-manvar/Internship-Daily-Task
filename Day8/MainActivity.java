package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView  recyclerView=findViewById(R.id.rc);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        movieData[] MovieData = new movieData[]{
          new movieData("Jira Rice","who doesn't love a recipe that only 5 minutes to pull together and Rice & oue delicious soup together in a basic recipe that's easy to costomize. See the recipe tips foe guidlines How to make a recipe prep even easier,and for other variation","Rs.300",R.drawable.jira),
        new movieData("Sizzler","A dwlightful sizzler recipe. pan fried potato cutles topped with lot of veggies,drizzle with a sauce of your choice.","Rs.350",R.drawable.sizler ),
        new movieData("Undhiyu","Undhiyu is a gujarati mixed vegetable dish that is a regional specialities of surat,gujarat.","Rs.300",R.drawable.undhiyu ),
        new movieData("Vegatable Panner","Heat oil in skillet on medium. Add chilly,ginger paste, garlic,Cook 15 sec, Add peppers and onions..","Rs.300",R.drawable.vegpaneer ),
        new movieData("Noodles","A delicious noodles dish flavour with chilly & ginger, and made with quern pieces","Rs.200",R.drawable.noodle),
                new movieData("Veg Manchurian","Veg Manchurian is an addictive Indo-Chinese dish made with wisps of vegetables formed into dumplings and dunked into a sauce that explodes with hot, sweet, sour and salty flavors.","Rs.150",R.drawable.manchurian),
        new movieData("Cheese Sandwich","Cheese sandwich is a simple and basic sandwich made by placing cheese in between 2 buttered slices of bread. These are either grilled or toasted.","Rs.120",R.drawable.chess),
                new movieData( "Burger","A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled","Rs.140",R.drawable.burger),
        new movieData("Pizza","This vegetarian pizza recipe will delight vegetarians and carnivores alike. It's fresh and full of flavor, featuring cherry tomatoes, artichoke, bell pepper, olives, red chilly.","Rs.250",R.drawable.p),



        } ;

        movieAdapter Movie = new movieAdapter(MovieData,MainActivity.this);
        recyclerView.setAdapter(Movie);
    }
}