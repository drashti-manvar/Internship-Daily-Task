package com.example.gridlayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class movieAdapter extends  RecyclerView.Adapter<movieAdapter.ViewHolder> {

    private movieData[] md;
    private Context context;

    public movieAdapter(movieData[] md, Context context) {
        this.md = md;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.movie_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        movieData movieDataList = md[position];
         
        holder. imageView.setImageResource(movieDataList.getImage());
        holder.mtitle .setText(movieDataList.getIname());
        holder. mdesc.setText(movieDataList.getDesc());
        holder. mprice.setText(movieDataList.getIprice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context, movieDataList.getIname(),Toast.LENGTH_SHORT).show();
            

            
                Intent intent= new Intent(context,DetailActivity.class);
                intent.putExtra("img1",movieDataList.get(ViewHolder.class,gettdes());
                intent.putExtra("tdes",movieDataList.get(ViewHolder.getmovieAdapter().gettdes());
                context.startActivities(intent);



            }
        });



    }

    @Override
    public int getItemCount() {
        return movieData.in;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView mtitle, mdesc, mprice;
        CardView mcard;


            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.img);
                mtitle = itemView.findViewById(R.id.tvTitle);
                mdesc = itemView.findViewById(R.id.tvdes);
                mprice=itemView.findViewById(R.id.price);
            }
            }
        }

