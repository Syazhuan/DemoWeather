package sg.edu.rp.c346.id22043300.demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Weather> weatherList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);

        this.parent_context = context;
        layout_id = resource;
        this.weatherList = objects;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView area=rowView.findViewById(R.id.tvArea);
        TextView forecast=rowView.findViewById(R.id.tvForecast);

        // Obtain the Android Version information based on the position
        Weather weather = weatherList.get(position);

        // Set values to the TextView to display the corresponding information
        area.setText("Area: "+weather.getArea());
        forecast.setText(weather.getForecast());

        return rowView;
    }

}

