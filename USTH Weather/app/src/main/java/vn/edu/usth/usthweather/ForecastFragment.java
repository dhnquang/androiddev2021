package vn.edu.usth.usthweather;
import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vi = inflater.inflate(R.layout.fragment_forecast, container, false);
        vi.setBackgroundColor(Color.parseColor("#ffffff"));
        return vi;
    }
}