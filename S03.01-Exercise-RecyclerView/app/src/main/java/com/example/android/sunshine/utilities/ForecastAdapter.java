package com.example.android.sunshine.utilities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.android.sunshine.R;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;
    class ForecastAdapterViewHolder extends  RecyclerView.ViewHolder{
        public TextView mWeatherTestView;

        public ForecastAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            mWeatherTestView= (TextView) itemView.findViewById(R.id.tv_weather_data);
        }

    }

    @NonNull
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem= R.layout.forecast_list_item;
        LayoutInflater inflater =LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately= false;
        View view = inflater.inflate(layoutIdForListItem,viewGroup,
                shouldAttachToParentImmediately);
        ForecastAdapterViewHolder  viewHolder = new ForecastAdapterViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ForecastAdapterViewHolder forecastAdapterViewHolder, int i) {
        String weatherForThisDay = mWeatherData[i];
        forecastAdapterViewHolder.mWeatherTestView.setText(weatherForThisDay);










    }

    @Override
    public int getItemCount() {

        if (mWeatherData==null)return 0;
        return mWeatherData.length;
    }

    public void setWeatherData (String[] weatherData){
        mWeatherData = weatherData;
        notifyDataSetChanged();

    }
}
